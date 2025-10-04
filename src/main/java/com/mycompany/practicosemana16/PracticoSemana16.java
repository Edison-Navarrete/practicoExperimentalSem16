/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicosemana16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Edison Navarrete
 */
public class PracticoSemana16 {

    public static void main(String[] args) {
      String archivo="notas.txt";
      //Escritura de Archivo de Texto:
        try(BufferedWriter bw=new BufferedWriter(new FileWriter(archivo))) {
            bw.write("Buen dia");
            bw.newLine();
            bw.write("Este es el desarrollo de la practica experimental");
            bw.newLine();
            bw.write("mi nombre es :Edison Navarrete");
            bw.newLine();
            bw.write("carrera :Tecnologias de la informacion");
            bw.newLine();
            bw.write("Mi edad es :23");
            bw.newLine();
            bw.write("vivo en la ciudad de  Daule");
            bw.newLine();
            bw.write("Esta actividad a sido desarrollada para la asignatura de fundamentos de programacion");
        } catch (Exception error) {
            System.out.println("tienes un error:"+error);
        }
        //Lectura de Archivo de Texto:
        try(BufferedReader zz=new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea =zz.readLine()) !=null) {  
                System.out.println(linea);
                
            }
        } catch (Exception e) {
             System.out.println("tienes un error:"+ e );
        }
           
          
    }
}