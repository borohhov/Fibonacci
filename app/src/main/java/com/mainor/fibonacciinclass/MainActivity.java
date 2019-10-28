package com.mainor.fibonacciinclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Context context = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText inputEditText = findViewById(R.id.mainactivity_et_input);
        final Button goButton = findViewById(R.id.mainactivity_button);
        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int inputNumber = Integer.parseInt(inputEditText.getText().toString());
                if(inputNumber > 0){
                    //goButton.setText(String.valueOf(FibonacciGenerator.getFibonacciNums(inputNumber)));
                    startActivity(new Intent(context, RecyclerActivity.class).putExtra("Input", inputNumber));
                }
            }
        });
    }
}
