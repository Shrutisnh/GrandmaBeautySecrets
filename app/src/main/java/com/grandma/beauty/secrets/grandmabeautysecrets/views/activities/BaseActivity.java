package com.grandma.beauty.secrets.grandmabeautysecrets.views.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.grandma.beauty.secrets.grandmabeautysecrets.R;
import com.grandma.beauty.secrets.grandmabeautysecrets.presenter.BasePresenter;
import com.grandma.beauty.secrets.grandmabeautysecrets.views.interfaces.IBaseView;

public abstract class BaseActivity extends AppCompatActivity implements IBaseView {
    protected BasePresenter basePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getActivityLayout());
        basePresenter = onCreateActivityPresenter();
        if (basePresenter != null) {
            basePresenter.onCreate(this);
        }
    }

    public BasePresenter getPresenter() {
        return basePresenter;
    }

    public abstract int getActivityLayout();

    protected BasePresenter onCreateActivityPresenter() {
        return new BasePresenter(this);
    }
}
