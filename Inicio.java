// Universidad del Valle de Guatemala
//Nombre: María José Yee Vidal      Carnet: 231193
//Materia: Programación Orientada a Objetos     Sección: 11
//Fecha: 01/11/2023
//Descripción: verifica si el dispositivo se encuentra encendido o apagado.

import java.util.Scanner;
import java.util.ArrayList;

public class Inicio{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Dispositivo> dispositivo = new ArrayList<Dispositivo>();

        boolean go = true;
        String opcion = "";

        //  Archivo CSV
        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            List<String[]> allData = new ArrayList<>();

            //Lee las líneas.
            while ((line = br.readLine()) != null) {
                String[] values = line.split(","); 
                allData.add(values);
            }
            //Tabular datos para imprimir.
            for (String[] row : allData) {
                for (String cell : row) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
          //Rastrear excepciones del try.
        } catch (IOException e) {
            e.printStackTrace();
        }

        //  Menú
        while (go) {
            printMenu();

            System.out.println("Ingresar opcion: ");
            opcion = sc.nextLine();
            System.out.println("");

            switch(opcion) {
                case "0":
                    System.out.println("Desplegar información");
                    for (int i = 0; i < estudiantes.size(); i++) {
                        System.out.println("\u001B[34m" + i + " - " + dispositivo.get(i).getNombre());
                    }

                    break;

                case "1":
                    System.out.println("Listar dispositivos encendidos/apagados");
                    System.out.println(":P");
                    break;

                case "2":
                    System.out.println("Ha salido del programa :D");
                    go = false;
                    
                    break;

                default:
                    System.out.println("\u001B[31mOpción invalida");
                    
                    break;
            }   
        }
    }

    public static void printMenu(){
        System.out.println("");
        System.out.println("MENÚ DEL PROGRAMA");
        System.out.println("0. Desplegar información");
        System.out.println("1. Listar dispositivos encendidos/apagados");
        System.out.println("2. Salir");
        System.out.println("");
        }
    }
}

    


