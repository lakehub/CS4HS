package com.example.Mystic;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    private CheckBox Juice,Yoghurt,Milk;
    private Button Buy;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Yoghurt=(CheckBox) findViewById(R.id.Yoghurt);
        Juice=(CheckBox) findViewById(R.id.Juice);
        Milk=(CheckBox)  findViewById(R.id.Milk);
       // Buy=(CheckBox) findViewById(R.id.button);
        addlistenerJuice();
        addlistenerYoghurt();
        addlistenerMilk ();
    }
    public void addlistenerJuice(){
        Juice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MyActivity.this,"tasty",Toast.LENGTH_LONG).show();
            }
        });
    }
    public void addlistenerYoghurt(){
        Yoghurt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MyActivity.this,"creamy",Toast.LENGTH_LONG).show();
            }
        });
    } public void addlistenerMilk (){
        Milk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MyActivity.this,"tasty",Toast.LENGTH_LONG).show();
            }
        });

    }


}
