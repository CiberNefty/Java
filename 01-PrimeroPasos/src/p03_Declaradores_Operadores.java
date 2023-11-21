 
public class p03_Declaradores_Operadores {

	public static void main(String[] args) {
		/*int a=5,b;
		b=7;
		int c=b+a;
		c++; //Incrementar valor
		c += 73;
		c = c+1; System.out.print(c);*/
		
		final int c=5; // Estamos declarando una constante
		//c=13; // No podemos modificar una constante
		
		final double apulgadas=2.54;
		
		double cm=6; 
		double resultado= cm/apulgadas;
		
		System.out.print("En "+cm+" cm hay "+resultado+" pulgadas");
	}

}
