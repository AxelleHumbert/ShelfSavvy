package com.glob.facade;

import java.util.Vector;

import com.glob.dao.AuteurOracleDAO;
import com.glob.dao.LivreOracleDAO;
import com.glob.modeles.AuteurVO;
import com.glob.modeles.LivreVO;

public class AuteurFacade {
	public Vector<AuteurVO> chargerAuteur(){
		AuteurOracleDAO oAuteurDAO = new AuteurOracleDAO();
		Vector<AuteurVO> vAuteurs = oAuteurDAO.getAllAuthors();
		return vAuteurs;
	}
}
