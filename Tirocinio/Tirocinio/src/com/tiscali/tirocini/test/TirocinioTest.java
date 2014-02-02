package com.tiscali.tirocini.test;

import com.tiscali.tirocini.exceptions.EntityNotFoundException;
import com.tiscali.tirocini.model.Azienda;
import com.tiscali.tirocini.model.Universita;

public class TirocinioTest
{

	public static void main(String[] args)
	{
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
