//debe de tener una clase
//public class     class? no hay problema de como se ponga 

//variable   int num por defecto es publico   public int num
//libreria
import java.io.*;


class EntradaTexto{

    //debe de existir un metodo principal 
    public static void main(String[] args ) throws IOException {
         //debemos de crear un estructura basica
         //declaracion
        char nombre ;
        //mensaje para el usuario
         //mensaje para el usuario
         System.out.println("Por favor ingresa tu nombre                              ");
         //ln es para salto de linea

         //asignar que operacion o comportamiento le voy a otorgar a la variable
         nombre = (char)System.in.read();

         //System es la clase del sistema
         //console() es el metodo que puede obtener los datos de la consola
         //readLine() es el metodo que puede dar lectura a los datos introducidos en la consola

         System.out.println("Hola " + nombre + "Bienvenido a tronar JAJA");
    }


}