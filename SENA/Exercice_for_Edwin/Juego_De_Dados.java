import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Juego_De_Dados {
    public static void main(String[] args) {
        System.out.println("JUEGO DE DADOS");

        Random random = new Random();
        //iniciarJuego = scanner.toString();
        /* 
        int dado1 = 1;
        int dado2= 6;
        int valor = aleatoriedad.nextInt(dado2 + dado1)+dado1;
        System.out.println(valor);*/
        
        /*
        for(int i =1; i<=6;i++){
            int valor = aleatoriedad.nextInt(((6-1)+1)+1);
            System.out.println(valor);
        }*/
        /*
        int min = 1;
        int max = 7;
        for(int i = min; i<=max; i++){
            int getRandom = (int) (Math.random() * (max-min)) + min;
            System.out.println(getRandom);
        }*/
        //Variable para verificar si es la primera ves que se tira
        boolean esPrimertirada = true;
        int puntopartida=0;

        for (int i = 1; i<6; i++){
            System.out.println("PARTIDA: " + i);
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;
            System.out.println("Dado #1: "+dado1+" |----| Dado #2: "+dado2);

            int sumadados = dado1 + dado2;
            System.out.println("Suma de dados: "+sumadados);

            if (esPrimertirada == true) {
                if (sumadados == 7 || sumadados == 11) {
                    System.out.println("!Has ganado en la primera tirada¡");
                    break;
                }else if (sumadados == 2 || sumadados == 3 || sumadados == 12){
                    System.out.println("!Has perdido en la primera tirada¡");
                    break;
                }else{
                    System.out.println("Se establece un punto en: "+sumadados);
                    puntopartida = sumadados;
                    esPrimertirada = false;
                }
            }else{
                if (sumadados == puntopartida) {
                    System.out.println("!Has Ganado!");
                    break;
                }else if (sumadados == 7){
                    System.out.println("Esta linea de codigo SI se ejecutara");
                    System.out.println("!Has Perdido!");
                    break;
                }
            }
        }    
        



        









    }
}
