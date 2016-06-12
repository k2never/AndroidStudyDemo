package com.k2never.androidstudydemo.androidlifecycle;

import android.net.Uri;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;

import com.k2never.androidstudydemo.R;

public class FirstActivity extends AppCompatActivity implements InnerFragment.OnFragmentInteractionListener{
    public static final String TAG = "AndroidLifeCycle";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Log.i(TAG, "onCreate...     The activity is being created.");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i(TAG, "onStart...      The activity is about to become visible.");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i(TAG, "onResume...     The activity has become visible (it is now \"resumed\").");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i(TAG, "onPause...      Another activity is taking focus (this activity is about to be \"paused\").");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i(TAG, "onStop...       The activity is no longer visible (it is now \"stopped\")");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i(TAG, "onDestroy...    The activity is about to be destroyed.");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);

        Log.i(TAG, "onSaveInstanceState...");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        Log.i(TAG, "onRestoreInstanceState...");
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
