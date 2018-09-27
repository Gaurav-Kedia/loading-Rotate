package com.gaurav.loadingrotate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imv;
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imv = (ImageView) findViewById(R.id.imageView);
        imv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imv.animate().rotation(imv.getRotation()- 720).start();
            }
        });
    }
}
