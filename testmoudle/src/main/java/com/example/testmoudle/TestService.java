package com.example.testmoudle;

import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * @author : jiangnankong
 * @date : 3/8/19 11:43 AM
 * Description : 可以被其他模块实例化调用
 */
@Route(path = "/test/service")
public class TestService implements IProvider {


    @Override
    public void init(Context context) {
        Log.d("TestService", "init");
    }

    public String getNum() {
        return String.valueOf(Constant.NUM);
    }

}
