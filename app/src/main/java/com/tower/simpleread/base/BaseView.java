package com.tower.simpleread.base;

import android.view.View;

/**
 * Created by Tower on 2017/4/17.
 */

public interface BaseView<T> {

    /**
     * 为View设置presenter
     * @param presenter
     */
    void setPresenter(T presenter);

    /**
     * 初始化界面控件
     * @param view
     */
    void initView(View view);
}
