package com.glob.modeles;

public class StatutVO {
	private int miCode;
	private String msLibelle;
	
	public StatutVO() {}
	
	public StatutVO(int piCode, String psLibelle) {
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
