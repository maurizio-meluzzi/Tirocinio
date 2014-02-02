package com.tiscali.tirocini.model;

public class Studente extends Persona
{
	private Accordo	accordo;


	public Studente(String nome, String cognome, String cf)
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
		// HashCode for Studente is 200
		return 200;
	}
}
