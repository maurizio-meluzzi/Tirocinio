package com.tiscali.tirocini.model;

import java.util.*;

import com.tiscali.tirocini.exceptions.DuplicatedEntityException;

public class Universita
{
	private String						descrizione;

	private Map<String, Studente>		studenti;
	private Map<String, Responsabile>	responsabili;
	private Map<String, Azienda>		aziende;

	public Universita(String descrizione)
	{
		super();
		this.descrizione = descrizione;
		studenti = new HashMap<String, Studente>();
		responsabili = new HashMap<String, Responsabile>();
		aziende = new HashMap<String, Azienda>();
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

	public Studente createStudente(String nome, String cognome, String cf) throws DuplicatedEntityException
	{
		if (this.getStudenti().containsKey(cf)) throw new DuplicatedEntityException("Esiste già uno studente con il seguente CF:" + cf);

		Studente studente = new Studente(nome, cognome, cf);
		this.getStudenti().put(cf, studente);
		return studente;
	}

	public boolean addStudente(Studente studente)
	{
		if (this.getStudenti().containsKey(studente.getCf()))
		{
			return false;
		}
		else
		{
			this.getStudenti().put(studente.getCf(), studente);
			return true;
		}
	}



	public Responsabile getResponsabile(String cf)
	{
		return this.getResponsabili().get(cf);
	}

	public Responsabile createResponsabile(String nome, String cognome, String cf) throws DuplicatedEntityException
	{
		if (this.getResponsabili().containsKey(cf)) throw new DuplicatedEntityException("Esiste già un responsabile con il seguente CF:" + cf);

		Responsabile responsabile = new Responsabile(nome, cognome, cf);
		this.getResponsabili().put(cf, responsabile);
		return responsabile;
	}

	public boolean addResponsabile(Responsabile responsabile)
	{
		if (this.getResponsabili().containsKey(responsabile.getCf()))
		{
			return false;
		}
		else
		{
			this.getResponsabili().put(responsabile.getCf(), responsabile);
			return true;
		}
	}



	public Azienda getAzienda(String partitaIva)
	{
		return this.getAziende().get(partitaIva);
	}

	public Azienda createAzienda(String ragioneSociale, String partitaIva) throws DuplicatedEntityException
	{
		if (this.getAziende().containsKey(partitaIva)) throw new DuplicatedEntityException("Esiste già un azienda con la seguente P.IVA:" + partitaIva);

		Azienda azienda = new Azienda(ragioneSociale, partitaIva);
		this.getAziende().put(partitaIva, azienda);
		return azienda;
	}

	public boolean addAzienda(Azienda azienda)
	{
		if (this.getAziende().containsKey(azienda.getPartitaIva()))
		{
			return false;
		}
		else
		{
			this.getAziende().put(azienda.getPartitaIva(), azienda);
			return true;
		}
	}
}