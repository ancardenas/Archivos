/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
/**
 *
 * @author ancardenas
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File archivo = new File("lol.txt");
        File a = new File("X/Y/a.txt");
        //PrintStream out = new PrintStream(archivo);
        int x=0;
        Scanner input = new Scanner(archivo);
        Scanner put = new  Scanner(a);
        //out.print("943029834");
        System.out.println(a.isDirectory());
        while (input.hasNext()) {
            System.out.println(put.next()+" "+input.nextInt());
            
            
        }
        
        /*if (a.isDirectory()) {
            String lista[] = a.list();
            for (String nombre : lista) {
                System.out.println(nombre);
            }
        }
        System.out.println(archivo);*/
    }
    
}
