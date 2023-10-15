package com.example.pizza.beans;

public class Produit {
    private int id;
    private String nom;
    private int nbrIngredients ;
    private int photo;
    private String duree;
    private String detailsIngerd;
    private String description;
    private String preparation;
    private static  int comp;

    public Produit() {

    }

    public Produit( String nom, int nbrIngredients, int photo, String duree, String detailsIngerd, String description, String preparation) {
        this.id = ++comp;
        this.nom = nom;
        this.nbrIngredients = nbrIngredients;
        this.photo = photo;
        this.duree = duree;
        this.detailsIngerd = detailsIngerd;
        this.description = description;
        this.preparation = preparation;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrIngredients() {
        return nbrIngredients;
    }

    public void setNbrIngredients(int nbrIngredients) {
        this.nbrIngredients = nbrIngredients;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getDetailsIngerd() {
        return detailsIngerd;
    }

    public void setDetailsIngerd(String detailsIngerd) {
        this.detailsIngerd = detailsIngerd;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPreparation() {
        return preparation;
    }

    public int getId() {
        return id;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public static int getComp() {
        return comp;
    }

    public static void setComp(int comp) {
        Produit.comp = comp;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbrIngredients=" + nbrIngredients +
                ", photo=" + photo +
                ", duree=" + duree +
                ", detailsIngerd='" + detailsIngerd + '\'' +
                ", description='" + description + '\'' +
                ", preparation='" + preparation + '\'' +
                '}';
    }
}
