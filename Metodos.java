package CRUD_JAVA;

import java.util.*;
public class Metodos {

    static Scanner entrada = new Scanner(System.in);

    public void ingresarPersona(LinkedList<Persona>p){

        System.out.print("Ingrese nombre :");
        String nombre = entrada.next();
        System.out.print("Ingrese apellido :");
        String apellido = entrada.next();
        System.out.print("Ingrese edad persona :");
        int edad = entrada.nextInt();
        System.out.print("Ingrese genero :");
        char genero = entrada.next().charAt(0);

        Persona per = new Persona(nombre, apellido, edad, genero);
        p.add(per);
        System.out.println("PERSONA CREADA EXITOSAMENTE");
                                                }

    public void mostrarPersona(LinkedList<Persona>p){
        System.out.println("NOMBRE\tAPELLIDO\tEDAD\tGENERO");

        for(Persona per : p){
            System.out.println(per.getNombre()+"\t"+per.getApellido()+"\t\t"+per.getEdad()+"\t"+per.getGenero());
                            }
                                                    }

    public void actualizarPersona(LinkedList<Persona>p){

        System.out.print("Ingrese indice a actualizar :");
        int aux = entrada.nextInt();

        System.out.print("Ingrese nuevo nombre :");
        String nombre = entrada.next();
        System.out.print("Ingrese nuevo apellido :");
        String apellido = entrada.next();
        System.out.print("Ingrese nueva edad persona :");
        int edad = entrada.nextInt();
        System.out.print("Ingrese nuevo genero :");
        char genero = entrada.next().charAt(0);

        Persona per = new Persona(nombre, apellido, edad, genero);
        p.set(aux, per);
        System.out.println("SE ACTUALIZO CORRECTAMENTE LA PERSONA");
                                                       }                                                

        public void eliminarPersona(LinkedList<Persona>p){

        System.out.print("Ingrese indice a eliminar :");
        int aux = entrada.nextInt();
        p.remove(aux);
        System.out.println("SE ELIMINO CORRECTAMENTE A LA PERSONA");
                                                       }                                                   

                                                }