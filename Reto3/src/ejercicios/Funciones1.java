package ejercicios;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Funciones1 {

	public static boolean mismoAnio(LocalDate fecha1, LocalDate fecha2) {
		if(fecha1.getYear()!=fecha2.getYear()) {
			return false;
		} else {
			return true;
		}
	}
	
	public static void nombres(LocalDate fecha1,LocalDate fecha2,Scanner sc) {
		long meses = Math.abs(ChronoUnit.MONTHS.between(fecha1,fecha2));
		String nombre = "";
		String menor = "zzzzzzzzzzzzzzzzzzzz";
		String primero = "zzzzzzzzzzzzzz";
		if(meses<3) {
			meses = 4; 
		}
		for (int i = 0; i < meses; i++) {
				System.out.println("Dime un nombre");
				nombre = sc.nextLine();
				if(nombre.length()<menor.length()) {
					menor = nombre;
				}
				if(nombre.compareTo(primero)>0) {
					primero=nombre;
				}
			}
		
		System.out.println("El nombre de menor tamaño es "+ menor);
		System.out.println("El primer nombre alfabeticamente es "+primero);
		System.out.println("Las vocales del último nombre son: ");
		
		for (int i = 0; i < nombre.length(); i++) {
			char c = nombre.charAt(i);
			switch (c) {
			case 'a':
				System.out.print(c+" - ");
				break;
			case 'e':
				System.out.print(c+" - ");
				break;
			case 'i':
				System.out.print(c+" - ");
				break;
			case 'o':
				System.out.print(c+" - ");
				break;
			case 'u':
				System.out.print(c+" - ");
				break;
			default:
				
			}
		}
		
		}
	}
	
