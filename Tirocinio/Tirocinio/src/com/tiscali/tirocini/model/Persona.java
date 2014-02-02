package com.tiscali.tirocini.model;

public abstract class Persona
{
	private String	nome;
	private String	cognome;
	private String	cf;


	public Persona(String nome, String cognome, String cf)
	{
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.cf = cf;
	}


	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}


	public String getCognome()
	{
		return cognome;
	}
	public void setCognome(String cognome)
	{
		this.cognome = cognome;
	}


	public String getCf()
	{
		return cf;
	}
	public void setCf(String cf)
	{
		this.cf = cf;
	}


	@Override
	public boolean equals(Object obj)
	{
		if (obj instanceof Persona)
		{
			return this.getCf().equals(((Persona) obj).getCf());
		}
		else
		{
			return false;
		}
	}
}
