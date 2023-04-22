package com.partha.digitalcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //-----------------------------------------------------------------------------------
    TextView tvDisplay;
    Button buttonAdd,buttonSub,buttonReset;
    int count =0 ;

//-----------------------------------------------------------------------------------------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                tvDisplay=findViewById(R.id.tvDisplay);
                buttonAdd=findViewById(R.id.buttonAdd);
                buttonSub=findViewById(R.id.buttonSub);
                buttonReset=findViewById(R.id.buttonReset);


                //---------------------------------------------------------------------------

                buttonAdd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        count++;
                        tvDisplay.setText(""+count);
                    }
                });



                buttonSub.setOnClickListener(new View.OnClickListener() {
                     @Override
                     public void onClick(View view) {

                         count--;
                         tvDisplay.setText(""+count);
                     }
                });







                buttonReset.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {


                        count = 0;
                        tvDisplay.setText(""+count);
                    }
                });


















    }
}