/*es declarar a las variables que se van a utilizar en el programa 
  las variables son de dos tipos globales y locales
 si la declaro dentro del metodo es local
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
            int  factorial1=0,r=0, o=0,lado1, lado2, lado3, radio, radio1, volumen, radio2, cilindro=0, radio3, altura2=0, area1, base1,altura1, perimetro1;
            int opcion, numbinario, cantidadproducto, num1, compra1=0, edad, n1=0, n2=0, n3=0, n4=0, area, perimetro, base, altura=0;
            int numero=0, factorial=1, figurah=0, num2=0;
            double total;
              float precio, resultado = 0, compra = 0, Celsius, Fahrenheit=0;
              double Kelvin;
              double Rankine;
              String nombreproducto;
              String binario = "";
              char letra;
              float cant1, cant2, sum;

              
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
                    int n5;
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
                    System.out.println("Ingresa un numero positivo entero que desee convertir a binario");
                    numbinario = entrada.nextInt();
                    //primero tengo que saber que sea positivo
                    if(numbinario > 0){
                        //se cuantas veces el numero se va a dividir entre 2
                        while(numbinario > 0){
                            if(numbinario%2 == 0){
                                binario = "0" + binario;
                        }else{
                            binario = "1" + binario;
                        }
                        numbinario = (int)numbinario/2;
                    }    

                    }else if(numbinario == 0 ){
                        binario = "0" + binario;

                    }else if(numbinario < 0){
                        binario = "No se puede convertir un numero negativo, solo positivos";
                    }
                    System.out.println("El numero binario es: " + binario);                            
                              break;
                               case 3:
                    System.out.println("1.- Convertir de Celcius a Fahrenheit, Celcius a Kelvine, Celcius a Rankine");
                    System.out.println("2.- Convertir de Fahrenheit a Celcius, Fahrenheit a Kelvine, Fahrenheit a Rankine");
                    System.out.println("3.- Convertir de Kelvine a Celcius, Kelvine a Fahrenheit, Kelvine a Rankine");
                    System.out.println("4.- Convertir de Rankine a Celcius, Rankine a Fahrenheit, Rankine a Kelvine");
                    opcion = entrada.nextInt();

                        float gradosC;
                        float gradosF;
                        float gradosK;
                        float gradosR;
                        if(opcion == 1){
                      System.out.println("Ingrese el numero de grados Celcius para convertir");
                      gradosC = entrada.nextInt();
                      gradosF = (float) (1.8 * gradosC + 32);
                      gradosK = (float) (273.15 + gradosC);
                      gradosR = (float) (1.8 * gradosC + 491.67);
                      System.out.println("Los grados fahrenheit son: "+gradosF+"°");
                      System.out.println("Los grados kelvine son: "+gradosK+"°");
                      System.out.println("Los grados rankine son: "+gradosR+"°");

                    }else if(opcion == 2){
                     System.out.println("Ingrese el numero de grados Fahrenheit a convertir");
                     gradosF = entrada.nextFloat();
                     gradosC = (float) (gradosF - 32 / 1.8);
                     gradosK = (float) (((gradosF - 32) / 1.8) + 273.15);
                     gradosR = (float) (gradosF + 459.67);
                     System.out.println("Los grados celcius son: "+gradosC+"°");
                     System.out.println("Los grados kelvine son: "+gradosK+"°");
                     System.out.println("Los grados rankine son: "+gradosR+"°");

                    }else if(opcion == 3){
                     System.out.println("Ingrese el numero de grados kelvine a convertir");
                     gradosK = entrada.nextFloat();
                     gradosC = (float) (gradosK - 273.15);
                     gradosF = (float) (((gradosK - 273.15) * 1.8) + 32);
                     gradosR = (float) (1.8 * gradosK);
                     System.out.println("Los grados celcius son: "+gradosC+"°");
                     System.out.println("Los grados fahrenheit son: "+gradosF+"°");
                     System.out.println("Los grados rankine son: "+gradosR+"°");

                    }else if(opcion == 4){
                     System.out.println("Ingrese el numero de grados rankine a convertir");
                     gradosR = entrada.nextFloat();
                     gradosC = (float) (5/9 * (gradosR - 491.67));
                     gradosF = (float) (gradosR - 459.67);
                     gradosK = 5/9 * (gradosR);
                     System.out.println("Los grados celcius son: "+gradosC+"°");
                     System.out.println("Los grados fahrenheit son: "+gradosF+"°");
                     System.out.println("Los grados rankine son: "+gradosK+"°");
                    }
                    break;
                            
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
                         System.out.println("Vuelva a Ingresar una Cantidad Correcta");
                         }
                        break;
                        case 5:

                        System.out.println("Bienvenido a la tiendita");
                       System.out.println("Por favor ingrese el numero de productos que va a comprar:");
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
                           
                             System.out.println("1.- Area y perimetro de un rectangulo.");
                             System.out.println("2.- Area y perimetro de un triangulo.");
                             System.out.println("3.- Volumen de una esfera.");
                             System.out.println("4.- Volumen de un cilindro.");
                         
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
                             System.out.println("Ingrese la medida del primer lado del tringulo isoceles:");
                             lado1= entrada.nextInt();
                              System.out.println("Ingrese la medida del segundo lado del tringulo:");
                             lado2= entrada.nextInt();
                             System.out.println("Ingrese la medida de la base del tringulo:");
                             base = entrada.nextInt();
                             System.out.println("Ingrese la altura del triangulo isoceles: ");
                             int altura3 = entrada.nextInt();

                             area = (base * altura3) /2;
                             perimetro = (lado1+ lado2+ base);
                              System.out.println("El area del triangulo isoceles es :" +area+" cm2");
                             System.out.println("El perimetro del triangulo isoceles es:" +perimetro+ "cm");
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
                             //vamos a imprimir una tabla
                             //un ciclo for

                             int t;
                             for(t=1; t<=10; t++){
                               System.out.println(t + " "+ (t*10) + " "+ (t*100) + " "+ (t*1000)+ " ");
                             }
                             break;
                             case 8:

                             System.out.println("Ingrese un numero positivo a calcular su factorial ");
                             numero = entrada.nextInt();

                            if(numero<0){
                              System.out.println("Ingrese un numero correcto: ");
                              numero= entrada.nextInt();
                            } else{
                            
                              factorial1 = 1;
                            }
                             for(int i=1; i<=numero;i++){
                              factorial1 = factorial1*i;
                               }
                              int i=1;
                         
                        System.out.println("El factorial de su numero..."  + numero+   "...es: "  +  factorial1 );
                               
                                 break;
                             case 9:
                              System.out.println("Cuadrado magico");
                              System.out.println("Ingrese el tamaño del cuadrado a pintar: ");
                              num1= entrada.nextInt();

                              if(num1>= 1 && num1<=20){
                                //definir un ciclo para columnas
                                for(int c=1; c<= num1; c++){
                                  //imprimir columnas
                                  for (int g =1; g<= num1; g++){
                                    System.out.print("*");
                                  }
                                  System.out.println("");
                                }
                              }else{
                                System.out.println("Ingrese solo numeros entre el 1 y 20: ");
                              }

                             break;
                             case 10:

                             System.out.println("Ingrese el tamaño de la figura hueca:");
                             figurah =entrada.nextInt();

                             if( figurah>= 0 && figurah<= 50);
                                   for(int f=0; f<figurah; f++){
                                    System.out.print("*");

                                   }
                                   System.out.println();

                                   for(int f =0; f<figurah-2; f++){
                                    System.out.print("*");
                                    for(int g=0; g<figurah-2; g++){
                                      System.out.print (" ");
                                    }
                                    System.out.println("*");
                                   }

                                    for(int f=0; f<figurah; f++){
                                    System.out.print("*");
                                    }
                                  break;
                             case 11:
                             System.out.println("Patrones de codigo");
                             System.out.printf("%s%s%s%s%s%s%s%s%n","*","*","*","*","*","*","*","*");
                             System.out.printf("%2s%s%s%s%s%s%s%s%n","*","*","*","*","*","*","*","*");
                             System.out.printf("%s%s%s%s%s%s%s%s%n","*","*","*","*","*","*","*","*");
                             System.out.printf("%2s%s%s%s%s%s%s%s%n","*","*","*","*","*","*","*","*");
                             System.out.printf("%s%s%s%s%s%s%s%s%n","*","*","*","*","*","*","*","*");
                             System.out.printf("%2s%s%s%s%s%s%s%s%n","*","*","*","*","*","*","*","*");
                             System.out.printf("%s%s%s%s%s%s%s%s%n","*","*","*","*","*","*","*","*");
                             System.out.printf("%2s%s%s%s%s%s%s%s%n","*","*","*","*","*","*","*","*");
                             
                             break;
                             case 12:
                              System.out.println("Diamante :)");
                             final int n9 = 5;
 
                              for ( o = 1; o <= n9; o++)
                               {
                              for (int j = o; j < n9; j++) {
                               System.out.print(' ');
                              }
                              for (int k = 1; k < 2*o; k++) {
                               System.out.print('*');
                                 }
                               System.out.print(System.lineSeparator());
                              }
                              for ( o = n9 - 1; o >= 1; o--)
                              {
                              for (int j = n9; j > o; j--) {
                                System.out.print(' ');
                              }
                              for (int k = 1; k < (o * 2); k++) {
                               System.out.print('*');
                              }
                               System.out.print(System.lineSeparator());
                              }
                               break;

                             case 13:
                             
                             System.out.println("Bienvenido a la calculadora de Gaby :)");
                             System.out.println("1. Si deseas hacer una suma.");
                             System.out.println("2. Si deseas hacer una resta.");
                             System.out.println("3. Si deseas hacer una multiplicacion.");
                             System.out.println("4. Si deseas hacer una division.");

                             System.out.print("Ingrese 1, 2, 3 o 4 dependiendo lo que desea elegir:");
                             int opc= entrada.nextInt();

                             if(opc == 1){
                             System.out.println("Usted eligio hacer una suma");
                             System.out.println("Ingrese su primer cantidad o numero: ");
                             cant1 = entrada.nextFloat();
                             System.out.println("Ingrese su segunda cantidad o numero: ");
                             cant2 = entrada.nextFloat();
                             sum =(cant1 + cant2);
                             System.out.println("El resultado de su suma es...: " +sum );
                             break;
                             }

                             if(opc == 2){
                             System.out.println("Usted eligio hacer una resta");
                             System.out.println("Ingrese su primer cantidad o numero: ");
                             cant1 = entrada.nextFloat();
                             System.out.println("Ingrese su segunda cantidad o numero: ");
                             cant2 = entrada.nextFloat();
                             float rest = (cant1 - cant2);
                             System.out.println("El resultado de su resta es...: " +rest);
                             break;
                             }
                 
                             if(opc == 3){
                             System.out.println("Usted eligio hacer una multiplicacion");
                             System.out.println("Ingrese su primer cantidad o numero: ");
                             cant1 = entrada.nextFloat();
                             System.out.println("Ingrese su segunda cantidad o numero: ");
                             cant2 = entrada.nextFloat();
                             float mult = (cant1 * cant2);
                             System.out.println("El resultado de su multiplicacion es...: " +mult);
                             break;
                             }

                             if(opc == 4){
                             System.out.println("Usted eligio hacer una division");
                             System.out.println("Ingrese su primer cantidad o numero: ");
                             cant1 = entrada.nextFloat();
                             System.out.println("Ingrese su segunda cantidad o numero: ");
                             cant2 = entrada.nextFloat();
                             float div = (cant1 / cant2);
                             System.out.println("El resultado de su division es...: " +div);
                             break;
                             }

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


     }

    /**
     * @return
     */
    private static int nextInt() {
      return 0;
    }

}