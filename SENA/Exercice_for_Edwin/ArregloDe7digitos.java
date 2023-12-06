import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArregloDe7digitos {
    public static void main(String[] args) {
        int opción;
        // creación de lista
        // List<Integer> datos = new ArrayList<>(4); //lista predefinida
        List<Integer> datos = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa 9 valores");
        int var1 = input.nextInt();
        // System.out.println("Ingresa el valor 2 ");
        int var2 = input.nextInt();
        // System.out.println("Ingresa el valor 3 ");
        int var3 = input.nextInt();
        // System.out.println("Ingresa el valor 4 ");
        int var4 = input.nextInt();
        // System.out.println("Ingresa el valor 5 ");
        int var5 = input.nextInt();
        // System.out.println("Ingresa el valor 6 ");
        int var6 = input.nextInt();
        // System.out.println("Ingresa el valor 7 ");
        int var7 = input.nextInt();
        // System.out.println("Ingresa el valor 8 ");
        int var8 = input.nextInt();
        // System.out.println("Ingresa el valor 9 ");
        int var9 = input.nextInt();

        // agregamos valores a nuestra lista//
        datos.add(var1);
        datos.add(var2);
        datos.add(var3);
        datos.add(var4);
        datos.add(var5);
        datos.add(var6);
        datos.add(var7);
        datos.add(var8);
        datos.add(var9);

        // mostrar lista//
        System.out.println("MI LISTA ES: " + datos);

        // Acceder a un elemento de la lista
        //System.out.println("Acceder a un elemento de la lista");
        //int num1 = datos.get(var7);
        //System.out.println("Primer número: " + num1);

        System.out.println("MENÚ ");
        System.out.println("\nEscoge una opción \n");
        System.out.println("1.Número mayor: ");
        System.out.println("2.Número menor: ");
        System.out.println("3.Promedio de valores: ");
        System.out.println("4.Suma total: ");
        System.out.println("5.Primero número digitado: ");
        System.out.println("6.Ultimo número digitado: ");
        System.out.println("\nEscoge una opción \n");
        opción = input.nextInt();

        switch (opción) {
            case 1:
                System.out.println("--------------------------------------\n");
                System.out.println("Número mayor: " + Collections.max(datos));
                break;
            case 2:
                System.out.println("--------------------------------------\n");
                System.out.println("Número menor: " + Collections.min(datos));
                break;
            case 3:
                System.out.println("--------------------------------------\n");
                int suma = 0;
                for (int elemento : datos) {
                    suma += elemento;
                }
                int promedio = suma / datos.size();
                System.out.println("El promedio de los datos es: \n" + promedio + "\n");
                break;
            case 4:
                System.out.println("4.Suma total: ");
                suma = 0;
                for (int elemento : datos) {
                    suma += elemento;
                }
                System.out.println("La suma de los datos es: \n" + suma + "\n");
                break;
            case 5:
                System.out.println("\n5.Primero número digitado: ");
                // Podemos acceder a un vamor llamando desde el nombre de la variable siempre y
                // cuando sepamos que variable es
                // O podemos acceder desde los numero indicando la posicion de la lista
                System.out.println("El primero numero de la lista es: " + datos.get(var1));
                System.out.println("El primero numero de la lista es: " + datos.get(0));
                break;
            case 6:
                System.out.println("6.Ultimo número digitado: ");
                System.out.println("El primero numero de la lista es: " + datos.get(var9));
                System.out.println("El primero numero de la lista es: " + datos.get(9));
                break;
            default:
                break;
        }
    }
}
