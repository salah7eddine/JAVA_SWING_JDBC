package pres;

import java.util.List;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;

import model.Produit;

public class ProduitModel extends AbstractTableModel {

	private String[] nomColonnes = new String[] {"REF", "NOM", "PRIX","QTE", "CAT"};
	private Vector<String[]> rows = new Vector<String[]>();
	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return rows.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return nomColonnes.length;
	}
	
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return nomColonnes[column];
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return rows.get(rowIndex)[columnIndex];
	}
	
	public void loadData(List<Produit> prods) {
		rows = new Vector<String[]>();
		for(Produit p:prods) {
			rows.add(new String[] {p.getRefProduit(), p.getNomProduit(), String.valueOf(p.getPrix()), String.valueOf(p.getQuantite()) , p.getCategorie().getNomCat()});
		}
		
		fireTableChanged(null);
	}

}
