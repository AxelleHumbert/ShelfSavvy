package com.glob.dao;

import java.util.Vector;

import com.glob.modeles.AuteurVO;
import com.glob.modeles.LivreVO;
import com.glob.modeles.StatutVO;

public class LivreOracleDAO {
	
	public Vector<LivreVO> getAllBooks(){
		Vector<LivreVO> mvLivre = new Vector<LivreVO>();
		StatutVO oStatut_souhaite = new StatutVO(1, "Souhaité");
		StatutVO oStatut_achete = new StatutVO(2, "Acheté");
		StatutVO oStatut_en_cours = new StatutVO(3, "En cours");
		StatutVO oStatut_termine = new StatutVO(4, "Terminé");
		StatutVO oStatut_abandonne = new StatutVO(5, "Abandonné");
		
		
		
		AuteurVO oAuteur1 = new AuteurVO(0,"Hugo","Victor");
		Vector<AuteurVO> vAuteur1 = new Vector<AuteurVO>();
		vAuteur1.add(oAuteur1);
		LivreVO olivre1 = new LivreVO(0, "Les misérables", oStatut_souhaite, vAuteur1 );
		mvLivre.add(olivre1);
		
		AuteurVO oAuteur2 = new AuteurVO(1,"Flaubert","Gustave");
		Vector<AuteurVO> vAuteur2 = new Vector<AuteurVO>();
		vAuteur2.add(oAuteur2);
		LivreVO olivre2 = new LivreVO(0, "Madame Bovary", oStatut_achete, vAuteur2);
		mvLivre.add(olivre2);
		
		AuteurVO oAuteur3 = new AuteurVO(2,"Dumas","Alexandre");
		Vector<AuteurVO> vAuteur3 = new Vector<AuteurVO>();
		vAuteur3.add(oAuteur3);
		LivreVO olivre3 = new LivreVO(0, "Le Comte de Monte-Cristo", oStatut_en_cours, vAuteur3);
		mvLivre.add(olivre3);
		
		AuteurVO oAuteur4 = new AuteurVO(3,"Zola","Emile");
		Vector<AuteurVO> vAuteur4 = new Vector<AuteurVO>();
		vAuteur4.add(oAuteur4);
		LivreVO olivre4 = new LivreVO(0, "Germinal", oStatut_achete, vAuteur4 );
		mvLivre.add(olivre4);
		
		AuteurVO oAuteur5 = new AuteurVO(4,"Proust","Marcel");
		Vector<AuteurVO> vAuteur5 = new Vector<AuteurVO>();
		vAuteur5.add(oAuteur5);
		LivreVO olivre5 = new LivreVO(0, "À la recherche du temps perdu",oStatut_abandonne, vAuteur5);
		mvLivre.add(olivre5);
	
		return mvLivre;
	}
	
}
