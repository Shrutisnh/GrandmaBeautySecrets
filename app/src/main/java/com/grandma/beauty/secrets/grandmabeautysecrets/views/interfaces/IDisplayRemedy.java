package com.grandma.beauty.secrets.grandmabeautysecrets.views.interfaces;

import com.grandma.beauty.secrets.grandmabeautysecrets.model.Remedy;

public interface IDisplayRemedy extends IBaseView {
     void hostFragment();
     Remedy[] getRemedyList(int bodyIndex, int issueIndex);
     Object getBodyIssueRemedyObject(int bodyIssue);
}
