package com.tiscali.tirocini.model;

import java.util.Set;

public class Azienda
{
	private long			id;
	private String			ragioneSociale;
	private String			partitaIva;

	private Set<Tirocinio>	tirocinio;
	private Set<Offerta>	offerta;
	private Set<Accordo>	accordo;


	public Azienda(String ragioneSociale, String partitaIva)
	{
		// TODO trovare il modo per valorizzare l'id (come, quando)
		super();
		this.ragioneSociale = ragioneSociale;
		this.partitaIva = partitaIva;
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


	public Set<Offerta> getOfferta()
	{
		return offerta;
	}
	public void setOfferta(Set<Offerta> offerta)
	{
		this.offerta = offerta;
	}


	public Set<Accordo> getAccordo()
	{
		return accordo;
	}
	public void setAccordo(Set<Accordo> accordo)
	{
		this.accordo = accordo;
	}
}
