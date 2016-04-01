package com.acadgild.balu.acd_an_session_3_assignment_1_main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView imageView;
    Button show_hide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        show_hide = (Button) findViewById(R.id.button);

        show_hide.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        if (imageView.getVisibility() == View.VISIBLE)
        {
            imageView.setVisibility(View.INVISIBLE);
            show_hide.setText(getResources().getString(R.string.button_show));
        }
        else
        {
            imageView.setVisibility(View.VISIBLE);
            show_hide.setText(getResources().getString(R.string.button_hide));
        }
    }
}
