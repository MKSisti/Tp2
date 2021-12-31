package com.tp.tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.LauncherActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    public  Spinner sp;
    public ArrayAdapter aa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//          Spinners :

        String[] lstCouleurs={"Rouge","Vert","Bleu","Blanc","Noir"};

        sp = findViewById(R.id.ColorsSpinner);
        aa = new ArrayAdapter(MainActivity.this,android.R.layout.simple_spinner_item, lstCouleurs);

        sp.setAdapter(aa);
        sp.setPrompt("choose a color");


    }

    public void LaunchSecondAct(View view) {
        Intent sec = new Intent(this,LV.class);
        startActivity(sec);
    }

    public void LaunchThirdAct(View view) {
        startActivity(new Intent(this,ListViewAvecImage.class));
    }

}