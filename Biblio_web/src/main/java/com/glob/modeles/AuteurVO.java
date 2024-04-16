package com.glob.modeles;

public class AuteurVO {
	private int miCode;
	private String msNom;
	private String msPrenom;
	
	public AuteurVO() {}
	public AuteurVO(int piCode, String psNom, String psPrenom) {
		this.miCode = piCode;
		this.msNom = psNom;
		this.msPrenom = psPrenom;
	}
	
	public int getMiCode() {
		return miCode;
	}
	public void setMiCode(int miCode) {
		this.miCode = miCode;
	}
	public String getMsNom() {
		return msNom;
	}
	public void setMsNom(String msNom) {
		this.msNom = msNom;
	}
	public String getMsPrenom() {
		return msPrenom;
	}
	public void setMsPrenom(String msPrenom) {
		this.msPrenom = msPrenom;
	}
	
	
}
