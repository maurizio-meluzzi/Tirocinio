package com.tiscali.tirocini.exceptions;

public class DuplicatedEntityException extends Exception
{
	private static final long	serialVersionUID	= -6706376271273639595L;


	public DuplicatedEntityException()
	{
		super("Cannot duplicate this entity");
	}
	
	public DuplicatedEntityException(String arg0)
	{
		super("Cannot duplicate this entity - " + arg0 );
	}
}
