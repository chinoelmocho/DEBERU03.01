/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.time.LocalDate;
import java.util.List;
import modelo.Personaje;
import servicio.PersonajeServiceImpl;

/**
 *
 * @author David
 */
public class PersonajeControl {
    private PersonajeServiceImpl personajeServiceImpl;

    public PersonajeControl() {
        this.personajeServiceImpl = new PersonajeServiceImpl();
        
    }
    public String crear(String[] data){
        var retorno="No se puede crear personaje:";
        var nombrePersonaje=data[0];
        var nombreActor=data[1];
        var tipoPersonajeSegunRol=data[2];
        var descripcionPersonaje=data[3];
        var puntuacionPersonaje=Integer.valueOf(data[4]).intValue();
        
        
        if (tipoPersonajeSegunRol!="Protagonista"&&tipoPersonajeSegunRol!="Antagonista" &&tipoPersonajeSegunRol!="Tritagonista"){
         retorno+="El tipo del personaje segun su rol esta mal definido: Existe Protagonista,Antagonista y Tritagonista";
        
        }else{
        if(puntuacionPersonaje<0 || puntuacionPersonaje>10){
        retorno+="La puntuacion del personaje debe ser cuantificado en un rango de 0 a 10 puntos";
        
        }else{
        
            var personaje1 =new Personaje(nombrePersonaje,nombreActor,tipoPersonajeSegunRol,descripcionPersonaje,puntuacionPersonaje);
            this.personajeServiceImpl.crear(personaje1);
            
            retorno ="El personaje "+personaje1.getNombrePersonaje()+" creado correctamente";
        
        }
        
        }
    
    return retorno;
    }
    public String eliminar(String[] data){
    var retorno="No se elimino al personaje ";
    var nombrePersonaje=data[0];
    var x= true;
        for(var personajes:this.personajeServiceImpl.listar()){
            if(personajes.getNombrePersonaje()==nombrePersonaje){
                x=false;
            }
        }
        if(x){
        retorno+=", no existe el personaje ";
        }else{
        this.personajeServiceImpl.eliminar(nombrePersonaje);
        retorno="Se elimino Correctamente a "+nombrePersonaje;
        }
        return retorno;
    }
    public List<Personaje> listar(){
    return this.personajeServiceImpl.listar();
    
    }
    public String modificar(String[] data,PersonajeControl personajeControl){
    var retorno="No se modifico al personaje ";
    var nombrePersonaje=data[0];
    var nombrePersonajeModificado=personajeControl;
    var x= true;
        for(var personajes:this.personajeServiceImpl.listar()){
            if(personajes.getNombrePersonaje()==nombrePersonaje){
                x=false;
            }
        }
        if(x){
        retorno+=", no existe el personaje ";
        }else{
        this.personajeServiceImpl.modificar(nombrePersonaje,nombrePersonajeModificado.listar().get(0));
        retorno="Se elimino Correctamente a "+nombrePersonaje;
        }
        return retorno;
    
    
    
    }
    
}
