package com.example.pizza.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pizza.R;
import com.example.pizza.beans.Produit;

import java.util.List;

public class ProduitAdapter extends BaseAdapter {
    private List<Produit> produits;
    private LayoutInflater inflater;

    public ProduitAdapter(List<Produit> produits, Activity activity) {
        this.produits = produits;
        this.inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return produits.size();
    }

    @Override
    public Object getItem(int position) {
        return produits.get(position);
    }

    @Override
    public long getItemId(int position) {
        return produits.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) convertView = inflater.inflate(R.layout.item, null);
        TextView nom=convertView.findViewById(R.id.nom1);
        TextView nbrIng=convertView.findViewById(R.id.nbrIngre);
        TextView duree= convertView.findViewById(R.id.duree);
        TextView id =convertView.findViewById(R.id.id);
        ImageView pizza =convertView.findViewById(R.id.imgPizza);

        nom.setText(produits.get(position).getNom());
        nbrIng.setText(produits.get(position).getNbrIngredients()+"");
        duree.setText(produits.get(position).getDuree());
        id.setText(produits.get(position).getId()+"");
        pizza.setImageResource(produits.get(position).getPhoto());



        return convertView;
    }
}
