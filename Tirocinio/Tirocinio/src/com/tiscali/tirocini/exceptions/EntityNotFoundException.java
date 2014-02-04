package com.tiscali.tirocini.exceptions;

public class EntityNotFoundException extends Exception
{
	private static final long	serialVersionUID	= -6125170087850810672L;


	public EntityNotFoundException()
	{
		super("Did not found the requested entity");
	}
	
	public EntityNotFoundException(String arg0)
	{
		super("Did not found the requested entity - " + arg0 );
	}
}
