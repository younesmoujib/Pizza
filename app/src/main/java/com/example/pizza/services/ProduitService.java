package com.example.pizza.services;

import com.example.pizza.beans.Produit;
import com.example.pizza.dao.Dao;

import java.util.ArrayList;
import java.util.List;

public class ProduitService implements Dao<Produit> {
    List<Produit> produits;

    public ProduitService() {
        this.produits = new ArrayList<>();
    }

    @Override
    public boolean create(Produit o) {
        return produits.add(o) ;
    }

    @Override
    public boolean update(Produit o) {
      Produit p=findById(o.getId());
      p.setDescription(o.getDescription());
      p.setDuree(o.getDuree());
      p.setNom(o.getNom());
      p.setPreparation(o.getPreparation());
      p.setDetailsIngerd(o.getDetailsIngerd());
      p.setNbrIngredients(o.getNbrIngredients());
        return false;
    }

    @Override
    public boolean delete(Produit o) {
        return produits.remove(o);
    }

    @Override
    public List<Produit> findALL() {
        return produits;
    }

    @Override
    public Produit findById(int d) {
          for(Produit p:produits){
              if(p.getId()==d){
                  return p;
              }
          }
           return null;
    }
}
