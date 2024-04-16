package com.glob.modeles;

import java.util.Vector;

public class UtilisateurVO {
	private int miCode;
	private String msMail;
	private Vector<LivreVO> mvLivre;
	
	public int getMiCode() {
		return miCode;
	}
	public void setMiCode(int miCode) {
		this.miCode = miCode;
	}
	public String getMsMail() {
		return msMail;
	}
	public void setMsMail(String msMail) {
		this.msMail = msMail;
	}
	public Vector<LivreVO> getMvLivre() {
		return mvLivre;
	}
	public void setMvLivre(Vector<LivreVO> mvLivre) {
		this.mvLivre = mvLivre;
	}
	
	
}
