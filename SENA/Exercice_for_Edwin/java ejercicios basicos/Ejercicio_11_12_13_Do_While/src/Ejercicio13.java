import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		//
		byte opcion = 0;
		
		Scanner escritura = new Scanner(System.in); //Declaramos objeto Scanner
		
		do {//Hacerc como minimo una vez
			System.out.println("1. Mostrar 100 numero con el bucle for");
			System.out.println("2. Mostrar 100 numero con el bucle while");
			System.out.println("3. ¿Cual es el numero?");
			System.out.println("4. Introcude un numero. ¿Es mayor que cero?");
			System.out.println("5. Salir");
			System.out.println("--------------------------------------------");
			
			System.out.println("Introduce un numero: ");
			//Ingresamos el valor y lo guardamos en una variable.
			opcion = escritura.nextByte();
			
			// Mientras el numero sea menor que 1 o mayor que 5
		}while(opcion <= 1 && opcion >=5);
		
		// Dependiendo de lo que el usuario introduzca ejecutamos una opcion u otra.
		switch (opcion) {
		case 1:
			System.out.println("Opcion 1 ejecutada");
			break;
		case 2:
			System.out.println("Opcion 2 ejecutada");
			break;
		case 3:
			System.out.println("Opcion 3 ejecutada");
			break;
		case 4:
			System.out.println("Opcion 4 ejecutada");
			break;
		case 5:
			System.out.println("Opcion 5 ejecutada");
		}
	}

}
