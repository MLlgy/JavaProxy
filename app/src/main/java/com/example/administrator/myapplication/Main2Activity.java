package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // 1. 创建调用处理器类对象
        DynamicProxy DynamicProxy = new DynamicProxy();

        // 2. 创建目标对象对象
        XiaoMing mXiaoMing = new XiaoMing();

        // 3. 创建动态代理类 & 对象：通过调用处理器类对象newProxyInstance（）
        // 传入上述目标对象对象
        Subject mSubject = (Subject) DynamicProxy.newProxyInstance(mXiaoMing);

        // 4. 通过调用动态代理对象方法从而调用目标对象方法
        // 实际上是调用了invoke（），再通过invoke（）里的反射机制调用目标对象的方法
        mSubject.buybuybuy();
        // 以上代购为小成代购Mac

        // 以下是代购为小何代购iPhone
        XiaoHong mBuyer2 = new XiaoHong();
        Subject Buyer2_DynamicProxy = (Subject) DynamicProxy.newProxyInstance(mBuyer2);
        Buyer2_DynamicProxy.buybuybuy();



    }
}

