package com.example.accelerometersensorapp_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SensorEventListener {
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
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sensorManager.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        float xValue = event.values[0];
        float yValue = event.values[1];
        float zValue = event.values[2];

        int x = (int)xValue;
        int y = (int)yValue;
        int z = (int)zValue;

        String xInString = Integer.toString(x);
        String yInString = Integer.toString(y);
        String zInString = Integer.toString(z);

        xaxis.setText(xInString);
        yaxis.setText(yInString);


        if (x != 0 || y != 0 || z != 0) {
            mediaPlayer.start();
            imageView.setImageResource(R.drawable.on);
        } else {
            mediaPlayer.pause();
            imageView.setImageResource(R.drawable.off);
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}