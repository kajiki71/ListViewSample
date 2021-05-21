package com.websarva.wings.android.listviewsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get Object.
        ListView lvMenu = findViewById(R.id.lv_menu);
        ListItemClicklistener listener = new ListItemClicklistener();

        //Set listener
        lvMenu.setOnItemClickListener(listener);
    }

    //Define listener class.
    private class ListItemClicklistener implements AdapterView.OnItemClickListener{
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            //Get menu name which tapped.
            String item = (String)parent.getItemAtPosition(position);
            String show = "あなたが選んだ定食"+ item;

            //Toast function.
            Toast.makeText(MainActivity.this,show,Toast.LENGTH_LONG).show();


        }
    }
}