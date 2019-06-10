package com.example.mymvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends BaseActivity<MainView,MainPresenter>implements  MainView {

private TextView tv_text;
    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter();
    }

    @Override
    protected int provideContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    public void initData() {
        super.initData();
        tv_text=findViewById(R.id.tv_text);
//        在这请求数据增加请求参数
        mPresenter.getData("我是请求参数1111");
    }

    @Override
    public void getDataSueeess(String data) {
        tv_text.setText(data);

    }
}
