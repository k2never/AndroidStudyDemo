package com.k2never.androidstudydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.k2never.androidstudydemo.androidlifecycle.FirstActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnActivityLifeCycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnActivityLifeCycle = (Button) findViewById(R.id.button_activity_lifecycle);

        initListen();
    }

    private void initListen() {
        mBtnActivityLifeCycle.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_activity_lifecycle:
                Intent intent = new Intent(this, FirstActivity.class);
                startActivity(intent);
                break;
            default:
        }

    }
}
