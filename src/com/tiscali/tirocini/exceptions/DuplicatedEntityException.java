package com.tiscali.tirocini.exceptions;

public class DuplicatedEntityException extends Exception
{
	private static final long	serialVersionUID	= -6706376271273639595L;


	public DuplicatedEntityException()
	{
		super("La duplicazione dell'oggetto non è consentita");
	}
	
	public DuplicatedEntityException(String arg0)
	{
		super("La duplicazione dell'oggetto non è consentita - " + arg0 );
	}
}
