package com.example.collegeapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LeaveApplicationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leave_application);

        // Set up ImageView variables for icons
        ImageView icon1 = findViewById(R.id.icon1);
        ImageView icon2 = findViewById(R.id.icon2);
//        ImageView icon3 = findViewById(R.id.icon3);
//        ImageView icon4 = findViewById(R.id.icon4);
//        ImageView icon5 = findViewById(R.id.icon5);
//        ImageView icon6 = findViewById(R.id.icon6);

        // Set click listeners for icons
        icon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle icon 1 click
                Toast.makeText(LeaveApplicationActivity.this, "Icon 1 clicked", Toast.LENGTH_SHORT).show();
            }
        });

        icon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle icon 2 click
                Toast.makeText(LeaveApplicationActivity.this, "Icon 2 clicked", Toast.LENGTH_SHORT).show();
            }
        });

        // Repeat similarly for other icons (icon3, icon4, icon5, icon6)
    }
}
