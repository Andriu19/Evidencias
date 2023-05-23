/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Andriuu
 */
public class Compilador {

    public static void main(String[] args) throws Exception {
        String ruta1 = "C:/Users/Andy/Documents/NetBeansProjects/Compilador/src/compilador/Lexer.flex";
        String ruta2 = "C:/Users/Andy/Documents/NetBeansProjects/Compilador/src/compilador/LexCup.flex";
        String ruta3 = "C:/Users/Andy/Documents/NetBeansProjects/Compilador/src/compilador/JFlap.cup";
        String[] rutas = {"-parser", "Sintaax", "C:/Users/Andy/Documents/NetBeansProjects/Compilador/src/compilador/Sintaax.cup"};
        generar(ruta1, ruta2, rutas,ruta3);
    }
    public static void generar(String ruta1, String ruta2, String[] rutas,String ruta3) throws IOException, Exception{
        File archivo;
        archivo = new File(ruta1);
        jflex.Main.generate(archivo);
        archivo = new File(ruta2);
        jflex.Main.generate(archivo);
        archivo = new File(ruta3);    
        jflex.Main.generate(archivo);
        java_cup.Main.main(rutas);
        
        Path rutaSym = Paths.get("C:/Users/Andy/Documents/NetBeansProjects/Compilador/src/compilador/sym.java");
        if (Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        }
        Files.move(
                Paths.get("C:/Users/Andy/Documents/NetBeansProjects/Compilador/sym.java"), 
                Paths.get("C:/Users/Andy/Documents/NetBeansProjects/Compilador/src/compilador/sym.java")
        );
        Path rutaSin = Paths.get("C:/Users/Andy/Documents/NetBeansProjects/Compilador/src/compilador/Sintaax.java");
        if (Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        }
        Files.move(
                Paths.get("C:/Users/Andy/Documents/NetBeansProjects/Compilador/Sintaax.java"), 
                Paths.get("C:/Users/Andy/Documents/NetBeansProjects/Compilador/src/compilador/Sintaax.java")
        );
        Path rutaSin1 = Paths.get("C:/Users/Andy/Documents/NetBeansProjects/Compilador/src/compilador/JFlap.java");
        if (Files.exists(rutaSin1)) {
            Files.delete(rutaSin1);
        }
         Files.move(
                Paths.get("C:/Users/Andy/Documents/NetBeansProjects/Compilador/JFlap.java"), 
                Paths.get("C:/Users/Andy/Documents/NetBeansProjects/Compilador/src/compilador/JFlap.java")
        );
        }

  

    
    
}
