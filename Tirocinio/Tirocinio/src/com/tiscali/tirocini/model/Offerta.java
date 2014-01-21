package com.tiscali.tirocini.model;
import java.util.Set;

public class Offerta
{
	private long id;
	private String descrizione;

	private Set<Tirocinio> tirocinio;
	private Azienda azienda;

	public Offerta(){
		super();
	}

	public long getId()
	{
		return id;
	}
	public void setId(long id)
	{
		this.id = id;
	}

	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Set<Tirocinio> getTirocinio() {
		return tirocinio;
	}
	public void setTirocinio(Set<Tirocinio> tirocinio) {
		this.tirocinio = tirocinio;
	}

	public Azienda getAzienda() {
		return azienda;
	}
	public void setAzienda(Azienda azienda) {
		this.azienda = azienda;
	}
}

