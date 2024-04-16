package com.glob.dao;

import java.util.Vector;

import com.glob.modeles.GenreVO;

public class GenreOracleDAO {

	public Vector<GenreVO> getAllGenres(){
		Vector<GenreVO> vGenres = new Vector<GenreVO>();

		GenreVO oGenre1 = new GenreVO(0,"Roman historique");
		vGenres.add(oGenre1);
		GenreVO oGenre2 = new GenreVO(1,"Drame");
		vGenres.add(oGenre2);
		GenreVO oGenre3 = new GenreVO(2,"Roman réaliste");
		vGenres.add(oGenre3);
		GenreVO oGenre4 = new GenreVO(3,"Roman aventure");
		vGenres.add(oGenre4);
		GenreVO oGenre5 = new GenreVO(4,"Roman naturaliste");
		vGenres.add(oGenre5);
		GenreVO oGenre6 = new GenreVO(5,"Roman moderne");
		vGenres.add(oGenre6);
		GenreVO oGenre7 = new GenreVO(6,"Roman psychologique");
		vGenres.add(oGenre7);
		
		return vGenres;
	}
}
