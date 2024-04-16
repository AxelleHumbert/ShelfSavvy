package com.glob.dao;

import java.util.Vector;

import com.glob.modeles.AuteurVO;
import com.glob.modeles.LivreVO;

public class AuteurOracleDAO {
	public Vector<AuteurVO> getAllAuthors(){
		Vector<AuteurVO> vAuteurs = new Vector<AuteurVO>();
		
		AuteurVO oAuteur1 = new AuteurVO(0,"Hugo","Victor");
		vAuteurs.add(oAuteur1);
		AuteurVO oAuteur2 = new AuteurVO(1,"Flaubert","Gustave");
		vAuteurs.add(oAuteur2);
		AuteurVO oAuteur3 = new AuteurVO(2,"Dumas","Alexandre");
		vAuteurs.add(oAuteur3);
		AuteurVO oAuteur4 = new AuteurVO(3,"Zola","Emile");
		vAuteurs.add(oAuteur4);
		AuteurVO oAuteur5 = new AuteurVO(4,"Proust","Marcel");
		vAuteurs.add(oAuteur5);
		
		return vAuteurs;
	}
	
	
}
