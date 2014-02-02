package com.tiscali.tirocini.model;

import java.util.*;

public class Universita
{
	private String					descrizione;

	private Map<String, Studente>		studenti;
	private Map<String, Responsabile>	responsabili;
	private Map<String, Azienda>		aziende;

	public Universita(String descrizione)
	{
		super();
		this.descrizione = descrizione;
		studenti         = new HashMap<String, Studente>();
		responsabili     = new HashMap<String, Responsabile>();
		aziende          = new HashMap<String, Azienda>();
	}

	public String getDescrizione()
	{
		return descrizione;
	}

	public void setDescrizione(String descrizione)
	{
		this.descrizione = descrizione;
	}

	private Map<String, Studente> getStudenti()
	{
		return studenti;
	}

	private Map<String, Responsabile> getResponsabili()
	{
		return responsabili;
	}

	public Map<String, Azienda> getAziende()
	{
		return aziende;
	}

	public Studente getStudente(String cf)
	{
		return this.getStudenti().get(cf);
	}

	public Studente addStudente(String nome, String cognome, String cf)
	{
		Studente tmpStudente = new Studente(nome, cognome, cf);
		this.getStudenti().put(cf, tmpStudente);
		return tmpStudente;
	}

	public Responsabile getResponsabile(String cf)
	{
		return this.getResponsabili().get(cf);
	}

	public Responsabile addResponsabile(String nome, String cognome, String cf)
	{
		Responsabile tmpResponsabile = new Responsabile(nome, cognome, cf);
		this.getResponsabili().put(cf, tmpResponsabile);
		return tmpResponsabile;
	}

	public Azienda getAzienda(String partitaIva)
	{
		return this.getAziende().get(partitaIva);
	}

	public Azienda addAzienda(String ragioneSociale, String partitaIva)
	{
		Azienda tmpAzienda = new Azienda(ragioneSociale, partitaIva);
		this.getAziende().put(partitaIva, tmpAzienda);
		return tmpAzienda;
	}
}