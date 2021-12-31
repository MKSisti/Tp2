package com.tp.tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewAvecImage extends AppCompatActivity {

    private EditText edtAddNom, edtAddDescription;
    private GridView lstFruit;
    private ArrayList<Fruit> arrayFruits = new ArrayList<>();
    private Cls_Fruit_Adapter C_Fruit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_avec_image);

        edtAddNom = findViewById(R.id.edtNom);
        edtAddDescription = findViewById(R.id.edtDesc);

        lstFruit = findViewById(R.id.listFruit);
        Fruit nf = new Fruit("banane","Best Fruit","banane");
        arrayFruits.add(nf);
        C_Fruit = new Cls_Fruit_Adapter(getApplicationContext(),arrayFruits);
        lstFruit.setAdapter(C_Fruit);
    }

    public void Ajouter(View view) {
        Fruit fr = new Fruit(edtAddNom.getText().toString(),edtAddDescription.getText().toString(), edtAddNom.getText().toString());
        arrayFruits.add(fr);
        C_Fruit.notifyDataSetChanged();
    }
}

