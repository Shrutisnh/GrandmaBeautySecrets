package com.grandma.beauty.secrets.grandmabeautysecrets.views.fragments;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.grandma.beauty.secrets.grandmabeautysecrets.R;
import com.grandma.beauty.secrets.grandmabeautysecrets.constants.AppConstants;
import com.grandma.beauty.secrets.grandmabeautysecrets.model.Remedy;

import java.util.ArrayList;

public class DisplayRemedyFragment extends Fragment {

    private static final String ARG_BODY_INDEX = "bodyIndex";
    private static final String ARG_ISSUE_INDEX = "issueIndex";
    private int bodyIndex;
    private int issueIndex;
    private ArrayList<Remedy> remedyList;

    private OnFragmentInteractionListener mListener;

    public DisplayRemedyFragment() {

    }

    public static DisplayRemedyFragment newInstance(int bodyIndex, int issueIndex, ArrayList<Remedy> remedyList) {
        DisplayRemedyFragment fragment = new DisplayRemedyFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_BODY_INDEX, bodyIndex);
        args.putInt(ARG_ISSUE_INDEX, issueIndex);
        args.putSerializable(AppConstants.REMEDY_LIST, remedyList);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            bodyIndex = getArguments().getInt(ARG_BODY_INDEX);
            issueIndex = getArguments().getInt(ARG_ISSUE_INDEX);
            remedyList = (ArrayList<Remedy>) getArguments().getSerializable(AppConstants.REMEDY_LIST);
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.display_remedy_view, container, false);
        TextView tvTipTitle = view.findViewById(R.id.tv_tipTitle);
        tvTipTitle.setText(String.format("Tip %s/%s", issueIndex+1, remedyList.size()).toString());
        TextView tvProcedure = view.findViewById(R.id.tv_ProcedureDetail);
        TextView tvIngredientsList = view.findViewById(R.id.tv_IngredientList);
        StringBuilder stringBuilder = new StringBuilder();
        for (String ingredients: remedyList.get(issueIndex).getIngredients()) {
            stringBuilder.append(ingredients).append("\n");
        }
        tvIngredientsList.setText(stringBuilder.toString());
        tvProcedure.setText(remedyList.get(issueIndex).getProcedure());
        return view;
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
