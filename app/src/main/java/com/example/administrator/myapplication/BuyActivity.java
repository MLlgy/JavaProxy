package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BuyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);
        XiaoMing mXiaoMing = new XiaoMing();
        ForginerBuyer mBuyer = new ForginerBuyer(mXiaoMing);
        mBuyer.buybuybuy();
        /**
         E/_ForginerBuyer: buybuybuy: 代购开始购买
         E/_XiaoMing: buybuybuy: 小明要买Mac
         E/_ForginerBuyer: buybuybuy: 代购结束购买
         */
    }
}
