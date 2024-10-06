package com.example.btnclick_bgchange;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button b1 = findViewById(R.id.btn1);
        Button b2 = findViewById(R.id.btn2);
        Button b3=findViewById(R.id.btn3);
        ConstraintLayout cl=findViewById(R.id.main);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cl.setBackgroundColor(Color.CYAN);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cl.setBackgroundColor(Color.MAGENTA);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cl.setBackgroundColor(Color.YELLOW);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}