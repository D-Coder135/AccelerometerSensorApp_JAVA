package com.example.accelerometersensorapp_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    MediaPlayer mediaPlayer;
    SensorManager sensorManager;
    Sensor sensor;
    TextView xaxis, yaxis, zaxis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        xaxis =  findViewById(R.id.textView);
        yaxis = findViewById(R.id.textView2);
        zaxis = findViewById(R.id.textView3);
        mediaPlayer = MediaPlayer.create(this, R.raw.thunder);
        sensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
    }
}