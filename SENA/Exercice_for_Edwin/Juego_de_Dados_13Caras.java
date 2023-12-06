import java.util.HashMap;
import java.util.Random;
import java.util.Map;
import java.util.Scanner;

public class Juego_de_Dados_13Caras {
    public static void main(String[] args) {
        /*
         * 13 jqk baraja  
         *                      A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P        
         * tomar lo numeros del 1,2,3,4,5,6,7,8,9-10-10-10-10
         * jqk valen 10 (Ya)
         * 
         * condicion 1: si saca doble uno, GANA
         * condicion 2: si saca una letra y el 1, GANA
         * condicion 3: si saca lertra y 2, REPITE
         * condicion 4: cualquira que de 14, MEDIOGANA
         * condicion 5: Al precionar 9 salir (HECHO)
         * condicion 6: Que me genere un valor aleatorio (HECHO)
         */
        //Creamos nuestro diccionario de objeto de HashMap
        Map<String, Integer> diccionarioDadoValores = new HashMap<>();
        Random random = new Random(); // Generamos nuestro objto random
        Random aletariedad = new Random();
        Scanner ingreso = new Scanner(System.in); // Generamos nuestro objeto Scanner para ingresar texto por teclado
        
        // Creamos una variable boolean donde va a verificar que es la primera partida
        boolean esPrimertirada = true;
        int puntopartida = 0, numeroJugadas; // dos variables una para guardar el numero de partidas y la otra va a ser un contador de una sumatoria a evaluar
        
        // Agregamos elementos al nuestro diccionario diccionario(clave, valor)
        diccionarioDadoValores.put("AA", 11);
        diccionarioDadoValores.put("A", 1);
        diccionarioDadoValores.put("2", 2);
        diccionarioDadoValores.put("3", 3);
        diccionarioDadoValores.put("4", 4);
        diccionarioDadoValores.put("5", 5);
        diccionarioDadoValores.put("6", 6);
        diccionarioDadoValores.put("7", 7);
        diccionarioDadoValores.put("8", 8);
        diccionarioDadoValores.put("9", 9);
        diccionarioDadoValores.put("10", 10);
        diccionarioDadoValores.put("J", 10);
        diccionarioDadoValores.put("Q", 10);
        diccionarioDadoValores.put("K", 10);

        System.out.println("JUEGO DE DADOS con 13 caras");
        System.out.println("-----------------------------");
        
        int finalizacionBucleWhile; //Variable para evaluar la finalizacion del juego
        System.out.print("Si quieres comenzar el juego ¡NO! PRESIONES EL NUMERO 9: ");
        finalizacionBucleWhile = ingreso.nextInt(); // Ingresamos por texto utilizando el objeto Scanner

        while (finalizacionBucleWhile != 9) { // Evaluar si el numero que preciose es diferente que 9

            System.out.println("Ingrese el el numero de lanzadas que quiere hacer");
            numeroJugadas = ingreso.nextInt();
            
            for (int i = 1; i < numeroJugadas + 1; i++) { // Recorre el numero de lanzamientos
                System.out.println("PARTIDA: " + i);
                
                //Imprimir aleaatoriamente un contenido del diccionario
                System.out.println("\nImprimiendo aleatoriamente un contenido del diccionario:");
                imprimirContenidoAleatorio(diccionarioDadoValores);

                // Imprmimos aleatoriamente el valor del nuestra lista utilizando un metodo
                System.out.println("\n Imprimiendo aleatoriamente el valor del diccionario:");
                imprimirValorAleatorio(diccionarioDadoValores);

                // Asignamos el mismo metodo a dos variables carta 1 y carta 2
                 

                /*int dado1 = aletariedad.nextInt(13) + 1;
                int dado2 = aletariedad.nextInt(13) + 1;
                System.out.println("Dado #1: " + dado1 + " |----| Dado #2: " + dado2);

                int sumadados = dado1 + dado2;
                System.out.println("Suma de dados: " + sumadados);

                if (esPrimertirada == true) {
                    if (sumadados == 7 || sumadados == 11) {
                        System.out.println("!Has ganado en la primera tirada¡");
                        break;
                    } else if (sumadados == 2 || sumadados == 3 || sumadados == 12) {
                        System.out.println("!Has perdido en la primera tirada¡");
                        break;
                    } else {
                        System.out.println("Se establece un punto en: " + sumadados);
                        puntopartida = sumadados;
                        esPrimertirada = false;
                    }
                } else {
                    if (sumadados == puntopartida) {
                        System.out.println("!Has Ganado!");
                        break;
                    } else if (sumadados == 7) {
                        System.out.println("Esta linea de codigo SI se ejecutara");
                        System.out.println("!Has Perdido!");
                        break;
                    }
                }*/
                System.out.println();
            }

            System.out.print("¿Quieres continuar el juego? ¡NO! PRESIONES EL NUMERO 9: ");
            finalizacionBucleWhile = ingreso.nextInt();
            System.out.println();
            
        }
        System.out.println("FUERA DEL JUEGO");
    }
    // Metoo para imrpimir aleatoriamente un contenido del diccionario
    private static void imprimirContenidoAleatorio(Map<String, Integer> diccionarioAleato){
        Random randomDentro = new Random(); // Creamos otro objeto random para que nos genere elementos al azar

        // Obtenemos una lista de las llavves y seleccionamos una al azar
        Object[] listaDeLlaves = diccionarioAleato.keySet().toArray();

        // Guardamos en una variable en nuestra lista de llaves pero dentro utilizamos el random para generar algo aleatorio
        String llaveAleatoria = (String) listaDeLlaves[randomDentro.nextInt(listaDeLlaves.length)];

        // Imprimimos la llave aleatoria y el valor asociado
        System.out.println(llaveAleatoria + ": " + diccionarioAleato.get(llaveAleatoria));

    }

    private static void imprimirValorAleatorio(Map<String, Integer> dicvalorAleatorio){
        Random ValorAlea = new Random(); // Creamos un random que es el que nos servira para darnos un valor aleatorio
        
        //Obtenemos una lista de valores y selecionamos una al azar
        Object[] listaDeValores = dicvalorAleatorio.values().toArray();


        // Guardamos en una variable los valores que obtuvimos de nuestro diccionario y utilizamos un random para que nos genere un valor aleatorio
        int valoresAleatorios = (Integer) listaDeValores[ValorAlea.nextInt(listaDeValores.length)];

        // Buscamos la llave asociada al valor correspondiente
        String llavePerteneciente = null;
        for (Map.Entry<String, Integer> entry: dicvalorAleatorio.entrySet()){
            if (entry.getValue().equals(valoresAleatorios)){
                llavePerteneciente = entry.getKey();
                break;
            }
        }        
        // Imprimimos la llave aleatorio y el valor asociado
        System.out.println("valor: "+valoresAleatorios+", llave: "+ llavePerteneciente);

    }
}
