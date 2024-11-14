package ejercicios;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;



public class Funciones2 {
public static void dias(LocalDate fecha1, LocalDate fecha2) {
	int diasmes=0;
	int media=0;
	LocalDate mes;
	int meses = (int) ChronoUnit.MONTHS.between(fecha1, fecha2);
     for(int i =0;i<meses+1;i++) {
    	 mes=fecha1.plusMonths(i);
    	 int dias = mes.lengthOfMonth(); 
    	 diasmes= diasmes+ dias;
     }
     media=diasmes/meses;
     System.out.println("los dias = "+ diasmes +" la media = "+ media);
     Month mes1=fecha1.getMonth(); 
     switch (mes1) {
     case "a":

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
     
     //"a"+"u"+"e"+"i"+"o"
    

	
	


}
}
