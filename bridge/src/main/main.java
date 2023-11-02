package main;

import java.util.Scanner;

import Abstraccion.*;
import Implementacion.*;

public class main {
    public static void main(String[] args) {
    	 Scanner scanner = new Scanner(System.in);

         System.out.println("Seleccione un dispositivo de control:");
         System.out.println("1. Display");
         System.out.println("2. Laptop");
         System.out.println("3. SmartTV");
         int choice = scanner.nextInt();

         Dispositivo dispositivo = null;
         DispositivoDeControl control = null;
         String accionEspecial = "";

         switch (choice) {
	         case 1:
	        	 dispositivo = new DispositivoEnCasa("Display");
	             accionEspecial = "No";
	             control = new DispositivoDeControl(dispositivo);
	             break;
             case 2:
            	 dispositivo = new Laptop();
                 accionEspecial = "Editar foto";
                 control = new ControlEspecial(dispositivo);
                 break;
             case 3:
            	 dispositivo = new SmartTV();
            	 accionEspecial = "Cambiar canal";
            	 control = new ControlEspecial(dispositivo);
                 break;
             default:
                 System.out.println("Selección no válida.");
                 System.exit(0);
                 break;
         }
         
        choice = 0;
        
        do {

            System.out.println("======================");
            System.out.println("Seleccione una accion:");
            System.out.println("1. Encender");
            System.out.println("2. Apagar");
            System.out.println("3. Mostrar imagen");
            System.out.println("4. Ajustar volumen");
            System.out.println("5. Ajustar Imagen");
            if(!accionEspecial.equals("No")) {
            	System.out.println("6. " + accionEspecial);
            }
            System.out.println("7. Ver información");
            System.out.println("8. Salir");
            choice = scanner.nextInt();

        	switch(choice) {
        	case 1:
        		control.encender();
        		break;
        	case 2:
        		control.apagar();
        		break;
        	case 3:
                System.out.println("indique que imagen va a colocar");
        		String imagen = scanner.next();
        		control.mostrarImagen(imagen);
        		break;
        	case 4:
                System.out.println("indique que volumen va a colocar");
        		int volumen = scanner.nextInt();
        		control.ajustarVolumen(volumen);
        		break;
    		case 5:
    			control.ajustarImagen();
    			break;
    		case 6:
                if(!accionEspecial.equals("No")) {
                	if(accionEspecial.equals("Editar foto")) {
                        System.out.println("indique que edición va a colocar a la imagen");
                		String edicion = scanner.next();
                		control.editarImagen(edicion);
                	}else {
                        System.out.println("indique a que canal que desea cambiar");
                		int canal = scanner.nextInt();
                		control.cambiarCanal(canal);
                	}
                }
    			break;
    		case 7:
    			control.mostrarInformacion();
    			break;
    		case 8:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Selección no válida.");
        	}
        	
        }while(choice != 8);


        scanner.close();
     }
}

