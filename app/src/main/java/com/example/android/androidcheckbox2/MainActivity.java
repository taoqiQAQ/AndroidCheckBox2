package com.example.android.androidcheckbox2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CheckBox cb1 = (CheckBox) findViewById(R.id.checkbox01);
        final CheckBox cb2 = (CheckBox) findViewById(R.id.checkbox02);
        final CheckBox cb3 = (CheckBox) findViewById(R.id.checkbox03);
        Button bt = (Button) findViewById(R.id.Button01);
        final EditText et = (EditText) findViewById(R.id.EditText01);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = "你的选择是：";
                et.setText("");
                if (cb1.isChecked()) {
                    result = result + "唱歌 ";
                }
                if (cb2.isChecked()) {
                    result = result + "游泳 ";
                }
                if (cb3.isChecked()) {
                    result = result + "写java ";
                }
                et.setText(result.toString().trim());
            }
        });

    }
}
