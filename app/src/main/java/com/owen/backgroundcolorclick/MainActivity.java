package com.owen.backgroundcolorclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_black, tv_blue, tv_purple,tv_white;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findIds();

        tv_white.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                linearLayout.setBackgroundColor(getResources().getColor(android.R.color.white));

            }
        });

        tv_black.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                linearLayout.setBackgroundColor(getResources().getColor(android.R.color.black));
            }
        });
        tv_blue.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                linearLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
            }
        });
        tv_purple.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                linearLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
            }
        });

    }

    public void findIds()
    {
        linearLayout = (LinearLayout)findViewById(R.id.background_layout);
        tv_black = (TextView)findViewById(R.id.black_background);
        tv_blue = (TextView)findViewById(R.id.blue_backgroud);
        tv_white = (TextView)findViewById(R.id.white_background);
        tv_purple = (TextView)findViewById(R.id.yellow_background);
    }
}
