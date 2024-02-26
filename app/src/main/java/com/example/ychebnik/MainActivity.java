package com.example.ychebnik;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private boolean isRed = true; // флаг для отслеживания текущего цвета

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button changeColorButton = findViewById(R.id.changeColorButton);

        changeColorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isRed) {
                    v.getRootView().setBackgroundColor(getResources().getColor(android.R.color.white)); // установка белого цвета фона
                } else {
                    v.getRootView().setBackgroundColor(getResources().getColor(android.R.color.holo_red_light)); // установка красного цвета фона
                }
                isRed = !isRed; // изменение флага цвета для следующего нажатия
            }
        });
    }
}
