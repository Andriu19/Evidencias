/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Andriuu
 */
public class CodigoEnsamblador {
   public static void enSuma(int av, int bv, String res, String op) {
        String a= Integer.toHexString(av);
        String b= Integer.toHexString(bv);
        
        File f;
        FileWriter fichero = null;
        try{
            f=new File("C:/BAT/Ensamblado/suma.asm");
            f.delete();
            fichero = new FileWriter(f,true);
            BufferedWriter bw = new BufferedWriter(fichero);
            PrintWriter pw = new PrintWriter(bw);
            
                pw.println(".model small");
                pw.println(".stack");
                pw.println(".data");
                pw.println("mensaje db '"+res+":','$'");
                pw.println(".code");
                pw.println("main proc");
                pw.println("mov ax, seg mensaje");
                pw.println("mov ds,ax");
                pw.println("mov ah,09");
                pw.println("lea dx,mensaje");
                pw.println("int 21h");
                pw.println("MOV AL,"+a.toUpperCase()+"\n");
                pw.println("MOV BL,"+b.toUpperCase()+"\n");
                
                if("+".equals(op)){
                    pw.println("ADD AL,BL\n");
                }
                if("-".equals(op)){
                    pw.println("SUB AL,BL\n");
                }
                if("*".equals(op)){
                    pw.println("MUL BL\n");
                }
                if("/".equals(op)){
                    pw.println("XOR AX,AX\n");
                    pw.println("MOV AL,"+b.toUpperCase()+"\n");
                    pw.println("MOV BL,AL\n");
                    pw.println("MOV AL,"+a.toUpperCase()+"\n");
                    pw.println("DIV BL\n");
                    pw.println("MOV BL,AL\n");
                }
                
                pw.println("mov dl,al");
                pw.println("add dl,48");
                pw.println("mov ah,02");
                pw.println("int 21h");
                pw.println("mov ax,4c00h");
                pw.println("int 21h");
                pw.println("main endp");
                pw.println("end main");
                
                pw.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void crearBat(){
        File f;
        FileWriter fichero = null;
        try{
            f=new File("C:/BAT/Ensamblado/bat.bat");
                    f.delete();
                    fichero = new FileWriter(f, true);
                    BufferedWriter bw = new BufferedWriter(fichero);
                    PrintWriter pw = new PrintWriter(bw);
                    pw.println("cd\\");
                    pw.println("cd C:/BAT/Ensamblado/");
                    pw.println("tasm suma.asm");
                    pw.println("tlink suma.obj");
                    pw.println("suma");
                    bw.close();
        }catch(Exception e){
            
        }
    }
    
    public static void ejecutarbat(){
         Runtime ejecutar = Runtime.getRuntime();
         try{
             ejecutar.exec("cmd.exe /k start C:/BAT/Ensamblado/bat.bat");
         }catch(Exception e){
             System.out.println(e);
         }
         
    }
    
    public static void main(String args[]){
        enSuma(5,1,"la suma es ","+");
        crearBat();
        ejecutarbat();
    }
}