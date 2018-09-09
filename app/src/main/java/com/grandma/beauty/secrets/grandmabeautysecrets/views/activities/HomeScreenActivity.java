package com.grandma.beauty.secrets.grandmabeautysecrets.views.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

import com.grandma.beauty.secrets.grandmabeautysecrets.R;
import com.grandma.beauty.secrets.grandmabeautysecrets.constants.AppConstants;
import com.grandma.beauty.secrets.grandmabeautysecrets.presenter.BasePresenter;
import com.grandma.beauty.secrets.grandmabeautysecrets.presenter.HomeScreenPresenter;
import com.grandma.beauty.secrets.grandmabeautysecrets.views.adapters.ViewPagerAdapter;
import com.grandma.beauty.secrets.grandmabeautysecrets.views.fragments.ViewPagerFragment;
import com.grandma.beauty.secrets.grandmabeautysecrets.views.interfaces.IHomeView;

public class HomeScreenActivity extends BaseActivity implements IHomeView, ViewPagerFragment.OnFragmentInteractionListener {

    HomeScreenPresenter homePresenter;
    ViewPager viewPager;
    ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewPager = findViewById(R.id.vpPager);
        adapter = new ViewPagerAdapter(HomeScreenActivity.this, getSupportFragmentManager());
        homePresenter.setTabStyle();
    }

    @Override
    public int getActivityLayout() {
        return R.layout.activity_home_screen;
    }

    @Override
    protected BasePresenter onCreateActivityPresenter() {
        homePresenter = new HomeScreenPresenter(this);
        return homePresenter;
    }

    @Override
    public HomeScreenPresenter getPresenter() {
        return homePresenter;
    }

    @Override
    public void setTabStyle() {
        viewPager.setAdapter(adapter);
        TabLayout tabLayout = findViewById(R.id.tl_parts);
        tabLayout.setupWithViewPager(viewPager, true);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void setMenuActionShare() {
        //TODO: Set below details for this application
//        Intent shareIntent = new Intent(Intent.ACTION_VIEW);
//        Uri.Builder uriBuilder = Uri.parse("https://play.google.com/store/apps/details")
//                .buildUpon()
//                .appendQueryParameter("id", "com.example.android")
//                .appendQueryParameter("launch", "true");
//
//        shareIntent.setData(uriBuilder.build());
//        shareIntent.setPackage("com.grandma.beauty.secrets.grandmabeautysecrets");
//        startActivity(shareIntent);

    }

    @Override
    public void displayIssuesRemedyList(int issueIndexId) {
        Intent displayRemediesIntent = new Intent(this, DisplayRemediesActivity.class);
        int bodyIndex = viewPager.getCurrentItem();
        displayRemediesIntent.putExtra(AppConstants.BODY_INDEX, bodyIndex);
        displayRemediesIntent.putExtra(AppConstants.ISSUE_INDEX, issueIndexId);
        startActivity(displayRemediesIntent);

    }

    @Override
    public void setMenuActionRate() {
//TODO: write code for rating app on play store
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_share:
                homePresenter.setMenuActionShare();
                break;
            case R.id.action_rate:
                homePresenter.setMenuActionRate();
                break;
            default:
        }
        return super.onOptionsItemSelected(item);
    }
}
