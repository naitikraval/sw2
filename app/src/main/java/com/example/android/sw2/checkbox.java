package com.example.android.sw2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class checkbox extends AppCompatActivity {
    CheckBox sub1,sub2,sub3;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
        addListenerOnButtonClick();
    }

    public void addListenerOnButtonClick(){
        //Getting instance of CheckBoxes and Button from the activty_main.xml file
        sub1=(CheckBox)findViewById(R.id.checkBox1);
        sub2=(CheckBox)findViewById(R.id.checkBox2);
        sub3=(CheckBox)findViewById(R.id.checkBox3);
        submit=(Button)findViewById(R.id.button);


        submit.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                String strMessage = "";

                if (sub1.isChecked()) {
                    strMessage += "Sub1 ";
                }

                if (sub2.isChecked()) {
                    strMessage += "Sub2 ";
                }

                if (sub3.isChecked()) {
                    strMessage += "Sub3";
                }

                showTextNotification(strMessage);

            }
        });
    }


        public void showTextNotification(String msgToDisplay)
        {
            Toast.makeText(this, msgToDisplay, Toast.LENGTH_SHORT).show();
        }
}
