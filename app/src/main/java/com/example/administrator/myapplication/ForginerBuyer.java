package com.example.administrator.myapplication;

import android.util.Log;

/**
 * Creater: liguoying
 * Time: 2018/6/7 0007 10:58
 * 真正进行操作的对象 代理对象
 */
public class ForginerBuyer implements Subject {
    private static final String TAG = "_ForginerBuyer";
    private Subject mSubject;

    public ForginerBuyer(Subject mSubject) {
        this.mSubject = mSubject;
    }

    @Override
    public void buybuybuy() {
        Log.e(TAG, "buybuybuy: 代购开始购买");
        mSubject.buybuybuy();
        Log.e(TAG, "buybuybuy: 代购结束购买");
    }
}
