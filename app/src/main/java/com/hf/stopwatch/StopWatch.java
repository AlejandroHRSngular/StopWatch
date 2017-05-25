package com.hf.stopwatch;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class StopWatch extends Activity {
    private int seconds = 0;
    private boolean running;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop_watch);
    }

    public void onClickStart(View view){
        running = true;
        runTimer(seconds,running,view);
    }

    public void onClickPause(View view){
        running = false;

    }

    public void onClickReset(View view){
        running = false;
        seconds = 0;
    }

    private void runTimer(int seconds, boolean running, View view){
        TextView timeView = (TextView) findViewById(R.id.time_view);
        
    }
}
