package com.tower.simpleread.homePage;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tower.simpleread.JavaBean.DoubanMomentNews;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class DouBanFragment extends Fragment implements DoubanContract.View{

    public static DouBanFragment newInstance() {
        return new DouBanFragment();
    }
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public DouBanFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return null;
    }

    @Override
    public void showError() {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void stopLoading() {

    }

    @Override
    public void showResults(ArrayList<DoubanMomentNews.posts> list) {

    }

    @Override
    public void showPickDialog() {

    }

    @Override
    public void setPresenter(ZhiHuContract.Presenter presenter) {

    }

    @Override
    public void initView(View view) {

    }
}
