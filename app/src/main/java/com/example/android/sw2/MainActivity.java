package com.example.android.sw2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    EditText ed1;
    Button but,but1;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Profile");
        getSupportActionBar().setIcon(R.drawable.ic_arrow_back_black_24dp);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        but = findViewById(R.id.test);
        but1 = findViewById(R.id.test1);
        tv = findViewById(R.id.tv1);
        ed1= findViewById(R.id.username_textfield);

        but.setOnClickListener(this);
        but1.setOnClickListener(this);

//        but.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String a;
//                a=ed1.getText().toString();
//                if(a.equals(""))
//                {
//                    Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
//                }
//                else {
//                    Toast.makeText(MainActivity.this, a, Toast.LENGTH_SHORT).show();
//                }
//
//            }
//        });
//
//        but1.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String a;
//                a=ed1.getText().toString();
//                if(a.equals(""))
//                {
//                   tv.setText("enter your name");
//                }
//                else {
//                   tv.setText(a);
//                }
//            }
//        });
    }

    @Override
    public void onClick(View v) {
        int item_id =v.getId();

        switch (item_id)
        {
            case R.id.test:

                String a;
                a=ed1.getText().toString();
                if(a.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, a, Toast.LENGTH_SHORT).show();
                }
                break;


            case R.id.test1:
                String a1;
                a1=ed1.getText().toString();
                if(a1.equals(""))
                {
                    tv.setText("enter your name");
                }
                else {
                    tv.setText(a1);
                }
                    break;
        }



    }
}
