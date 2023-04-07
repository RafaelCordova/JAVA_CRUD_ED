package CRUD_JAVA;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        LinkedList<Persona> lista = new LinkedList<Persona>();
        Metodos ob = new Metodos();

        int opc;
        System.out.println("===INGRESO DE PERSONAS===");
        System.out.println("1.)INGRESAR PERSONA");
        System.out.println("2.)MOSTRAR PERSONAS");
        System.out.println("3.)ACTUALIZAR PERSONA");
        System.out.println("4.)ELIMINAR PERSONA");
        System.out.println("5)SALIR APLICACION");
        do{
        System.out.print("Ingrese su opcion:");
        opc = entrada.nextInt();

            switch(opc){
                    case 1: 
                    ob.ingresarPersona(lista);break;
                    case 2:
                    ob.mostrarPersona(lista);break;
                    case 3:
                    ob.actualizarPersona(lista);break;
                    case 4:
                    ob.eliminarPersona(lista);break;
                    case 5:
                    System.out.println("SALIDA DEL PROGRAMA"); break;
                    }


            }while(opc!=5);
        
        entrada.close();

    }


}
