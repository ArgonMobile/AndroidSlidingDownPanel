package com.argonware.slidingdownpanel.demo;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.Window;

import com.argonware.slidingdownpanel.SlidingDownPanelLayout;

public class DemoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_down_demo);

        SlidingDownPanelLayout layout = (SlidingDownPanelLayout) findViewById(R.id.sliding_layout);
        layout.setSliderFadeColor(Color.argb(128, 0, 0, 0));
        layout.setParallaxDistance(100);

        layout.setPanelSlideListener(new SlidingDownPanelLayout.PanelSlideListener() {
            @Override
            public void onPanelSlide(View panel, float slideOffset) {
            }

            @Override
            public void onPanelOpened(View panel) {
            }

            @Override
            public void onPanelClosed(View panel) {
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.demo, menu);
        return true;
    }

}
