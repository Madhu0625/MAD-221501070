package com.example.experiment1;
import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textView);
        Button changeTextButton = findViewById(R.id.changeTextButton);
        changeTextButton.setOnClickListener(view -> {
            textView.setTextSize(32);
            textView.setTypeface(Typeface.SERIF, Typeface.ITALIC);
            textView.setText("Welcome!!");
            Toast.makeText(MainActivity.this, "Congratulations! Text Changed!", Toast.LENGTH_SHORT).show();
        });
    }
}






