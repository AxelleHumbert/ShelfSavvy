package com.glob.modeles;

import java.util.Vector;

public class LivreVO {
	private int miCode;
	private String msTitre;
	private StatutVO moStatut;
	private Vector<AuteurVO> mvAuteurs;
	private Vector<GenreVO> mvGenres;
	
	public LivreVO() {}
	
	public LivreVO(int piCode, String psTitre, StatutVO poStatut, Vector<AuteurVO> pvAuteurs ) {
		this.miCode = piCode;
		this.msTitre = psTitre;
		this.moStatut = poStatut;
		this.mvAuteurs = pvAuteurs;
	}
	
	public int getMiCode() {
		return miCode;
	}
	public void setMiCode(int miCode) {
		this.miCode = miCode;
	}
	public String getMsTitre() {
		return msTitre;
	}
	public void setMsTitre(String msTitre) {
		this.msTitre = msTitre;
	}
	public StatutVO getMoStatut() {
		return moStatut;
	}
	public void setMoStatut(StatutVO moStatut) {
		this.moStatut = moStatut;
	}
	public Vector<AuteurVO> getMvAuteurs() {
		return mvAuteurs;
	}
	public void setMvAuteurs(Vector<AuteurVO> mvAuteurs) {
		this.mvAuteurs = mvAuteurs;
	}
	public Vector<GenreVO> getMvGenres() {
		return mvGenres;
	}
	public void setMvGenres(Vector<GenreVO> mvGenres) {
		this.mvGenres = mvGenres;
	}
	
	
	
	
	
}
