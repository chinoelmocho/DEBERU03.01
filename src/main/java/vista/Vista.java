/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.PeliculaControl;
import controlador.PersonajeControl;
import modelo.Personaje;
import servicio.PersonajeServiceImpl;

/**
 *
 * @author Niko
 */
public class Vista {
     public static void main(String[] args) {
    var vectorcon =new String[5];
    vectorcon[0]="El conserje";
    vectorcon[1]="Will Smit";
    vectorcon[2]="Tritagonista";
    vectorcon[3]="Feo pero gracioso";
    vectorcon[4]="10";
    var prueba1 =new PersonajeControl();
    System.out.println(prueba1.crear(vectorcon));
    System.out.println(prueba1.listar());
    
    var vectorcon2 =new String[5];
    vectorcon2[0]="Heisemberg";
    vectorcon2[1]="Aero Smit";
    vectorcon2[2]="Protagonista";
    vectorcon2[3]="Loco sin remodimiento";
    vectorcon2[4]="7";
    var prueba2 =new PersonajeControl();
    System.out.println(prueba2.crear(vectorcon2));
    System.out.println(prueba2.listar());
    
    var vectorcon3 =new String[5];
    vectorcon3[0]="Pablo escobar";
    vectorcon3[1]="Tom Hanks";
    vectorcon3[2]="Antagonista";
    vectorcon3[3]="Malo y despiadado";
    vectorcon3[4]="5";
    var prueba3 =new PersonajeControl();
    System.out.println(prueba3.crear(vectorcon3));
    System.out.println(prueba3.listar());
    
    
    
   var vectorcon4=new String[7];
   vectorcon4[0]="Evangelion";
    vectorcon4[1]="3";
    vectorcon4[2]="2003";
    vectorcon4[3]="8";
    vectorcon4[4]="10";
    vectorcon4[5]="3";
    vectorcon4[6]="Es una pelicula de ciencia ficion.";
  
    var vectorcon5=new PersonajeControl[3] ;
    vectorcon5[0]=prueba1;
    vectorcon5[1]=prueba2;
    vectorcon5[2]=prueba3;
    var pelicula1=new PeliculaControl();
    System.out.println(pelicula1.crear(vectorcon4, vectorcon5));
    System.out.println(pelicula1.listar());
    
    
    
}
     
}