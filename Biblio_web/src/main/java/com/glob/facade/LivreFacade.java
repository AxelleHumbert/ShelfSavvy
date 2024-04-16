package com.glob.facade;

import java.util.Vector;

import com.glob.dao.LivreOracleDAO;
import com.glob.modeles.LivreVO;

public class LivreFacade {
	public Vector<LivreVO> chargerLivres(){
		LivreOracleDAO oLivreDAO = new LivreOracleDAO();
		Vector<LivreVO> mvlivres = oLivreDAO.getAllBooks();
		return mvlivres;
	}
}
