package com.tiscali.tirocini.test;

import com.tiscali.tirocini.model.*;
import com.tiscali.tirocini.exceptions.*;

public class TirocinioTest
{
	static Universita universita;

	public static void main(String[] args)
	{
		
		creazioneStudenteTest();
		aggiornamentoStudente();




	}

	private static void creazioneStudenteTest()
	{
		// -01----------- CREAZIONE STUDENTE ------------
		try
		{
			Studente studenteA = Universita.getInstance().createStudente("Mario", "Bianchi", "MRBNCH01A01H118J");
			System.out.println("Creato nuovo Studente: " + studenteA);
			Studente studenteB = Universita.getInstance().createStudente("Mario", "Rossi",   "RSSMRA80A01B354W");
			System.out.println("Creato nuovo Studente: " + studenteB);
			Studente studenteC = Universita.getInstance().createStudente("Mario", "Verdi",   "VRDMRA80A01B354S");
			System.out.println("Creato nuovo Studente: " + studenteC);
			Studente studenteD = Universita.getInstance().createStudente("Marco", "Viola",   "VRDMRA80A01B354S");
			System.out.println("Creato nuovo Studente: " + studenteD);
		}
		catch (DuplicatedEntityException e1)
		{
			System.out.println("Errore: " + e1.getMessage());
			// e1.printStackTrace();
		}
	}


	private static void aggiornamentoStudente()
	{
		// -02----------- AGGIORNAMENTO DATI STUDENTE ------------
		try   
		{
			Studente studenteA = Universita.getInstance().updateStudente("MRBNCH01A01H118J", "Mario", "Bianco");
			System.out.println("Aggiornato Studente: " + studenteA);
			Studente studenteB = Universita.getInstance().updateStudente("RSSMRA80A01H354W", "Mario", "Rosso");
			System.out.println("Aggiornato Studente: " + studenteB);
		}
		catch (EntityNotFoundException e1)
		{
			System.out.println("Errore: " + e1.getMessage());
			// e1.printStackTrace();
		}
	}
/*
	private static void proponiOfferta(Azienda azienda, String descrizioneOfferta) throws EntityNotFoundException
	{
//		Azienda azienda = new Azienda("aaa", "bbb");
//		try
//		{
//			proponiOfferta(azienda, "Descrizione Offerta");
//		}
//		catch (EntityNotFoundException e)
//		{
//			e.printStackTrace();
//		}
		
		Universita univ = new Universita("ccc");
		Azienda tmpAzienda = univ.getAzienda(azienda.getPartitaIva());
		if (tmpAzienda == null)
		{
			throw new EntityNotFoundException();
		}
		else
		{

		}

	}
//	x creazione studente               attore:responsabile    
//	- aggiornamento studente           attore:responsabile
//	- registrazione azienda            attore: azienda
//	- proposta offerta                 attore: azienda
//	- approvazione/rifiuto offerta     attore:responsabile                                                 rorru
//	- visualizza offerte               attore:studente                                                      ldeprisco
//	- proponi candidatura              attore:studente  [offerta]                                       lbartolomai
//	- accettazione candidatura         attore: azienda [offerta ---> tirocinio]                      cvittoli
//	- approvazione tirocinio           attore:responsabile [tirocinio---> accordo]               mmeluzzi
//	- stampa accordo                   attore:responsabile                                                rorru
*/
}
