
public class Calculos_conMath {

	public static void main(String[] args) {
		
		//double raiz = Math.sqrt(9); // La clase math solo permite ingresar datos de tipo double 
		
		float num1 = (float) 54.87;
		float num2 = 54.34F; // Toca colocarle el sufijo F, para que reconosca que es un flotante
		
		int resultado = Math.round(num1); // El metodo round redondea a un dato entero
		int resultado2 = Math.round(num2);
		long resultado3 = Math.round(num1);
		
		System.out.println(resultado);
		System.out.println(resultado2);
		System.out.println(resultado3);
		
		// Refundicion
		double num3 = 34.12;
		int  raiz = (int)Math.round(num3);
		System.out.println(raiz);
		
		//Metodo POW (Elevaciones)
		double base=5.87;
		double exponente=3;
		int resultadoexponente= (int)Math.pow(base,exponente);
		System.out.println("El resultado de "+base+" elevado a "+exponente+" es: "+resultadoexponente);
		
	}

}
