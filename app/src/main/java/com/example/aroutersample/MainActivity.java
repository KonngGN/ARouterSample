package com.example.aroutersample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.testmoudle.TestService;

public class MainActivity extends AppCompatActivity {

    private TextView    mTextView;
    private TestService mNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = findViewById(R.id.text_1);
        mNavigation = (TestService) ARouter.getInstance().build("/test/numservice").navigation();
    }

    public void click1(View view) {
        ARouter.getInstance().build("/test/main2").navigation();
    }

    public void click2(View view) {
        mTextView.setText(mNavigation.getNum());
    }
}
