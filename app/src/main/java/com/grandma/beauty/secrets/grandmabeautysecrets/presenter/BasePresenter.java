package com.grandma.beauty.secrets.grandmabeautysecrets.presenter;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.view.View;

import com.grandma.beauty.secrets.grandmabeautysecrets.views.activities.BaseActivity;
import com.grandma.beauty.secrets.grandmabeautysecrets.views.interfaces.IBaseView;

public class BasePresenter {
    private IBaseView baseView;
    private BaseActivity baseActivity;

    public BasePresenter(IBaseView baseView){
        this.baseView = baseView;
    }

    public void onCreate(BaseActivity baseActivity){
       this.baseActivity = baseActivity;
    }


    }