


package controlador;

import modelo.Posicion;
import modelo.Recta;
import modelo.Robot;

/*
 * @author: 	Rene Martinez M.
 * @fecha: 		viernes , 12 de Marzo del 2021
 * @version : 	Ultima actualizacion 0.0.5
 * */

public class Principal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot robotB 	=  new Robot( 4.0, -4.0, 'B');
		Robot robotA	=  new Robot(-5.0,  4.0, 'A'); 
		
		Recta rectaA1	=  new Recta(); 
		Recta rectaB1 	=  new Recta();

		System.out.println("Posicion Inicial robotA : " + "[" + robotA.getPosicionInicial().getX() + " , " + robotA.getPosicionInicial().getY() + "]");
		System.out.println("Posicion Inicial robotB : " + "[" + robotB.getPosicionInicial().getX() + " , " + robotB.getPosicionInicial().getY() + "]");
		
		
		
		robotA.generaNuevaPosicion();
		robotB.generaNuevaPosicion();
		
		
		System.out.println("Posicion Secundaria robotA : " + "[" + robotA.getPosicionSecundaria().getX() + " , " + robotA.getPosicionSecundaria().getY() + "]");
		System.out.println("Posicion Secundaria robotB : " + "[" + robotB.getPosicionSecundaria().getX() + " , " + robotB.getPosicionSecundaria().getY() + "]");
		
		
		
		rectaB1.generaPendiente(robotB.getPosicionInicial(), robotB.getPosicionSecundaria());
		rectaA1.generaPendiente(robotA.getPosicionInicial(), robotA.getPosicionSecundaria());
		
		System.out.println("La pendiente de la recta A1 es : " + rectaA1.getPendiente());
		System.out.println("La pendiente de la recta B1 es : " + rectaB1.getPendiente());
		
		
		rectaB1.generaEcuacion(robotB.getPosicionInicial());
		rectaA1.generaEcuacion(robotA.getPosicionInicial());
		
		System.out.println("La ecuacion del robot A es : " + rectaA1.getY() );
		System.out.println("La ecuacion del robot B es : " + rectaB1.getY() * -1.0 );
		
		/*
		 * SE HACE UN AJUSTE A LAS COORDENADAS DADO QUE PARTEN DESDE UN PUNTO NEGATIVO.
		 * PERO QUE SIN EMBARGO, SE AJUSTARA EN VERSIONES POSTERIORES, MEDIANTE UNA VALIDACION
		 * QUE LLEVARA POR CAMINOS PARA DAR SOLUCION A ESTE AJUSTE DONDE SE MULTIPLICA POR -1
		 * */
		System.out.println("La posicion donde se interceptaran es: "+ "[" + rectaA1.getEcuacion() + ", " +rectaB1.getY()* -1.0 +"]");
		
		
		

	}


}
