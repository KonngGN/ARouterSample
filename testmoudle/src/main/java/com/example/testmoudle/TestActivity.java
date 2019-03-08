package com.example.testmoudle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;

@Route(path = "/test/main2")
public class TestActivity extends AppCompatActivity {


    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        mTextView = findViewById(R.id.tv_test_num);
        mTextView.setText(String.valueOf(Constant.NUM));
    }


    public void clickbutton(View view) {
        if (view.getId() == R.id.button1) {
            Constant.NUM = Constant.NUM+1;
        } else {
            Constant.NUM = Constant.NUM-1;
        }
        mTextView.setText(String.valueOf(Constant.NUM));

    }
}
