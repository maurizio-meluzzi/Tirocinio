package com.tiscali.tirocini.model;

public class Responsabile extends Persona
{
	private Universita	universita;
	private Accordo		accordo;

	public Universita getUniversita()
	{
		return universita;
	}
	public void setUniversita(Universita universita)
	{
		this.universita = universita;
	}

	public Accordo getAccordo()
	{
		return accordo;
	}
	public void setAccordo(Accordo accordo)
	{
		this.accordo = accordo;
	}
}
