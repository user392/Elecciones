package co.edu.unbosque.model;

public class CiudadanoNoExisteExcepcion extends Exception{

	public CiudadanoNoExisteExcepcion () {
		
		super();
	}
	
	public CiudadanoNoExisteExcepcion (String c) {
		
		super(c);
	}
}
