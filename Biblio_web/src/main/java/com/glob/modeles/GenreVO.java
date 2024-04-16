package com.glob.modeles;

public class GenreVO {
	private int miCode;
	private String msLibelle;
	
	public GenreVO() {}
	public GenreVO(int piCode, String psLibelle) {
		this.miCode = piCode;
		this.msLibelle = psLibelle;
	}
	
	public int getMiCode() {
		return miCode;
	}
	public void setMiCode(int miCode) {
		this.miCode = miCode;
	}
	public String getMsLibelle() {
		return msLibelle;
	}
	public void setMsLibelle(String msLibelle) {
		this.msLibelle = msLibelle;
	}
	
	
}
