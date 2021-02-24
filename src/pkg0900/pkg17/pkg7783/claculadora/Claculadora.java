
package pkg0900.pkg17.pkg7783.claculadora;

import java.util.Scanner;


/**
 *
 * @author edydu
 */
public class Claculadora {
 /**
  * 
  * @author alumno
  */
    
        

                
    // Metodo principal
    public static void main (String[] args) {
        
        // Define variables 
        Scanner objInput = new Scanner(System.in);
        String strContinuar = null;
        
        do {
            //menu
            System.out.println("Seleccionar una opcion");
            System.out.println("a - Si desea sumar");
            System.out.println("b - Si desea restar");
            System.out.println("c - Si desea Multiplicar");
            System.out.println("d - Si desea dividir");
            
            System.out.println("Escriba su opcion:");
            
            // Recibe el valor del buffer del teclado
            String strOpcion = objInput.nextLine();
            
            // Definir variables para las operaciones
            float[] fltArrNumeros = new float[2];
            float fltResultado = 0;
            
            // Define variable de error
            boolean blnError = true;
            
            switch(strOpcion) {
                case "a":
                    strOpcion = "Suma";
                    System.out.println("");
                    
                    // Solicitar los valores numericos
                    for (int i=0; i<fltArrNumeros.length; i++) {
                        System.out.println("Ingrese el numero " + (i+1) + " : ");
                        fltArrNumeros[i] = objInput.nextFloat();
                    }
                    
                    fltResultado = fltArrNumeros[0] + fltArrNumeros[1];
                    
                    // Control
                    blnError = false;
                    
                    // Sale del case
                    break;
                    
                case "b":
                    strOpcion = "Resta";
                    System.out.println("");
                    
                    // Solicitar los valores numericos
                    for (int i=0; i<fltArrNumeros.length; i++) {
                        System.out.println("Ingrese el numero " + (i+1) + " : ");
                        fltArrNumeros[i] = objInput.nextFloat();
                    }
                    
                    fltResultado = fltArrNumeros[0] - fltArrNumeros[1];
                    
                    // Control
                    blnError = false;
                    
                    // Sale del case
                    break;
                    
                    
                case "c":
                    strOpcion = "Multiplicacion";
                    System.out.println("");
                    
                    // Solicitar los valores numericos
                    for (int i=0; i<fltArrNumeros.length; i++) {
                        System.out.println("Ingrese el numero " + (i+1) + " : ");
                        fltArrNumeros[i] = objInput.nextFloat();
                    }
                    
                    fltResultado = fltArrNumeros[0] * fltArrNumeros[1];
                    
                    // Control
                    blnError = false;
                    
                    // Sale del case
                    
                    break;
                    
                    case "d":
                    strOpcion = "Dividir";
                    System.out.println("");
                    
                    // Solicitar los valores numericos
                        System.out.println("Ingresa el numerador:");
                        fltArrNumeros[0] = objInput.nextFloat();
                        System.out.println("Ingresa el denominador:");
                        fltArrNumeros[1] = objInput.nextFloat();
                    
                        if (fltArrNumeros[1] != 0){
                            fltResultado = fltArrNumeros[0] / fltArrNumeros[1];
                        } else {
                            System.out.println("No puedes dividir entre cero!!");
                            blnError = true;
                            fltResultado =  Integer.MAX_VALUE;
                        }
                    
                    // Control
                    blnError = false;
                    
                    // Sale del case
                    
                    break;
                    
                default:
                    
                    // sale del case
                    break;

            }
            
            System.out.println("");
            
            // Despliegue de los datos, si no hay error
            if (blnError==false) {
                System.out.println("El resultado es: " + fltResultado);
            }
            else if (blnError == true) {
                System.out.println("Error no se puede realizar su operacion");
            }
            
            System.out.println("La opcion seleccionada es " + strOpcion);
            
            System.out.println("Desea continuar? S/N");
            
            // Capturar el buffer para continuar
            Scanner objInput2 = new Scanner(System.in);
            strContinuar = objInput2.nextLine();
        } while (strContinuar.equals("s") || strContinuar.equals("S"));   
    }

    
}
