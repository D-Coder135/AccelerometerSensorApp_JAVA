package com.example.accelerometersensorapp_java;

import androidx.appcompat.app.AppCompatActivity;

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
    }
}