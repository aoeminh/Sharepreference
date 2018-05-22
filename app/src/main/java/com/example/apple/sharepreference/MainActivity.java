package com.example.apple.sharepreference;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar ;
    private TextView volume_tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekBar =(SeekBar)this.findViewById(R.id.sb_volume);
        volume_tv=(TextView) this.findViewById(R.id.tv_volume_value);
        final int progressValue ;
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChangeValue;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangeValue = progress;
                volume_tv.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                String value = String.valueOf(progressChangeValue);
                Toast.makeText(MainActivity.this,"SeekBar value is: " +value ,Toast.LENGTH_LONG ).show();

            }
        });

    }
}
