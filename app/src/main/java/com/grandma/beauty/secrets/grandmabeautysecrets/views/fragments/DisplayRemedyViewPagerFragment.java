package com.grandma.beauty.secrets.grandmabeautysecrets.views.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.grandma.beauty.secrets.grandmabeautysecrets.R;
import com.grandma.beauty.secrets.grandmabeautysecrets.model.Remedy;
import com.grandma.beauty.secrets.grandmabeautysecrets.presenter.DisplayRemediesPresenter;
import com.grandma.beauty.secrets.grandmabeautysecrets.views.activities.DisplayRemediesActivity;
import com.grandma.beauty.secrets.grandmabeautysecrets.views.adapters.DisplayRemedyViewPagerAdapter;

import java.util.List;


@SuppressWarnings("ALL")
public class DisplayRemedyViewPagerFragment extends Fragment {


    private OnFragmentInteractionListener mListener;
    private static final String BODY_INDEX = "bodyIndex";
    private static final String ISSUE_INDEX = "issueIndex";
    private int bodyIndex,issueIndex;
    DisplayRemediesPresenter displayRemediesPresenter;

    public DisplayRemedyViewPagerFragment() {
        // Required empty public constructor
    }

    public static DisplayRemedyViewPagerFragment newInstance(int bodyIndex, int issueIndex) {
        DisplayRemedyViewPagerFragment fragment = new DisplayRemedyViewPagerFragment();
        Bundle args = new Bundle();
        args.putInt(BODY_INDEX, bodyIndex);
        args.putInt(ISSUE_INDEX, issueIndex);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            bodyIndex = getArguments().getInt(BODY_INDEX,0);
            issueIndex = getArguments().getInt(ISSUE_INDEX,0);
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_display_remedy_view_pager,container,false);
        setUpToolBar(view);
        ViewPager viewPager = view.findViewById(R.id.vp_displayRemedy);
        List<Remedy> remedyList=((DisplayRemediesActivity)mListener).getRemedyList(bodyIndex,issueIndex);
        DisplayRemedyViewPagerAdapter displayRemedyViewPagerAdapter = new DisplayRemedyViewPagerAdapter(getActivity().getSupportFragmentManager(),bodyIndex,remedyList);
        viewPager.setAdapter(displayRemedyViewPagerAdapter);
        return view;
    }

    public void setUpToolBar(View view){
        Toolbar toolbar = view.findViewById(R.id.tb_Toolbar);
        if ((getActivity()) != null) {
            ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        }
        toolbar.setTitle(displayRemediesPresenter.getTitle(bodyIndex));
        toolbar.setSubtitle(displayRemediesPresenter.getIssueTitle(bodyIndex,issueIndex));
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        DisplayRemediesActivity displayRemediesActivity = (DisplayRemediesActivity)context;
        displayRemediesPresenter = (DisplayRemediesPresenter)displayRemediesActivity.getPresenter();
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
