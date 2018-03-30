package com.genzouw.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText textName = this.findViewById(R.id.textName);
        final TextView labelGreeting = this.findViewById(R.id.labelGreeting);

        Button buttonHello = this.findViewById(R.id.buttonHello);
        buttonHello.setAllCaps(false);
        buttonHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("android-helloworld", "Hello button clicked!");
                String message = "";
                if (!textName.getText().toString().trim().equals("")) {
                    message = "Hello, " + textName.getText() + ".";
                }
                labelGreeting.setText(message);
            }
        });

        Button buttonClear = this.findViewById(R.id.buttonClear);
        buttonClear.setAllCaps(false);
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("android-helloworld", "Clear button clicked!");
                textName.setText("");
                labelGreeting.setText("");
            }
        });
    }
}
