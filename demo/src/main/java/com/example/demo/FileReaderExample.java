package com.example.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    public static void main(String[] args) {
        // Ruta del archivo a leer
        String filePath = "C:\\Users\\figlesias\\Desktop\\SERVIDOR\\1 Trimestre\\Tarea repaso 1\\fileReader.txt";

        // Intentar leer el archivo
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line); // Imprimir cada línea del archivo
            }
        } catch (IOException e) {
            e.printStackTrace(); // Manejar cualquier error de entrada/salida
        }
    }
}
