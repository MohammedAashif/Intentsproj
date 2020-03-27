package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent = new Intent(this, secondactivity.class);
    }

    public void newuser(View view) {

        if (view.getId() == R.id.secondactivity) {
            intent.putExtra(name:"name",value:getString(R.string.Dhiva))
            startActivity(intent);

        }

    }
}
