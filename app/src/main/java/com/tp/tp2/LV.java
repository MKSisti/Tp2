package com.tp.tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class LV extends AppCompatActivity {

    public ListView lv;
    public ListView lvc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        //        List views :
//        lv = findViewById(R.id.LV);
//        String[] components = getResources().getStringArray(R.array.components);
//        ArrayAdapter<String> lva = new ArrayAdapter<String>(LV.this,android.R.layout.simple_list_item_1,components);
//
//        lv.setAdapter(lva);

//        dynamique :
        String[] myData = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"};
        lvc = findViewById(R.id.LVDynamic);
        ArrayAdapter<String> lvac = new ArrayAdapter<String>(LV.this,android.R.layout.simple_list_item_1,myData);

        lvc.setAdapter(lvac);
//        events :

        lvc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view,int i, long l) {
                Toast.makeText(getApplicationContext(),"C\'est l\'Item "+ i + " qui est cliqué: ",Toast.LENGTH_SHORT).show();
            }
        });

    }
}