package com.example.lightzero.studentforem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnSubmit;
    EditText edtText;
    TextView inputTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialization
        btnSubmit= findViewById(R.id.submitBtn);
        edtText=findViewById(R.id.inputEdtTxt);
        inputTxt=findViewById(R.id.outputTxt);

        //button click listener
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set a text to text view
                inputTxt.setText("This is programmatically set");
            }
        });
    }
}
