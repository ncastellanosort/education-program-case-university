package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        Scanner entrada3 = new Scanner(System.in);
        Scanner entrada4 = new Scanner(System.in);
        Scanner entrada5 = new Scanner(System.in);
        Scanner entrada6 = new Scanner(System.in);
        List<Docente> docentes = new ArrayList<>();
        List<Estudiante> estudiantes = new ArrayList<>();
        List<Administrativo> administrativos = new ArrayList<>();

        while (true) {
            System.out.println(" ");
            System.out.println("1. Ingresar info estudiante");
            System.out.println("2. Ingresar info docente");
            System.out.println("3. Ingresar info administrativo");
            System.out.println("4. Mostrar Info estudiantes");
            System.out.println("5. Mostrar Info docentes");
            System.out.println("6. Mostrar Info administradores");
            System.out.println("7. SALIR");
            System.out.println(" ");
            System.out.print("Ingrese una opción: ");
            int txt = entrada.nextInt();
            entrada.nextLine();

            switch (txt) {
                case 1 -> {
                    System.out.print("Ingresar el id del estudiante: ");
                    int idEstudiante = entrada.nextInt();
                    System.out.print("Ingresar tipo de id: ");
                    String idTipoIdEstud = entrada1.nextLine();
                    System.out.print("Ingrese el código del estudiante: ");
                    String codigoEstudiante = entrada2.nextLine();
                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombreEstudiante = entrada3.nextLine();
                    System.out.print("Ingrese el apellido del estudiante: ");
                    String apellidoEstudiante = entrada4.nextLine();
                    System.out.print("Ingrese la dirección del estudiante: ");
                    String direccionEstudiante = entrada5.nextLine();
                    estudiantes.add(new Estudiante(idEstudiante, idTipoIdEstud, nombreEstudiante, apellidoEstudiante, direccionEstudiante, codigoEstudiante));
                    Matriculado matri = new Matriculado();
                    
                    System.out.println();
                    System.out.println("El estudiante pago?");
                    System.out.println("1. Si");
                    System.out.println("2. No");

                    String txt2 = entrada6.nextLine();
                    if (txt2.equals("1")) {
                        matri.siPago(true);
                    } else {
                        matri.noPago(false);
                    }

                }
                case 2 -> {
                    System.out.print("Ingresar el id del docente: ");
                    int idDocente = entrada.nextInt();
                    System.out.print("Ingresar tipo de id del docente: ");
                    String idTipoIdDocente = entrada1.nextLine();
                    System.out.print("Ingrese el nombre del docente: ");
                    String nombreDocente = entrada2.nextLine();
                    System.out.print("Ingrese el apellido del docente: ");
                    String apellidoDocente = entrada3.nextLine();
                    System.out.print("Ingrese la dirección del docente: ");
                    String direccionDocente = entrada4.nextLine();
                    System.out.print("Ingrese el escalafón del docente: ");
                    String escalafon = entrada5.nextLine();
                    docentes.add(new Docente(idDocente, idTipoIdDocente, nombreDocente, apellidoDocente, direccionDocente, escalafon));
                }
                case 3 -> {
                    System.out.print("Ingresar el id del administrativo: ");
                    int idAdmin = entrada.nextInt();
                    System.out.print("Ingresar tipo de id del administrativo: ");
                    String idTipoAdministrativo = entrada1.nextLine();
                    System.out.print("Ingrese el nombre del administrativo: ");
                    String nombreAdministrativo = entrada2.nextLine();
                    System.out.print("Ingrese el apellido del administrativo: ");
                    String apellidoAdministrativo = entrada3.nextLine();
                    System.out.print("Ingrese la dirección del administrativo: ");
                    String direccionAdministrativo = entrada4.nextLine();
                    System.out.print("Ingrese el salario del administrativo: ");
                    int salario = entrada5.nextInt();
                    administrativos.add(new Administrativo(idAdmin, idTipoAdministrativo, nombreAdministrativo, apellidoAdministrativo, direccionAdministrativo, salario));
                    Listado list = new Listado();
                    
                    System.out.println();
                    System.out.println("Desea ver el listado de estudiantes?");
                    System.out.println("1. Si");
                    System.out.println("2. No");
                    String txt2 = entrada6.nextLine();
                    
                    if (txt2.equals("1")) {
                        if (!estudiantes.isEmpty()) {
                            list.mostrarEstudiantes(true);
                            System.out.println("Estudiantes:");
                            for (Estudiante estu : estudiantes) {
                                System.out.println(estu);
                            }
                        }
                    } else {
                        list.noMostrar(false);
                    }
                }
                case 4 -> {
                    System.out.println("Estudiante:");
                    for (Estudiante estu : estudiantes) {
                        System.out.println(estu);
                    }
                }
                case 5 -> {
                    System.out.println("Docente:");
                    for (Docente doce : docentes) {
                        System.out.println(doce);
                    }
                }
                case 6 -> {
                    System.out.println("Administrativo:");
                    for (Administrativo admin : administrativos) {
                        System.out.println(admin);
                    }
                }
                case 7 -> {
                    System.out.println("Adiós :)");
                    return;
                }
            }
        }
    }
}
