package com.grandma.beauty.secrets.grandmabeautysecrets.views.activities;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.widget.RecyclerView;

import com.grandma.beauty.secrets.grandmabeautysecrets.R;
import com.grandma.beauty.secrets.grandmabeautysecrets.presenter.BasePresenter;
import com.grandma.beauty.secrets.grandmabeautysecrets.presenter.HomeScreenPresenter;
import com.grandma.beauty.secrets.grandmabeautysecrets.views.interfaces.IHomeView;

public class HomeScreenActivity extends BaseActivity implements IHomeView{
    private TabLayout tabLayout;
    HomeScreenPresenter homePresenter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tabLayout = findViewById(R.id.tabLayout);
        homePresenter = new HomeScreenPresenter(this);
        tabLayout.addOnTabSelectedListener(new OnTabClick());
        recyclerView = findViewById(R.id.recyclerView);
    }

    @Override
    public int getActivityLayout() {
        return R.layout.activity_home_screen;
    }

    @Override
    protected BasePresenter onCreateActivityPresenter() {
        return homePresenter;
    }

    @Override
    public void displayListOfOptions() {

    }
    class OnTabClick implements TabLayout.OnTabSelectedListener{
        @Override
        public void onTabSelected(TabLayout.Tab tab) {
            homePresenter.onTabSelected(tab.getPosition());
        }

        @Override
        public void onTabReselected(TabLayout.Tab tab) {

        }

        @Override
        public void onTabUnselected(TabLayout.Tab tab) {

        }
    }
}
