package Dao;

import java.sql.Connection;
import java.util.List;

import metier.MetierCatalogueImpl;
import model.Categorie;
import model.Produit;

public class TestConnexion {

	public static void main(String[] args) {
//		Connection connection = SingletonConnection.getConnection();
	
		MetierCatalogueImpl metier = new MetierCatalogueImpl();
//		metier.addCategorie(new Categorie("Ordinateurs"));
//		metier.addCategorie(new Categorie("Imprimantes"));
//		metier.addCategorie(new Categorie("CD"));
		
//		
//		metier.addProduit(new Produit("P1", "HP", 4000, 30), 1);
//		metier.addProduit(new Produit("P2", "HP 89", 5600, 60), 1);
//		metier.addProduit(new Produit("P3", "IM", 4000, 55), 1);
//		metier.addProduit(new Produit("P4", "AZE", 4000, 10), 2);
//		metier.addProduit(new Produit("P5", "AZE 12", 4000, 17), 2);
//		metier.addProduit(new Produit("P6", "DVD 12", 4000, 19), 3);
//		metier.addProduit(new Produit("P7", "DHD 1.1", 4000, 32), 3);
		
		List<Categorie> categories = metier.getAllCategories();
		for(Categorie c: categories) {
			System.out.println(c.getNomCat());
		}
		
		System.out.println("---------------------");
		
		List<Produit> produits = metier.getProduitsParCat(1);
		for(Produit p : produits) {
			System.out.println(p.getNomProduit() +" : "+ p.getRefProduit()+" : "+ p.getQuantite());
		}
		
		System.out.println("----------------------");
		produits = metier.getProdutsParMC("H");
		for(Produit p : produits) {
			System.out.println(p.getNomProduit() +" : "+ p.getRefProduit()+" : "+ p.getQuantite());
			System.out.println(p.getCategorie().getNomCat());
		}
	}

}
