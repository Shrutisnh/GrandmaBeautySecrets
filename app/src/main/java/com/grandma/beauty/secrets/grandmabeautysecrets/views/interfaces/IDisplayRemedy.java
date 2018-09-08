package com.grandma.beauty.secrets.grandmabeautysecrets.views.interfaces;

import com.grandma.beauty.secrets.grandmabeautysecrets.model.Remedy;

import java.util.List;

public interface IDisplayRemedy extends IBaseView {
     void hostFragment();
     List<Remedy> getRemedyList(int bodyIndex, int issueIndex);
     Object getBodyIssueRemedyObject(int bodyIssue);
}
