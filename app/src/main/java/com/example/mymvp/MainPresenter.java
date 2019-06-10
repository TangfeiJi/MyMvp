package com.example.mymvp;

import android.util.Log;

public class MainPresenter extends BasePresenter<MainView> {


    public void getData(String pager) {


//        请求网络之类的
        getView().getDataSueeess("我是服务器接口返回的数据");

        Log.e("1111111111",pager);

    }

}
