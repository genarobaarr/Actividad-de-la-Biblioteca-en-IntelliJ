package Biblioteca_Act_1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int opcion1 = 0;
        int opcion2 = 0;
        int opcion3 = 0;

        while(opcion1 != 3) {

            System.out.println("\n\n\n\t\t\t\t\t<<<Biblioteca UV>>>\n");
            System.out.println("\t\tMenú:\n");
            System.out.println("\t1. Soy Miembro");
            System.out.println("\t2. Soy Personal");
            System.out.println("\t3. Salir del programa");
            System.out.println("\t>");

            Scanner entrada1 = new Scanner(System.in);
            opcion1 = entrada1.nextInt();

            if (opcion1 == 1) {

                System.out.println("\n\n\n\t\t\t\t\t<<<Biblioteca UV>>>\n");
                System.out.println("\t\tMenú Miembros:\n");
                System.out.println("\t1. Registrarme");
                System.out.println("\t2. Actualizar mi información");
                System.out.println("\t3. Cancelar membresía de miembro");
                System.out.println("\t4. Regresar a la página principal\n");
                System.out.println("\t>");

                Scanner entrada2 = new Scanner(System.in);
                opcion2 = entrada2.nextInt();

                switch (opcion2){
                    case 1:
                        long id;
                        String persona, nombre, direccion, membresia;
                        System.out.println("\t\t<<Realizando registro de Miembro>>");
                        System.out.println("Ingresa si eres 'Estudiante', 'Profesor' o 'Persona externa':\n>");
                        System.out.println("1. Estudiante");
                        System.out.println("2. Profesor");
                        System.out.println("3. Persona externa\n>");
                        int opcion4;
                        Scanner entrada3 = new Scanner(System.in);
                        opcion4 = entrada3.nextInt();
                        switch (opcion4){
                            default:
                                System.out.println("Ingresa una opción válida");
                        }
                        System.out.println("Felicidades te registraste!");
                        break;
                    case 2:
                        System.out.println("Felicidades actualizaste tu información!");
                        break;
                    case 3:
                        System.out.println("Cancelaste tu membresía, vuelve pronto!");
                        break;
                    case 4:
                        System.out.println("Regresando...");
                        break;
                    default:
                        System.out.println("\tIntroduce una opción válida...");
                }

            } else if (opcion1 == 2) {

                System.out.println("\n\n\n\t\t\t\t\t<<<Biblioteca UV>>>\n");
                System.out.println("\t\tMenú Personal:\n");
                System.out.println("\t1. Agregar libro");
                System.out.println("\t2. Eliminar libro");
                System.out.println("\t3. Actualizar información de libro existente");
                System.out.println("\t4. Registrar préstamo");
                System.out.println("\t5. Registrar devolución");
                System.out.println("\t6. Ver historial de préstamos de un miembro");
                System.out.println("\t7. Regresar a la página principal\n");
                System.out.println("\t>");

                Scanner entrada3 = new Scanner(System.in);
                opcion3 = entrada3.nextInt();

                switch (opcion3){
                    case 1:
                        String titulo, autor, genero, ISBN, categoria;
                        int anio, copias = 1;
                        System.out.println("\t\t<<Añadiendo Libro>>");
                        System.out.println("Ingresa el titulo del libro:\n>");
                        Scanner leer1 = new Scanner(System.in);
                        titulo = leer1.next();
                        System.out.println("Ingresa el autor del libro:\n>");
                        Scanner leer2 = new Scanner(System.in);
                        autor = leer2.next();
                        System.out.println("Ingresa el genero del libro:\n>");
                        Scanner leer3 = new Scanner(System.in);
                        genero = leer3.next();
                        System.out.println("Ingresa el ISBN del libro:\n>");
                        Scanner leer4 = new Scanner(System.in);
                        ISBN = leer4.next();
                        System.out.println("Ingresa el año de publicación del libro:\n>");
                        Scanner leer5 = new Scanner(System.in);
                        anio = leer5.nextInt();
                        System.out.println("Ingresa la categoria del libro:\n>");
                        Scanner leer6 = new Scanner(System.in);
                        categoria = leer6.next();

                        Libro libro1 = new Libro(titulo, autor, genero, anio, ISBN, copias, categoria);

                        //agregarLibro(libro1);

                        System.out.println("Libro " + libro1.getTitulo() + " agreagado exitosamente!");
                        break;
                    case 2:
                        System.out.println("Libro eliminado exitosamente!");
                        break;
                    case 3:
                        System.out.println("Información del libro actualizada!");
                        break;
                    case 4:
                        System.out.println("Préstamo registrado!");
                        break;
                    case 5:
                        System.out.println("Devolución registrada!");
                        break;
                    case 6:
                        System.out.println("Viendo el historial del miembro!");
                        break;
                    case 7:
                        System.out.println("Regresando...");
                        break;
                    default:
                        System.out.println("\tIntroduce una opción válida...");
                }

            } else if (opcion1 == 3) {

                System.out.println("\tSaliste del programa...");

            } else {

                System.out.println("\tIntroduce una opción válida...");

            }
        }
    }

    //public static void agregarLibro(Libro libro){
    //    libro.anadeLibro(libro);
    //}
}
