package com.otto.cursomc.services;

public class ObjectNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

//	public ObjectNotFoundException(Integer id) {
//		super("Objeto com id " + id + " não encontrado!");
//	}

	public ObjectNotFoundException(String msg) {
		super(msg);
	}
	
	public ObjectNotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	}

}