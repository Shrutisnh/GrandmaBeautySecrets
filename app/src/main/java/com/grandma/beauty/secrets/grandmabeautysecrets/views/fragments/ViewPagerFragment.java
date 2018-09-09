package com.grandma.beauty.secrets.grandmabeautysecrets.views.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.grandma.beauty.secrets.grandmabeautysecrets.R;
import com.grandma.beauty.secrets.grandmabeautysecrets.presenter.HomeScreenPresenter;
import com.grandma.beauty.secrets.grandmabeautysecrets.views.activities.HomeScreenActivity;
import com.grandma.beauty.secrets.grandmabeautysecrets.views.adapters.CustomListAdapter;
import com.grandma.beauty.secrets.grandmabeautysecrets.views.interfaces.RecyclerViewClickListener;


public class ViewPagerFragment extends Fragment implements RecyclerViewClickListener{

    private static final String ARG_PARAM1 = "page";
    private static final String ARG_PARAM2 = "title";

    private int page;
    private String title;

    private OnFragmentInteractionListener mListener;

    public ViewPagerFragment(){

    }


    public static ViewPagerFragment newInstance(int pager, String title) {
        ViewPagerFragment fragment = new ViewPagerFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_PARAM1,pager);
        bundle.putString(ARG_PARAM2,title);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            page = getArguments().getInt(ARG_PARAM1);
            title = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_view_pager,container,false);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);

        CustomListAdapter adapter = new CustomListAdapter(getActivity(),getListToDisplay(page),this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        recyclerView.setAdapter(adapter);
        return view;
    }

    private String[] getListToDisplay(int page){
        String[] list;
        switch(page){
            case 0:
                list = getResources().getStringArray(R.array.EyesIssues);
                break;
            case 1:
                list = getResources().getStringArray(R.array.Face);
                break;
            case 2:
                list = getResources().getStringArray(R.array.Hair);
                break;
            case 3:
                list = getResources().getStringArray(R.array.ArmsFeet);
                break;
            case 4:
                list = getResources().getStringArray(R.array.Skin);
                break;
           default:
               list = getResources().getStringArray(R.array.EyesIssues);
        }
        return list;
    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
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

    @Override
    public void recyclerViewListClicked(View v, int position) {
        HomeScreenPresenter presenter = ((HomeScreenActivity)getActivity()).getPresenter();
        presenter.setDisplayRemedyList(position);
    }


    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }


}
