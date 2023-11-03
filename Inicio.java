// Universidad del Valle de Guatemala
//Nombre: María José Yee Vidal      Carnet: 231193
//Materia: Programación Orientada a Objetos     Sección: 11
//Fecha: 01/11/2023
//Descripción: verifica si el dispositivo se encuentra encendido o apagado.

import java.io.*;
import java.util.*;

public class Inicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Dispositivo> dispositivo = new ArrayList<Dispositivo>();

        boolean go = true;
        String opcion = "";
        String marca = "";
        String modelo = "";

        // Archivo CSV
        try {
            File archivo = new File("Dispositivos.csv");
            Scanner scanner = new Scanner(archivo);

            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }

            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] info = linea.split(",");

                String TipoDispositivo = info[0];
                String modelo_marca = info[1];
                String modo = info[2];

                // Tipo de dispositivo
                if (info[0].equals("telefono")) {
                    Telefono telefono = new Telefono(modelo_marca);

                    if (info[2].equals("encendido")) {
                        telefono.encender();
                        dispositivo.add(telefono);
                    } else if (info[2].equals("apagado")) {
                        telefono.apagar();
                        dispositivo.add(telefono);
                    }
                }

                if (info[0].equals("computadora")) {
                    Computadora computadora = new Computadora(modelo_marca);

                    if (info[2].equals("encendido")) {
                        computadora.encender();
                        dispositivo.add(computadora);
                    } else if (info[2].equals("apagado")) {
                        computadora.apagar();
                        dispositivo.add(computadora);
                    }
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Menú
        while (go) {
            printMenu();

            System.out.println("Ingresar opcion: ");
            opcion = sc.nextLine();
            System.out.println("");

            switch (opcion) {
                case "1":
                    System.out.println("Desplegar información");
                    for (Dispositivo dispositivoss : dispositivo) {
                        System.out.println(dispositivoss);
                    }

                    break;

                case "2":
                    System.out.println("Listar dispositivos encendidos/apagados");
                    for (Dispositivo dispositivoss : dispositivo) {
                        dispositivoss.verificar();
                    }

                    break;

                case "3":
                    System.out.println("Ha salido del programa :D");
                    go = false;

                    break;

                default:
                    System.out.println("\u001B[31mOpción invalida");
                    System.out.println("\u001B[37m");

                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("");
        System.out.println("MENÚ DEL PROGRAMA");
        System.out.println("1. Desplegar información");
        System.out.println("2. Listar dispositivos encendidos/apagados");
        System.out.println("3. Salir");
        System.out.println("");
    }
}
