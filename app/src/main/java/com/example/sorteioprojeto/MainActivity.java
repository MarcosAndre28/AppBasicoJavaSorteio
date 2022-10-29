package com.example.sorteioprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView tvResult;
    private Button btPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = findViewById(R.id.tvResult);
        btPlay = findViewById(R.id.btPlay);

        btPlay.setOnClickListener(v -> raffle());
    }

    private void raffle(){
        int number = new Random().nextInt(11);
        tvResult.setText("O número selecionado foi: " + number);
    }

}