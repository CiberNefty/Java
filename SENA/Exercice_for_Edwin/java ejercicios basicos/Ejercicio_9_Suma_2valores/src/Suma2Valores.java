import java.util.Scanner;

public class Suma2Valores {

	public static void main(String[] args) {
		Short num1, num2, suma;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("SUMAR DOS VALORES:");		
		num1=12;
		num2=8;
		suma=(short) (num1+num2);
		System.out.println("La sumatoria es: "+suma);
		
		System.out.print("Ingrese el primer valor: ");
		num1 = teclado.nextShort();
		System.out.print("Ingrese el segundo valor: ");
		num2 = teclado.nextShort();
		int sumatoria = num1+num2; 
		
		System.out.println("La sumatoria es: "+sumatoria);
		
		

	}

}
