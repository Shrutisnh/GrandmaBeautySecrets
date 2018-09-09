package com.grandma.beauty.secrets.grandmabeautysecrets.presenter;

import com.grandma.beauty.secrets.grandmabeautysecrets.views.activities.BaseActivity;
import com.grandma.beauty.secrets.grandmabeautysecrets.views.interfaces.IBaseView;

public class BaseActivityPresenter extends BasePresenter {

    private BaseActivity baseActivity;

    public BaseActivityPresenter(IBaseView baseView){
        super(baseView);
    }

    @Override
    public void onCreate(BaseActivity baseActivity) {
        super.onCreate(baseActivity);
    }
}
