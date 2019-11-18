/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reducirimagen;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author franz
 */
public class ReducirImagen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ReducirImagen red = new ReducirImagen();
        red.reduccion("/home/franz/Descargas/linux.jpg", "/home/franz/Descargas/linux-reducido.jpg");
    }
    
    public void reduccion (String archivoRuta, String archivoSalienteRuta) {
        try {
            System.out.println("***Reduciendo--");
//            String archivo = "/home/franz/Descargas/linux.jpg";
//            String archivoSaliente = "/home/franz/Descargas/linux145-JA.jpg";
            String archivo = archivoRuta;
            String archivoSaliente = archivoSalienteRuta;
            // Validamos archivo
            if (!new File(archivo).exists()) {
                System.out.println("NO existe: " + archivo);
            }
            // convert Descargas/linux-img.jpg -quality 35 Descargas/linux-out-img99.jpg
            // FUNCIONA EN LINUX
            // ProcessBuilder pb = new ProcessBuilder("convert /home/franz/Descargas/linux-img.jpg -quality 50 /home/franz/Descargas/linux109.jpg");
            ProcessBuilder pb = new ProcessBuilder("convert", archivo, "-quality", "50", archivoSaliente);
            Process p = pb.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = null;
            while ((line = reader.readLine()) != null)
            {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.out.println("*Error: " + ex.getMessage());
            Logger.getLogger(ReducirImagen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
