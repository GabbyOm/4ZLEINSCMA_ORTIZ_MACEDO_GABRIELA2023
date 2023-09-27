//esta clase es la que se encarga de las operaciones de la calculadora y 
//tambien tendra opciones para convertir unidades crear cuadritos magicos

import java.util.Scanner;

class Ejercicios{
    //objeto para la entrada de datos
    Scanner entrada = new Scanner(System.in);

    //variables globales
    char op;

    //menu
    public void menu(){
        System.out.println("Ejercicios de tarea");
        System.out.println("a.- Calculadora");
        System.out.println("b.- Conversion de unidades");
        System.out.println("c.- Crear cuadro magico");
        System.out.println("d.- Desplazamiento de un cuadrito");
        System.out.println("Elije una opcion");

        op = entrada.next().charAt(0);

        switch(op){
            case 'a' :
              //aqui implementamos los metodos
              Ejercicio1();
              break;
            case 'b' :
              Ejercicio2();
              break;
            case 'c' :
              Ejercicio3();
              break;  
            case 'd' :
              Ejercicio4();
              break;
            default:
              System.out.println("Graciaaaaaas por jugar >.<");
        }

    }

    public void Ejercicio1(){
      //vamos a crear un programa que se encargue de convertir 
      //kg a libras
      // m/s a km/s
      //m a yardas y millas
      double metros=0.00, kg=0.00, velocidad=0.00, cm=100.00, pulgadas=0.0254, gramos=1000, libra=0.453592, ms=0.00;
      double conversion1, conversion2;
      System.out.println("Selecciona la cantidad que deseas convertir acorde a las siguientes unidades");
      System.out.println("a.- Metros a cm y pulgadas");
      System.out.println("b.- Kilogramos a libras y gramos");
      System.out.println("c.- M/S a Km/h ");
      System.out.println("d.- Metros a yardas y millas");

      op =entrada.next().charAt(0);

      switch(op){

        case 'a':
           System.out.println("Ingrese los metros que desea transformar:");
           metros = entrada.nextDouble();
           conversion1= metros * cm;
           conversion2= metros * pulgadas;
           System.out.println("La cantidad en metros es: " +metros+ "de m a cm son" 
           +conversion1+ " de m a pulgadas son:" +conversion2);
          break;
        case 'b':
           System.out.println("Ingrese los Kilogramos que desea transformar:");
           kg = entrada.nextDouble();
           conversion1= kg * gramos;
           conversion2= kg * libra;
           System.out.println("La cantidad en kilogramos : " +kg+ "de kg a gramos son" 
           +conversion1+ " de kg a libras son:" +conversion2);
          break;
        case 'c':
           System.out.println("Ingrese los metros que desea transformar:");
           metros = entrada.nextDouble();
           conversion1= metros * cm;
           conversion2= metros * pulgadas;
           System.out.println("La cantidad en metros es: " +metros+ "de m a cm son" 
           +conversion1+ " de m a pulgadas son:" +conversion2);
          break;
        case 'd':
          break;    
        default:
          System.out.println("Opcion no valida");
          break;          
      }
    }

    public void Ejercicio2() {

    }

    private void Ejercicio3() {

    }

    private void Ejercicio4() {

    }
}