package com.glob.dao;

import java.util.Vector;

import com.glob.modeles.StatutVO;

public class StatutOracleDAO {

	public Vector<StatutVO> getAllStatut(){
		Vector<StatutVO> vStatut = new Vector<StatutVO>();
		StatutVO oStatut_souhaite = new StatutVO(1, "Souhaité");
		vStatut.add(oStatut_souhaite);
		StatutVO oStatut_achete = new StatutVO(2, "Acheté");
		vStatut.add(oStatut_achete);
		StatutVO oStatut_en_cours = new StatutVO(3, "En cours");
		vStatut.add(oStatut_en_cours);
		StatutVO oStatut_termine = new StatutVO(4, "Terminé");
		vStatut.add(oStatut_termine);
		StatutVO oStatut_abandonne = new StatutVO(5, "Abandonné");
		vStatut.add(oStatut_abandonne);
		
		return vStatut;
	}
	
}
