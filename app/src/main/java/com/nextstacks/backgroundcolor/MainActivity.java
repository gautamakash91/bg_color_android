package com.nextstacks.backgroundcolor;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    private SeekBar redSeekbar;
    private SeekBar greenSeekbar;
    private SeekBar blueSeekbar;

    private Button btnReset;

    private LinearLayout llroot;

    private int redcolor = 0;
    private int greencolor = 0;
    private int bluecolor = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        redSeekbar = findViewById(R.id.seekbar_red);
        greenSeekbar = findViewById(R.id.seekbar_green);
        blueSeekbar = findViewById(R.id.seekbar_blue);

        llroot = findViewById(R.id.ll_root);

        btnReset = findViewById(R.id.btn_reset);

        redSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                redcolor = (int) Math.round(progress * 2.55);
                changeBackgroundColor();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        greenSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                greencolor = (int) Math.round(progress * 2.55);
                changeBackgroundColor();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        blueSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                bluecolor = (int) Math.round(progress * 2.55);
                changeBackgroundColor();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redcolor = 0;
                greencolor = 0;
                bluecolor = 0;
                redSeekbar.setProgress(0);
                blueSeekbar.setProgress(0);
                greenSeekbar.setProgress(0);
                changeBackgroundColor();
            }
        });

        changeBackgroundColor();
    }

    private void changeBackgroundColor(){
        llroot.setBackgroundColor(Color.argb(255,redcolor,greencolor,bluecolor));
    }

}