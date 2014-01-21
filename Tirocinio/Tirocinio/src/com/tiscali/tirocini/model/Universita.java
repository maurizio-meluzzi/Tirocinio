package com.tiscali.tirocini.model;

import java.util.HashMap;
import java.util.Set;

public class Universita
{
	private String						descrizione;

	private Set<Studente>				studenti;
	private Set<Responsabile>			responsabili;
	private HashMap<Long, Azienda>	aziende;

	public Universita()
	{
		super();
	}

	public String getDescrizione()
	{
		return descrizione;
	}

	public void setDescrizione(String descrizione)
	{
		this.descrizione = descrizione;
	}

	private Set<Studente> getStudenti()
	{
		return studenti;
	}

	private Set<Responsabile> getResponsabili()
	{
		return responsabili;
	}

	public Studente getStudente(String cf)
	{
		// getStudenti().contains(cf)
		return null;
	}

	public Studente addStudente(String nome, String cognome, String cf)
	{
		Studente tmpStudente = new Studente(nome, cognome, cf);
		// COMPLETARE A PARTIRE DA QUI
		return tmpStudente;
	}

	public HashMap<Long, Azienda> getAziende()
	{
		return aziende;
	}
	
	public Azienda getAzienda(long id)
	{
		return aziende.get(id);
	}
	public void addAzienda(Azienda azienda)
	{
		aziende.put(azienda.getId(), azienda);
	}
}