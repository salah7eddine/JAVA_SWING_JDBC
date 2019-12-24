package model;

import java.io.Serializable;

public class Produit implements Serializable {
	private String refProduit;
	private String nomProduit;
	private double prix;
	private int quantite;
	private Categorie categorie;
	public String getRefProduit() {
		return refProduit;
	}
	public void setRefProduit(String refProduit) {
		this.refProduit = refProduit;
	}
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Produit(String refProduit, String nomProduit, double prix, int quantite) {
		super();
		this.refProduit = refProduit;
		this.nomProduit = nomProduit;
		this.prix = prix;
		this.quantite = quantite;
	}
	
	
}
