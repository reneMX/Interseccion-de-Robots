package modelo;

import java.util.ArrayList;
import java.util.List;


/*
 * @author: 	Rene Martinez M.
 * @fecha: 		viernes , 12 de Marzo del 2021
 * @version : 	Ultima actualizacion 0.0.3	
 * */
public class Posicion {

	//ATRIBUTOS//
	private Double posX;
	private Double posY;
	
	//CONSTRUCTORES//
	public Posicion() {
		this.posX = 0.0;
		this.posY = 0.0;
	}
	public Posicion(Double posX, Double posY) {
		this.posX = posX;
		this.posY = posY;
	}
	
	//METODOS//
	public double getX() {
		return posX;
	}
	public double getY() {
		return posY;
	}
	public void setX(Double posX) {
		this.posX = posX;
	}
	public void setY(Double posY) {
		this.posY = posY;
	}
	public List<Double> get_pos(){	
		List<Double> pos =  new ArrayList<Double>();
		pos.add(posX);
		pos.add(posY);
		return pos;
	}

}