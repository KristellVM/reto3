package ejercicios;

import java.time.LocalDate;
import java.util.Scanner;

import util.funciones;

public class Reto3 {

	public static void main(String[] args) {
<<<<<<< HEAD
		Scanner sc = new Scanner(System.in);
		LocalDate fecha1=funciones.dimeFecha("introduce fecha (dd/MM/yyyy)",sc );
		LocalDate fecha2=funciones.dimeFecha("introduce fecha (dd/MM/yyyy)",sc );
		
		int dias=Funciones2.dias(fecha1, fecha2);
		int nombres = 
=======
		
		Scanner sc = new Scanner(System.in);
		
		LocalDate fecha1 = funciones.dimeFecha("Dime la primera fecha (dd/MM/yyyy)", sc);
		LocalDate fecha2;
		do {
			fecha2 = funciones.dimeFecha("Dime la segunda fecha que sea mayor que la primera (dd/MM/yyyy)", sc);
		} while (fecha2.isBefore(fecha1));
		
		if(Funciones1.mismoAnio(fecha1, fecha2)) {
			Funciones1.nombres(fecha1, fecha2, sc);
		} else {
			
		}
>>>>>>> branch 'main' of https://github.com/KristellVM/reto3.git

		
	}

}
