package com.glob.facade;

import java.util.Vector;

import com.glob.dao.StatutOracleDAO;
import com.glob.modeles.StatutVO;

public class StatutFacade {
	public Vector<StatutVO> chargerStatut(){
		StatutOracleDAO oStatutDAO = new StatutOracleDAO();
		Vector<StatutVO> vStatut = oStatutDAO.getAllStatut();
		return vStatut;
	}
}
