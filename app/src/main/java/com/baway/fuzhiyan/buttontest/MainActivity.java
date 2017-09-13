package com.baway.fuzhiyan.buttontest;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.baway.fuzhiyan.buttontest.R.id.btn;

public class MainActivity extends AppCompatActivity implements TextWatcher {
    private EditText edit1, edit2;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = (EditText) findViewById(R.id.edit1);
        edit2 = (EditText) findViewById(R.id.edit2);
        button = (Button) findViewById(btn);
        button.setEnabled(false);
        edit1.addTextChangedListener(this);
        edit2.addTextChangedListener(this);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "111", Toast.LENGTH_SHORT).show();
            }
        });

    }


    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        button.setEnabled(false);


    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {

        if ((edit1.getText().toString() == null || !edit1.getText().toString().equals("")) && (edit2.getText().toString() == null || !edit2.getText().toString().equals(""))) {
            button.setEnabled(true);
        } else {
            button.setEnabled(false);
        }

    }
}
