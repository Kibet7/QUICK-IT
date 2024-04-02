package com.example.quick;

import android.annotation.SuppressLint;
import android.os.Bundle;
//import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editTextText;
    Button firstLevelButton, secondLevelButton, thirdLevelButton, fourthLevelButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing views
        editTextText = findViewById(R.id.editTextText);
        firstLevelButton = findViewById(R.id.btnFirstLevel);
        secondLevelButton = findViewById(R.id.btnSecondLevel);
        thirdLevelButton = findViewById(R.id.btnThirdLevel);
        fourthLevelButton = findViewById(R.id.btnFourthLevel);

        // Setting onClickListeners
        firstLevelButton.setOnClickListener(v -> {
            // Perform action for first level button click
        });

        secondLevelButton.setOnClickListener(v -> {
            // Perform action for second level button click
        });

        thirdLevelButton.setOnClickListener(v -> {
            // Perform action for third level button click
        });

        fourthLevelButton.setOnClickListener(v -> {
            // Perform action for fourth level button click
        });
    }
}
