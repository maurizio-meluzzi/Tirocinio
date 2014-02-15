package com.tiscali.tirocini.model;

public class Accordo
{
	private long			id;
	private String			descrizione;

	private Studente		studente;
	private Responsabile	responsabile;
	private Azienda			azienda;

	private Tirocinio		tirocinio;


	public Accordo(String descrizione, Studente studente, Responsabile responsabile, Azienda azienda, Tirocinio tirocinio)
	{
		// TODO trovare il modo per valorizzare l'id (come, quando)
		super();
		this.descrizione = descrizione;
		this.studente = studente;
		this.azienda = azienda;
		this.tirocinio = tirocinio;
		this.responsabile = responsabile;
	}


	public long getId()
	{
		return id;
	}
	public void setId(long id)
	{
		this.id = id;
	}


	public String getDescrizione()
	{
		return descrizione;
	}
	public void setDescrizione(String descrizione)
	{
		this.descrizione = descrizione;
	}


	public Studente getStudente()
	{
		return studente;
	}
	public void setStudente(Studente studente)
	{
		this.studente = studente;
	}


	public Azienda getAzienda()
	{
		return azienda;
	}
	public void setAzienda(Azienda azienda)
	{
		this.azienda = azienda;
	}


	public Tirocinio getTirocinio()
	{
		return tirocinio;
	}
	public void setTirocinio(Tirocinio tirocinio)
	{
		this.tirocinio = tirocinio;
	}


	public Responsabile getResponsabile()
	{
		return responsabile;
	}
	public void setResponsabile(Responsabile responsabile)
	{
		this.responsabile = responsabile;
	}
}
