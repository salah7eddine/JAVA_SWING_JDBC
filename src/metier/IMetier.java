package metier;

import java.util.List;

import model.Categorie;
import model.Produit;

public interface IMetier {
	public void addCategorie(Categorie c);
	public void addProduit(Produit p, int idCat);
	public List<Produit> getProdutsParMC(String mc);
	public List<Produit> getProduitsParCat(int idCat);
	public List<Categorie> getAllCategories();
	public Categorie getCategorie(int idCat);
}
