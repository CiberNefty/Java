import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class listas {
    public static void main(String[] args) {
            List<String> ListaNumero = new ArrayList<String>();

            // Agregar valores a una lista
            ListaNumero.add("D");
            ListaNumero.add("3");
            ListaNumero.add("fd");
            ListaNumero.add("h");
            //Recorrer una lista 
            /*for (String elemtento : ListaNumero){
                System.out.println(elemtento);
            }*/
            //******************
            //Crear una lista dentro de otra lista
            List<List<String>> listas2 = new ArrayList<>();
            // Agregar valores a una lista
            listas2.add(new ArrayList<>(Arrays.asList("a", "b", "c")));
            listas2.add(new ArrayList<>(Arrays.asList("1", "2", "3")));
            
            /*for(List<String> ListaExterna : listas2){
                System.out.println(ListaExterna);
                for(String ListaInterno : ListaExterna){
                    System.out.println(ListaInterno);
                }
            }*/
             // Creamos una lista de números aleatorios
             List<Integer> numeros = new ArrayList<>();
             Random random = new Random();

            /*for (int i = 0; i < 10; i++) {
                 numeros.add(random.nextInt(100));
             }

             // Imprimimos la lista
             for (Integer numero : numeros) {
                 System.out.println(numero);
             }*/
            
            //DICCIONARIOS
            // Creamos un diccionario vacío
            HashMap<Integer, Integer> diccionario = new HashMap<>();
            
            // Asignamos valores al diccionario
            diccionario.put(1, 1);
            diccionario.put(2, 2);
            diccionario.put(3, 3);
            diccionario.put(4, 4);
            diccionario.put(5, 5);
            diccionario.put(6, 6);
            diccionario.put(7, 7);
            diccionario.put(8, 8);
            diccionario.put(9, 9);
            diccionario.put(101, 10);
            diccionario.put(111, 11);
            diccionario.put(122, 12);
            diccionario.put(133, 13);

            // Imprimimos el diccionario
            /*for (String Llave : diccionario.keySet()) {
                System.out.println(Llave + ": " + diccionario.get(Llave));
            }*/

            // Imprimimos los valores aleatorios
            for (int i = 1; i <= diccionario.keySet().indexOf(clave); i++) {
                // Generamos un número aleatorio entre 0 y el tamaño del diccionario
                int indiceAleatorio = random.nextInt(diccionario.size());
    
                // Imprimimos el valor aleatorio correspondiente al índice generado
                System.out.println(diccionario.get(indiceAleatorio));

                int indice = diccionario.keySet().indexOf(clave);
                
            }


    }   
}
