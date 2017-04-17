package com.tower.simpleread.base;

/**
 * Created by Tower on 2017/4/17.
 */

public interface BasePresenter {

    /**
     * 获取数据并改变界面显示，
     * 在todo-mvp的项目调用机制为
     * fragment的onResume()方法中
     */
    void start();
}
