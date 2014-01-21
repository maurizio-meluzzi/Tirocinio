package com.tiscali.tirocini.model;

public class Tirocinio
{
	private long id;
	private String descrizione;
	private Offerta offerta;
	private Azienda azienda;
	private Accordo accordo;

	public Tirocinio(){
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

	public Offerta getOfferta() {
		return offerta;
	}
	public void setOfferta(Offerta offerta) {
		this.offerta = offerta;
	}

	public Azienda getAzienda() {
		return azienda;
	}
	public void setAzienda(Azienda azienda) {
		this.azienda = azienda;
	}

	public Accordo getAccordo() {
		return accordo;
	}
	public void setAccordo(Accordo accordo) {
		this.accordo = accordo;
	}
}

