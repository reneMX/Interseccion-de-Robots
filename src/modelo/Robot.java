package modelo;

import modelo.Posicion;


/*
 * @author: 	Rene Martinez M.
 * @fecha: 		viernes , 12 de Marzo del 2021
 * @version : 	Ultima actualizacion 0.0.5
 * */

public class Robot {
	
	private Posicion posicionInicial;
	private Posicion posicionSecundaria;
	private Posicion posicionActual;
	
	private char tipoRobot;
	
	public Robot() {
		this.posicionInicial 	= new Posicion();
		this.posicionSecundaria = new Posicion();
		this.posicionActual 	= new Posicion();
		this.tipoRobot 			= ' ';
	}
	
	
	public Robot(Double posXInicial, Double posYInicial, char tipoRobot) {
		
			this.posicionInicial 	= new Posicion();
			this.posicionSecundaria = new Posicion();
			this.posicionActual 	= new Posicion();
			this.tipoRobot 			= tipoRobot;
			
		try {
				this.posicionInicial.setX(posXInicial);
				this.posicionInicial.setY(posYInicial);
				this.posicionSecundaria.setX(posXInicial); 
				this.posicionSecundaria.setY(posYInicial);
			}catch(NullPointerException ex) {
					ex.printStackTrace();
			}
	}
	
	
	public void generaNuevaPosicion() {
		switch(this.tipoRobot) {
			
			case 'A': 
				this.posicionSecundaria.setX(this.posicionInicial.getX() + 1.0 );
			break;
			
			case 'B': 
				this.posicionSecundaria.setY(this.posicionInicial.getY() + 1.0 );
			break;

		}
	}
	
	

	public Posicion getPosicionInicial() {
		return this.posicionInicial;
	}
	
	public Posicion getPosicionSecundaria() {
		return this.posicionSecundaria;
	}
	
	public Posicion getPosicionActual() {
		return this.posicionActual;
	}
	
	
}
