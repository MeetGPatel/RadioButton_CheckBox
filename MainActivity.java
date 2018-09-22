package com.example.meet.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton radmale , radfemale;
    CheckBox chpizza , chpanipuri , chsamosa;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radmale = (RadioButton)findViewById(R.id.radmale);
        radfemale = (RadioButton)findViewById(R.id.radfemale);
        chpizza = (CheckBox)findViewById(R.id.chpizza);
        chpanipuri = (CheckBox)findViewById(R.id.chpanipuri);
        chsamosa = (CheckBox)findViewById(R.id.chsamosa);
        btn = (Button)findViewById(R.id.btn);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radmale.isChecked())
                {
                    Toast.makeText(MainActivity.this, "Male", Toast.LENGTH_SHORT).show();
                }
                if(radfemale.isChecked())
                {
                    Toast.makeText(MainActivity.this, "Fe Male", Toast.LENGTH_SHORT).show();
                }
                if(chpizza.isChecked())
                {
                    Toast.makeText(MainActivity.this, "Pizza", Toast.LENGTH_SHORT).show();
                }
                if(chpanipuri.isChecked())
                {
                    Toast.makeText(MainActivity.this, "Panipuri", Toast.LENGTH_SHORT).show();
                }
                if(chsamosa.isChecked())
                {
                    Toast.makeText(MainActivity.this, "Samosa", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
