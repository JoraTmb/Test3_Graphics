package com.alekseyb.testgraphics;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class ViewGraphicsActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(new MyView(this));
    }
}