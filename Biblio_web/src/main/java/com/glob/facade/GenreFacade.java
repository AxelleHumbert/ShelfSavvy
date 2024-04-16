package com.glob.facade;

import java.util.Vector;

import com.glob.dao.GenreOracleDAO;
import com.glob.modeles.GenreVO;



public class GenreFacade {
	public Vector<GenreVO> chargerGenres(){
		GenreOracleDAO oGenreDAO = new GenreOracleDAO();
		Vector<GenreVO> vGenres = oGenreDAO.getAllGenres();
		return vGenres;
	}
}
