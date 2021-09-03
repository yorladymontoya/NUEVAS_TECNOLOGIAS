
package tallerprimermomento;

import java.util.ArrayList;
import java.util.Scanner;


public class TallerPrimerMomento {
//Se crea un ArrayList para guardar objetos de tipo Coche.
    static ArrayList<Jugadores> jugadores= new ArrayList();
   static  Scanner obtener=new Scanner(System.in);
    
    public static void main(String[] args) {
        leerJugadores();
         System.out.println("\nJugadores convocados:"  );
        
        
    }
      //Método para leer jugadores introducirlos en el array
    public static void leerJugadores(){
 
        //Declaración de variables para leer los jugadores
        byte camisa;
        String nombre;
        String apellidos;
        String posicion;
        String equipo;
        byte edad;
        
       //Variable auxiliar que contendrá la referencia a cada coche nuevo.
        Jugadores aux;
        int i, N;
        
          //se pide por teclado el número de jugadores a ingresar
        do {
            System.out.print("Cuantos jugadores seran convocados? ");
            N = obtener.nextInt();
        } while (N < 0);
        obtener.nextLine(); //limpiar el intro
        //lectura de N coches
        for (i = 1; i <= N; i++) {
            //leer datos de cada jugador
            System.out.println("Jugador " + i);
            System.out.print("Camiseta: ");
            camisa = obtener.nextByte();          
            System.out.print("Nombre: ");
            nombre = obtener.nextLine();
            System.out.print("Apellidos: ");
            apellidos = obtener.nextLine();
            System.out.print("Edad: ");
            edad = obtener.nextByte();     
            System.out.print("Posicion en la que juega: ");
            posicion = obtener.nextLine();
            obtener.nextLine(); //limpiar el intro
   
            aux = new Jugadores(); //Se crea un objeto Coche y se asigna su referencia a aux 
            
}
    }
}
