package com.example.android.Lab5_2;

import android.os.Bundle;
import android.support.v7.app.*;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowAlert(View view) {
        AlertDialog.Builder myAlertBuilder =
                new AlertDialog.Builder(MainActivity.this);
        myAlertBuilder.setTitle(R.string.alert_title);
        myAlertBuilder.setMessage(R.string.alert_message);
        myAlertBuilder.setPositiveButton(R.string.ok_button,
                (dialog, which) -> Toast.makeText(getApplicationContext(),
                        R.string.pressed_ok,
                        Toast.LENGTH_SHORT).show());
        
        myAlertBuilder.setNegativeButton(R.string.cancel_button,
                (dialog, which) -> {
                    Toast.makeText(getApplicationContext(),
                            R.string.pressed_cancel,
                            Toast.LENGTH_SHORT).show();
                });
        myAlertBuilder.show();
    }
}
