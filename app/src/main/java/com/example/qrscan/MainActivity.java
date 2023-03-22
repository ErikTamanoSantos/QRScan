package com.example.qrscan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static String message = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView qrContent = findViewById(R.id.qrContent);
        Button scan_button = findViewById(R.id.scan_button);

        qrContent.setText(MainActivity.message);
        scan_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ScanActivity.class);
                startActivity(intent);
            }
        });
    }
}