import java.util.Scanner;

public class Ejercicio_3_MSI {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double p, e;
        System.out.println("Ingrese su Estatura(metros)");
        e = teclado.nextDouble();
        System.out.println("Ingrese su peso(kg)");
        p = teclado.nextDouble();
        
        double exponente=2;
        double resultado = p/ Math.pow(e, exponente);
        System.out.println("El resultado es: "+resultado);
        
        if (resultado < 18.5) {
        	System.out.println("Índice Masa corporal: "+resultado);
        	System.out.println("Tienes Insuficiencia Ponderadal, esta que se muere entre los huesos");
        }else if (resultado >= 18.5 && resultado < 25.0) {
			System.out.println("Índice Masa corporal: "+resultado);
			System.out.println("Tiene un peso normal");
		}else if (resultado >= 25.0 && resultado < 30.0) {
			System.out.println("Índice Masa corporal: "+resultado);
			System.out.println("Tienes Preobesidad (Ya eres un gordo más)");
		}else if (resultado >= 30.0 && resultado < 35.0) {
			System.out.println("Índice Masa corporal: "+resultado);
			System.out.println("Tienes Obesidad Clase 1 (compre ropa mas grande xxl)");
		}else if (resultado >= 35.0 && resultado < 40) {
			System.out.println("Índice Masa corporal: "+resultado);
			System.out.println("Tienes Obesidad Clase 2 (Eres un gordo formidable)");
		}else if (resultado >= 40.0) {
			System.out.println("Índice Masa corporal: "+resultado);
			System.out.println("Teienes Obesidad Clase 3 (Ya no puedes ser flaco)");
		}else {
			System.out.println("No entro a ningun condicional.");
		}
    }
}
