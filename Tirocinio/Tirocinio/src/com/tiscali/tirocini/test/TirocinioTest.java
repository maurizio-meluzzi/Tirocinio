package com.tiscali.tirocini.test;

import com.tiscali.tirocini.model.*;
import com.tiscali.tirocini.exceptions.*;

public class TirocinioTest
{

	public static void main(String[] args)
	{
		// -01----------- CREAZIONE STUDENTE ------------
		Universita universita = new Universita("Cagliari");
		try
		{
			Studente studenteA = universita.createStudente("Mario", "Bianchi", "MRBNCH01A01H118J");
			System.out.println("Creato nuovo Studente: " + studenteA);
			Studente studenteB = universita.createStudente("Mario", "Rossi",   "RSSMRA80A01B354W");
			System.out.println("Creato nuovo Studente: " + studenteB);
			Studente studenteC = universita.createStudente("Mario", "Verdi",   "VRDMRA80A01B354S");
			System.out.println("Creato nuovo Studente: " + studenteC);
			
		}
		catch (DuplicatedEntityException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		Azienda azienda = new Azienda("aaa", "bbb");
		try
		{
			proponiOfferta(azienda, "Descrizione Offerta");
		}
		catch (EntityNotFoundException e)
		{
			e.printStackTrace();
		}

	}

	private static void proponiOfferta(Azienda azienda, String descrizioneOfferta) throws EntityNotFoundException
	{
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

}
