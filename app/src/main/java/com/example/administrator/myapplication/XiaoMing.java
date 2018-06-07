package com.example.administrator.myapplication;

import android.util.Log;

/**
 * Creater: liguoying
 * Time: 2018/6/6 0006 17:45
 * 小明，真正的想买Mac的对象 = 目标对象 = 被代理的对象 = 委托类
 * 实现抽象目标对象的接口
 */

public class XiaoMing implements Subject {
    private static final String TAG = "_XiaoMing";

    @Override
    public void buybuybuy() {
        Log.e(TAG, "buybuybuy: 小明要买Mac");
    }
}
