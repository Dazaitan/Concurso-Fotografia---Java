/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.concurso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Jhonk
 */
public class Concurso {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean ejecucion =true;
        ArrayList<Fotografia> fotografias = new ArrayList<>();
        while (ejecucion){
            mostrarMenu();
            int opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                //Registrar fotografias
                case 1:
                    System.out.println("********************************");
                    System.out.print("Ingrese el titulo: ");
                    String titulo =scanner.nextLine();
                    
                    System.out.print("Ingrese el nombre del autor: ");
                    String autor = scanner.nextLine();
                    
                    System.out.print("Ingrese el nombre la nacionalidad del autor: ");
                    String nacionalidad = scanner.nextLine();
                    
                    System.out.print("Ingrese el nombre la nacionalidad del autor: ");
                    int puntuacion = Integer.parseInt(scanner.nextLine());
                    
                    fotografias.add(new Fotografia(titulo,autor,nacionalidad,puntuacion));
                    break;
                case 2:
                    System.out.println("********************************");
                    double promedio = 0;
                    System.out.println(fotografias.size());
                    for (Fotografia fotografia : fotografias) {
                        promedio = promedio + fotografia.getPuntuacion();
                    }
                    System.out.println("La puntuacion promedio es de " +(promedio/fotografias.size()));
                    break;
                case 3:
                    System.out.println("********************************");
                    System.out.print("Ingrese el pais: ");
                    String pais = scanner.nextLine();
                    for (Fotografia fotografia : fotografias) {
                        if (fotografia.getNacionalidad().equals(pais)){
                            System.out.println(fotografia.getTitulo());
                            System.out.println(fotografia.getAutor());
                            System.out.println(fotografia.getNacionalidad());
                            System.out.println(fotografia.getPuntuacion());
                        }
                    }
                    break;
                case 4:
                    Fotografia ganador = Collections.max(fotografias, Comparator.comparingInt(Fotografia::getPuntuacion));
                    System.out.println("Ganador con "+ganador.getPuntuacion()+" puntos");
                    System.out.println("Nombre: "+ganador.getAutor());
                    System.out.println("Nacionalidad: "+ganador.getNacionalidad());
                    break;
                case 0:
                    ejecucion = false;
                    break;
                default:
                    System.out.println("Esa no es una opcion");
            }
        }
    }
    private static void mostrarMenu() {
        System.out.println("\n--- Menú de Gestión de Hotel ---");
        System.out.println("1. Registrar Fotografia");
        System.out.println("2. Puntuacion promedio");
        System.out.println("3. Fotografias por cada pais");
        System.out.println("4. Fotografia ganadora");
        System.out.println("0. Salir");
        System.out.print("Selecciona una opción: ");
    }
}
