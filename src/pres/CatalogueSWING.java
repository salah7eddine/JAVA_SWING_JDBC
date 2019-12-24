package pres;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import metier.MetierCatalogueImpl;
import model.Produit;

public class CatalogueSWING extends JFrame {

	private JLabel jLabelMC = new JLabel("Mot Clé : ");
	private JTextField jTextFieldMC = new JTextField(12);
	private Button jButtonOK = new Button("OK");
	private JTable jTable;
	private ProduitModel produitModel;
	private MetierCatalogueImpl metier = new MetierCatalogueImpl();
	
	public CatalogueSWING() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setLayout(new BorderLayout());
		JPanel jPanelN = new JPanel();
		
		jPanelN.setLayout(new FlowLayout());
		jPanelN.add(jLabelMC);jPanelN.add(jTextFieldMC);jPanelN.add(jButtonOK);
		this.add(jPanelN, BorderLayout.NORTH);
		
		produitModel = new ProduitModel();
		jTable = new JTable(produitModel);
		JScrollPane jScrollPane = new JScrollPane(jTable);
		this.add(jScrollPane, BorderLayout.CENTER);
		
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setVisible(true);
		
		jButtonOK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String mc = jTextFieldMC.getText();
				List<Produit> produits = metier.getProdutsParMC(mc);
				produitModel.loadData(produits);
			}
		});
	}
	
	
	public static void main(String[] args) {
		new CatalogueSWING();

	}

}
