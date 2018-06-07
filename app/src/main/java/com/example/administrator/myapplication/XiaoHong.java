package com.example.administrator.myapplication;

import android.util.Log;

/**
 * Creater: liguoying
 * Time: 2018/6/6 0006 17:46
 * 小何，真正的想买iPhone的对象 = 目标对象 = 被代理的对象
 * 实现抽象目标对象的接口
 */
public class XiaoHong implements Subject  {
    private static final String TAG = "_小红";
    @Override
    public void buybuybuy() {
        Log.e(TAG, "buybuybuy: 小红要买iPhone" );
    }

}
