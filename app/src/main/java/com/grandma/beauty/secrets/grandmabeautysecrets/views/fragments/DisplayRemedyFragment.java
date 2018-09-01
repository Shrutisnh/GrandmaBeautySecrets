package com.grandma.beauty.secrets.grandmabeautysecrets.views.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.grandma.beauty.secrets.grandmabeautysecrets.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link DisplayRemedyFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link DisplayRemedyFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DisplayRemedyFragment extends Fragment {

    private static final String ARG_BODY_INDEX = "bodyIndex";
    private static final String ARG_ISSUE_INDEX = "issueIndex";


    private int bodyIndex;
    private int issueIndex;

    private OnFragmentInteractionListener mListener;

    public DisplayRemedyFragment() {

    }



    public static DisplayRemedyFragment newInstance(int bodyIndex, int issueIndex) {
        DisplayRemedyFragment fragment = new DisplayRemedyFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_BODY_INDEX, bodyIndex);
        args.putInt(ARG_ISSUE_INDEX, issueIndex);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            bodyIndex = getArguments().getInt(ARG_BODY_INDEX);
            issueIndex = getArguments().getInt(ARG_ISSUE_INDEX);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.display_remedy_view, container, false);
        ViewPager viewPager = view.findViewById(R.id.vp_displayRemedy);

        return inflater.inflate(R.layout.display_remedy_view, container, false);
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

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
