public class p04_manipula_cadenas {
    public static void main(String[] args) {
        
        //Los datos de tipo char tienen que ir con comillas simples
        //char asd = 'd'; //solo una letra

        String nombre = "Jorgue el Curiosos";
        System.out.println("Mi nombre es: " + nombre);

        System.out.println("Mi nombre tiene "+nombre.length()+" Letras.");

        System.out.println("La primera letra del nombre es: "+ nombre.charAt(0)+ nombre.charAt(2+2));

        // Sacar la ultima letra
        int ultima_letra;
        ultima_letra = nombre.length();
        System.out.println("Y ultima letra es la "+nombre.charAt(ultima_letra-1)); 
    }
    
}
