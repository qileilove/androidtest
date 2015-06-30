package com.example.lqi.menuoption;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by lqi on 6/30/15.
 */
public class ThirdActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.third_layout);
    }
}
