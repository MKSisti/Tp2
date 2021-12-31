package com.tp.tp2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Cls_Fruit_Adapter extends BaseAdapter {
    Context context;
    ArrayList<Fruit> TabFruit = new ArrayList<Fruit>();
    LayoutInflater inflater;
    public Cls_Fruit_Adapter(Context context, ArrayList<Fruit> Tab){
        this.TabFruit = Tab;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return TabFruit.size();
    }

    @Override
    public Object getItem(int i) {
        return TabFruit.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.customrow,null);

        TextView txtNom = (TextView) view.findViewById(R.id.txtNom);
        TextView txtDesc = (TextView) view.findViewById(R.id.txtDesc);
        ImageView imgIcone = (ImageView) view.findViewById(R.id.imgIcone);
        txtNom.setText(TabFruit.get(i).Nom);
        txtDesc.setText(TabFruit.get(i).Description);
        int resId = context.getResources().getIdentifier(TabFruit.get(i).Nom_Icone,"drawable",context.getPackageName());
        imgIcone.setImageResource(resId);

        return view;
    }
}
