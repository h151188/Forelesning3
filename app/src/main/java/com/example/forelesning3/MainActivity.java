package com.example.forelesning3;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast toast = Toast.makeText(getApplicationContext(),
                R.string.toast,
                Toast.LENGTH_SHORT);

        toast.show();
    }

    public void changeColor(View view) {
        TextView textElement = (TextView) findViewById(R.id.colorChangeField);
        textElement.setTextColor(getResources().getColor(R.color.colorRed));
    }

    public void showTowns(View view) {
        String[] t = getResources().getStringArray(R.array.towns);

        for (int i = 0; i < t.length; i++) {
            Toast toaster = Toast.makeText(getApplicationContext(),
                    t[i],
                    Toast.LENGTH_SHORT);
            toaster.show();
        }
    }
}