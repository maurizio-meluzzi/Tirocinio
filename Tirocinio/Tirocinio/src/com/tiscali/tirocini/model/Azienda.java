package com.tiscali.tirocini.model;

import java.util.Set;

public class Azienda
{
	private long			id;
	private String			ragioneSociale;
	private String			partitaIva;
	private Set<Tirocinio>	tirocinio;
	private Accordo			accordo;
	private Set<Offerta>	offerta;

	public Azienda()
	{
		super();
	}

	public Azienda(long id, String ragioneSociale)
	{
		super();
		this.id = id;
		this.ragioneSociale = ragioneSociale;
	}

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getRagioneSociale()
	{
		return ragioneSociale;
	}

	public void setRagioneSociale(String descrizione)
	{
		this.ragioneSociale = descrizione;
	}

	public String getPartitaIva()
	{
		return partitaIva;
	}
	public void setPartitaIva(String partitaIva)
	{
		this.partitaIva = partitaIva;
	}

	public Set<Tirocinio> getTirocinio()
	{
		return tirocinio;
	}

	public void setTirocinio(Set<Tirocinio> tirocinio)
	{
		this.tirocinio = tirocinio;
	}

	public Accordo getAccordo()
	{
		return accordo;
	}

	public void setAccordo(Accordo accordo)
	{
		this.accordo = accordo;
	}

	public Set<Offerta> getOfferta()
	{
		return offerta;
	}

	public void setOfferta(Set<Offerta> offerta)
	{
		this.offerta = offerta;
	}
}
