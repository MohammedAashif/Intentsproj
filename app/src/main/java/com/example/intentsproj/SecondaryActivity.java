package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.view.v;

public class secondactivity extends AppCompatActivity {


       private EditText Number1;
       private EditText Number2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);

        Number1(EditText)findviewid{}

        string name = getIntent().gettringExtra(name:"name");
        Toast.makeText(context:this,name,Toast.LENGTH_LONG).show();
    }

    private void show() {
    }

    public void number2(View view) {

        if (view.getId() == R.id.name)
            finish();

        }
    }


    public void calculator(view v){




    }



}

