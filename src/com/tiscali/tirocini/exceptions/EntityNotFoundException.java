package com.tiscali.tirocini.exceptions;

public class EntityNotFoundException extends Exception
{
	private static final long	serialVersionUID	= -6125170087850810672L;


	public EntityNotFoundException()
	{
		super("L'oggetto richiesto non è stato trovato");
	}
	
	public EntityNotFoundException(String arg0)
	{
		super("L'oggetto richiesto non è stato trovato - " + arg0 );
	}
}
