/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author oracle
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileWriter escribir = new FileWriter("/home/oracle/Desktop/ProbaExer4/texto11.txt");
            //Para que no sobreescriba hay que poner true aumentando asi su tamaño, con false si sobreescribe
            FileReader leer = new FileReader("/home/oracle/Desktop/ProbaExer4/texto10.txt");
            int c;
            //Mientras tenga algo que leer que escriba
            while ((c = leer.read()) !=-1) {
                escribir.write(c);
            }
            escribir.close();
            leer.close();
        } catch (Exception e) {
        }
    }
    
}
