package com.spring.henallux.firstSpringProject.Model;

public class LigneCommande {


    private int id;
    private double quantite;
    private double prixReel;
    private Commande commande;
    private Produit produit;

    public LigneCommande() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    public double getPrixReel() {
        return prixReel;
    }

    public void setPrixReel(double prixReel) {
        this.prixReel = prixReel;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }
}
