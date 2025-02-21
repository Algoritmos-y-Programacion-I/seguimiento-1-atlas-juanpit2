/*
* Analisis
* Descripcion del programa: calcular el costo y elaborar las facturas de cada paquete de viaje vendido.


* Entradas: nombre, edad, documento de identidad, ciudad de la que esta cotizando el viaje
* Salidas: total de tiquetes, nombre,edad, identficacion
* Ejemplo:
*/

package ui;

import java.util.Scanner;

public class Atlas {

	private Scanner escaner;

    // Declaracion de constantes (completar)
    final double COSTO_TRAYECTO_AVION = 250000;
    final double COSTO_NOCHE = 150000;

	private Atlas() {
		escaner = new Scanner(System.in);
	}
	
	
	public void run()
	{   
        // Declaracion de info a pedir del usuario (completar)
        String nombre,ciudad;
        int edad, id,noches;
        double totalest;
        // Saludo
        System.out.println("Bienvenido al programa de viajes EVENTOS ATLAS realizado por los estudiantes de Algoritmos y programacion I de la Universidad ICESI.");
        // Pedir info al usuario (completar)
        System.out.println("Cual es tu nombre?");
        nombre = escaner.nextLine();
        System.out.println("Que edad tienes? ");
        edad= escaner.nextInt();
        System.out.println("Por favor escribe tu numero de identificacion ");
        id=  escaner.nextInt();
         System.out.println("Desde que ciudad se comunica con nosotros? ");
       ciudad = escaner.nextLine();
       escaner.nextLine();
         System.out.println("Bienvenido a Atlas, cuantas noches deseas hospedarte? ");
        noches= escaner.nextInt();
System.out.println("Super! La vas a pasar genial. Te quedaras 2 noches en Bogota y este es el resumen de tu compra: ");



        

        // ...
        System.out.println("Bienvenido " + nombre + "!");
                
          System.out.println("A nombre de: " + nombre + "!");
          System.out.println("edad: " + edad + "!");
          System.out.println("Documento: " + id + "!");
          
      

        // ...

        // Declaracion de salidas calculadas (completar)
        double totalTransporte, totest, totnoche, totestadia,costoser;
        // Calculo de salidas mediante metodos (completar)
        totalTransporte = calcularTotalTransporte(); // aqui podrian faltar parametros
        totnoche= noches * COSTO_NOCHE;
        
        costoser= totnoche * 0.10;
        totestadia= totnoche + costoser + COSTO_TRAYECTO_AVION;

       
        System.out.println(" Tu costo total es de" +  totestadia + "!");

	}

	public static void main(String[] args) {
		Atlas mainApp = new Atlas();
		mainApp.run();
	}

    // Completar metodos para calcular salidas

    /**
	 * Descripción: El método ... permite calcular ...
	 * @param 
	 * @return 
	 */
    public double calcularTotalTransporte() {
       
        return COSTO_TRAYECTO_AVION * 2;
        
         // Completar operacion
    }

	

	
}