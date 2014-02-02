package com.tiscali.tirocini.model;

public class Responsabile extends Persona
{
	private Accordo		accordo;


	public Responsabile(String nome, String cognome, String cf)
	{
		super(nome, cognome, cf);
	}


	public Accordo getAccordo()
	{
		return accordo;
	}
	public void setAccordo(Accordo accordo)
	{
		this.accordo = accordo;
	}


	@Override
	public int hashCode()
	{
		// HashCode for Responsabile is 400
		return 400;
	}
}
