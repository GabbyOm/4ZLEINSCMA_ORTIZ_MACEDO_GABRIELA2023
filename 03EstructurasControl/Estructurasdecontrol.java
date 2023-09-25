/*
  * vamos a crear un programa mediante el cual debebamos tener un meno
  de seleccion para elegir alguna de las 14 opciones siguientes:
  1- Bono o descuento por edad
  2- Convertir numeros decimales  binarios
  3- Convertir temperaturas
  4- Numeros de positivos o negativos
  5- tiendita
  6- Area o perimetro
  7- Tabla
  8- Factorial
  9- Dibujitos
  10- Figura basica
  11- Patron
  12- Diamante
  13- Calculadora
  14- Salir

  */
//declarar son las librerias que vamos a ocupar 
//se debe estructutrar el tipo de datos acorde a su entrada
//si es entero obtenerlo como entero, si char obtenerlo como caracter
import java.util.Scanner;

class EstructurasControl{
//si declaramos aqui las variables son globales
     /**
     * @param args
     */
    public static void main(String[] args){
     try (//el manejo de objeto, nos ayuda a poder instancear,(mandando a llamar al objeto)
              //para hacer una instancia, es necesario 1- indentificar el tipo de objeto
              //2-nombrar al objeto
              //3-Crear al objeto
        Scanner entrada = new Scanner(System.in)) {
            int lado1, lado2, lado3, radio, radio1, volumen, radio2, cilindro=0, radio3, altura2=0, area1, base1,altura1, perimetro1;
            int opcion, numbinario, cantidadproducto, num1, compra1=0, edad, n1=0, n2=0, n3=0, n4=0, area, perimetro, base, altura=0;
            double total; ;
              float precio, resultado = 0, compra = 0, Celsius, Fahrenheit;
              double Kelvin;
              double Rankine;
              String nombreproducto;
              String binario = "";
              char letra;

              
              do{
                   //aqui va todo el programa 
                    System.out.println ("Bienvenido al programa:3");
                    System.out.println ("Elije alguna opcion deseada");
                    System.out.println ("1- Descuento por edad ");
                    System.out.println ("2- Covertir nuemro decimal a binario");//jimmy
                    System.out.println ("3- Covertir Temperaturas");
                    System.out.println ("4- numeros positivos y negativos ");
                    System.out.println ("5- tiendita");//jimmy
                    System.out.println ("6- Area y Perimetro");
                    System.out.println ("7- tabla");//jimmy
                    System.out.println ("8- Factorial");
                    System.out.println ("9- Dibujito");//jimmy
                    System.out.println ("10- Figura Hueca");
                    System.out.println ("11- Patrones de Codigo");
                    System.out.println ("12- Diamante ");
                    System.out.println ("13- calculadora");
                    System.out.println ("14- Salir");   
                     opcion = entrada.nextInt();

                    int n;
                    //menu
                    switch(opcion){
                           case 1:
                           System.out.println("Ingrese el total de su compra:");
                           compra = entrada.nextFloat();
                           System.out.println("El Total de su Compra es: " +compra);
                           System.out.println("Se Aplica un Descuento si es Mayor de Edad o Socio");
                           System.out.println("Ingrese su Edad: ");
                           edad = entrada.nextInt();
                           System.out.println("Ingrese el Nombre de la Persona");
                            letra = entrada.next().charAt(0);
               
                            if( edad <= 21 ){
                           System.out.println("Los Padres del Cliente son Socios ?");
                           System.out.println("(1) Si");
                           System.out.println("(2) No");
                           opcion = entrada.nextInt();

                            if(opcion == 1){
                           System.out.println("El Cliente: "+ letra+" Se le Aplica el Descuento del 45%");
                           total = (float) (compra * 0.45);
                           System.out.println("Su Total con Descuento es: " + total);
                           }else if(opcion == 2){
                           System.out.println("Los Padres del Cliente: "+ letra +" No son Socios");
                           System.out.println("Por lo cual solo se Aplicara el Descuento del 25%");
                            total = (compra * 0.25);
                           System.out.println("Su Total con Descuento es: "+ total);
                           }
                           }else if(edad >= 65){
                           System.out.println("Al Cliente: "+letra+" Se le Aplicara un Descuento del 40%");
                           total = (compra * 0.40);
                           System.out.println("Su Total con Descuento es: "+total);

                           }else if(edad > 21 && edad < 65){
                           System.out.println("Es Socio o tiene un Familiar que sea Socio ?");
                           System.out.println("(1) Si");
                           System.out.println("(2) No");
                           opcion = entrada.nextInt();

                           if(opcion == 1){
                           System.out.println("El Cliente: "+ letra+" Se le Aplica el Descuento del 45%");
                            total = compra * 0.45;
                           System.out.println("Su Total con Descuento es: "+total);
                           }else if(opcion == 2){
                           System.out.println("Los Padres del Cliente: "+letra+" No son Socios");
                           System.out.println("Por lo cual solo se Aplicara el Descuento del 25%");
                           total = compra * 0.25;
                           System.out.println("Su Total con Descuento es: " +total);
                           }
                           }
                             break;
                             case 2:
                              //decimal a binario
                             System.out.println("Ingresa un Numero Positivo Entero que Desee Convertir a Binario");
                             numbinario = entrada.nextInt();
                             //primero tengo que saber que sea positivo
                             if(numbinario > 0){
                             //se cuantas veces el numero se va a dividir entre 2?
                             while (numbinario%2 == 0){
                             if(numbinario%2 == 0);{
                             binario = "0" + binario;
                           
                             binario = "1" + binario;
                             }
                             numbinario = (int)numbinario/2;
                             }
   
                             }else if(numbinario == 0 ){
                             binario = "0" + binario;
                             }else if(numbinario <= 0){
                             binario = ("No se puede convertir un  numero negativo solo positivo");
                             } 
                              System.out.println("el numero binario es: " + binario);                            
                              break;
                               case 3:

                        System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
                        Fahrenheit = entrada.nextInt();
                        System.out.println("Elija la conversión deseada:");
                        System.out.println("1. Fahrenheit a Celsius");
                        System.out.println("2. Fahrenheit a Kelvin");
                        System.out.println("3. Fahrenheit a Rankine");
                        int conversion = entrada.nextInt();

                        switch (conversion) {
                        case 15:
                            Celsius = (Fahrenheit - 32) * 5 / 9;
                            System.out.println("La temperatura en grados Celsius es: " + Celsius);
                            break;
                        case 16:
                            Kelvin = ((Fahrenheit - 32) * 5 / 9 + 273.15);
                            System.out.println("La temperatura en Kelvin es: " + Kelvin);
                            break;
                        case 17:
                            Rankine = Fahrenheit + 459.67;
                            System.out.println("La temperatura en Rankine es: " + Rankine);
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            break;
                             }
                        case 4:

                          System.out.println("Digite la Cantidad de Numeros que va a Ingresar");
                          n = entrada.nextInt();
                         if(n > 0){
                         for(int i = 1; i <= n; i++){
                         System.out.println("Ingrese los Numeros a Leer");
                         n1 = entrada.nextInt();
                         if(n1 > 0){
                          n2++;
                          
                         }else if(n1 < 0){
                         n3++;
                          
                         }else if(n1 ==0){
                         n4++;
                           
                        }
                        }
                         System.out.println("Los Numeros: "+n1+" "+n2+" Son Positivos");
                         System.out.println("Los Numeros: "+n1+" "+n2+" Son Negativos");
                         System.out.println("Los Numeros: "+n1+" "+n2+" Son Neutros");

                         }else if(n <= 0){
                         System.out.println("La Cantidad Ingresada es Incorrecta");
                         System.out.println("Vuelva a Ingresar UNA Cantidad Correcta");
                         }
                        break;
                        case 5:

                        System.out.println("Bienvenido a la tiendita");
                       System.out.println("POr favor ingrese el mumero de productos que va a comprar:");
                       total = entrada.nextInt();

                       for( int i = 1; i <=total; i++){
                       System.out.println("Ingrese el nombre del producto: ");
                       nombreproducto = entrada.next();
                       System.out.println("Ingrese el precio: ");
                       precio = entrada.nextFloat();
                       System.out.println("Ingrese la cantidad: ");
                        cantidadproducto = entrada.nextInt();
                    
                       resultado = precio * cantidadproducto;
                       compra = compra + resultado;
                    
                       }
                       System.out.println("El total de la compra es: " + compra);
                       compra = 0;
                      break;
                        
                      case 6:
                           
                             System.out.print("1.- Area y perimetro de un rectangulo.");
                             System.out.print("2.- Area y perimetro de un triangulo.");
                             System.out.print("3.- Volumen de una esfera.");
                             System.out.print("4.- Volumen de un cilindro.");
                         
                             System.out.print("Ingrese 1, 2, 3 o 4 dependiendo lo que desea elegir:");
                             int eleccion = entrada.nextInt();

                            if(eleccion == 1){
                              System.out.println("Usted eligio la opcion 1");
                              System.out.println("Ingrese la base del rectangulo: ");
                              base1 = entrada.nextInt();
                              System.out.println("Ingrese la altura del rectangulo: ");
                              altura1 = entrada.nextInt();
                              area1 = base1 * altura1;
                             perimetro1 = (base1 +altura1) * 2;
                             System.out.println("El area del rectangulo es :" +area1+" cm2");
                             System.out.println("El perimetro del rectangulo es:" +perimetro1+ "cm");
                              break;
                            }
                            
                            

                            if (eleccion == 2){
                              System.out.println("Usted eligio la opcion 2");
                             System.out.println("Ingrese la medida del primer lado del tringulo:");
                             lado1= entrada.nextInt();
                              System.out.println("Ingrese la medida del segundo lado del tringulo:");
                             lado2= entrada.nextInt();
                             System.out.println("Ingrese la medida de la base del tringulo:");
                             base = entrada.nextInt();
                             System.out.println("Ingrese la altura del triangulo: ");
                             int altura3 = entrada.nextInt();

                             area = (base * altura3) /2;
                             perimetro = (lado1+ lado2+ base);
                              System.out.println("El area del rectangulo es :" +area+" cm2");
                             System.out.println("El perimetro del rectangulo es:" +perimetro+ "cm");
                             break;
                            }
                            

                             if(eleccion == 3){
                              System.out.println("Usted eligio la opcion 3");
                             System.out.println("Ingrese el radio de la esfera: ");
                             radio = entrada.nextInt();
                             radio1 = (radio*radio*radio);
                              volumen = (int) (4/3*3.1416*radio1);
                              System.out.println("El volumen de la esfera es: " +volumen);
                              break;
                             }
                             

                             if (eleccion == 4){
                              System.out.println("Usted eligio la opcion 4");
                              System.out.println("Ingrese el radio del cilindro: ");
                              radio2 = entrada.nextInt();
                              System.out.println("Ingrese la altura del cilindro:");
                              int altura3 = entrada.nextInt();
                              radio3 =(radio2*radio2);
                              int volumen2 = (int) (3.1416*radio3*altura3);

                              System.out.println("El volumen del cilindro es:" +volumen2);
                              break;
                           } 
                             case 7:
                             break;
                             case 8:
                             break;
                             case 9:
                             break;
                             case 10:
                             break;
                             case 11: 
                             break;
                             case 12:
                             break;
                             case 13: 
                             break;
                             case 14:
                             break;
                             default:
                             System.out.println("Elije la opcion");
                              break;



                            }
                  

                             System.out.println("Desea repetir el programa?, escribe s para si");
                              letra = entrada.next().charAt(0);

                             }while(letra == 's' || letra == 'S');
        }

      //es declarar a las variables que se van a utilizar en el programa 
      //las variables son de dos tipos globales y locales
      //si la declaro dentro del metodo es local

     }

    private static int nextInt() {
      return 0;
    }

}