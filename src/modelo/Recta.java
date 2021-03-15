package modelo;

import modelo.Posicion;


/*
 * @author: 	Rene Martinez M.
 * @fecha: 		viernes , 12 de Marzo del 2021
 * @version : 	Ultima actualizacion 0.0.3
 * */
public class Recta {
	
	//ATRIBUTOS
	private Double ecuacion;
	private Double pendiente;
	private Double Y;
	private Double X;
	
	//CONSTRUCTORES
	public Recta() {
//		this.recta = 0.0;
		this.pendiente = 0.0;
		this.X = 1.0;
		this.Y = 1.0;
		this.ecuacion = 1.0;
	}
	public Recta(Double pendiente) {
//		this.recta = recta;
		this.pendiente = pendiente;
		this.ecuacion  = 1.0;
	}

	//METODOS//
	public Double getPendiente() {
		return pendiente;
	}
	public void setPendiente(Double pendiente) {
		this.pendiente = pendiente;
	}

	public Boolean generaPendiente(Posicion pos1, Posicion pos2) {
		
		Boolean val = false;
		Double x1,x2;
		Double y1,y2;
		
		x1 = pos1.getX();
		y1 = pos1.getY();
		x2 = pos2.getX();
		y2 = pos2.getY();
		
		if( (x2 - x1) == 0 ) {
			val = false;
			this.pendiente = 0.0;
		}
		else {
			pendiente = (y2 - y1) / (x2 - x1);
			val = true;
		}
		
		return val;
	}
	
	
	public void generaEcuacion(Posicion pos) {
		
		if(this.pendiente == 0.0) {
			
			this.ecuacion = pos.getY();
		}
		else
		{
			this.ecuacion = ( (this.pendiente * this.X) - this.pendiente * pos.getX() ) + pos.getY();
		}
		
	}

	public Double getY() {
		return Y;
	}
	
	public Double getEcuacion() {
		return this.ecuacion;
	}
	
	
}
