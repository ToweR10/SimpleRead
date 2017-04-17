package com.tower.simpleread.homePage;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tower.simpleread.JavaBean.ZhiHuHistory;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class GuoKrFragment extends Fragment implements ZhiHuContract.View{


    public GuoKrFragment() {
        // Required empty public constructor
    }

    public static ZhiHuFragment newInstance() {
        return new ZhiHuFragment();
    }
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
    public void showResults(ArrayList<ZhiHuHistory.StoriesBean> list) {

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
