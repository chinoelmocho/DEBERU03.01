/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.time.LocalDate;
import java.util.List;
import modelo.Pelicula;
import modelo.Personaje;
import servicio.PeliculaServiceImpl;

/**
 *
 * @author David
 */
public class PeliculaControl {
    private PeliculaServiceImpl peliculaServiceImpl;

    public PeliculaControl() {
        this.peliculaServiceImpl = new PeliculaServiceImpl();
        
    }
    public String crear(String[] data,PersonajeControl[] args){
        var retorno="No se puede crear pelicula:";
        var nombre=data[0];
        var numdePelicula=Integer.valueOf(data[1]).intValue();
        var year=Integer.valueOf(data[2]).intValue();
        var mes=Integer.valueOf(data[3]).intValue();
        var dia=Integer.valueOf(data[4]).intValue();
        var starPuntacion=Integer.valueOf(data[5]).intValue();;
        var descripcion=data[6];
        
        
        if (numdePelicula<0){
         retorno+="La pelicula debe tener minimo una produccion";
        
        }else{
        if(year<1896||dia>31||dia<0||mes>12||mes<0){
        retorno=",la fecha establecida esta incorrecta";
        
        }else{if(starPuntacion<0 || starPuntacion>5){
        retorno+=",la puntuacion de estrellas es incorrecto";
        
        }else{
        
            var pelicula1 =new Pelicula(nombre,numdePelicula,LocalDate.of(year,mes,dia),starPuntacion,descripcion);
            this.peliculaServiceImpl.crear(pelicula1);
            for(var personajes:args){
                this.peliculaServiceImpl.listar().get(0).Agregar(personajes.listar().get(0));
            
            }
            
            retorno ="La Pelicula  "+pelicula1.getNombre()+" a sido creado correctamente";
        
        }
        
            
        }
        
        }
    
    return retorno;
    }
    public String eliminar(String[] data){
    var retorno="No se elimino al personaje ";
    var nombrePelicula=data[0];
    var x= false;
        for(var peliculas:this.peliculaServiceImpl.listar()){
            if(peliculas.getNombre()==nombrePelicula){
                x=true;
            }
        }
        if(x){
        retorno+=", no existe la pelicula ";
        }else{
        this.peliculaServiceImpl.eliminar(nombrePelicula);
        retorno="Se elimino Correctamente a "+nombrePelicula;
        }
        return retorno;
    }
    public List<Pelicula> listar(){
    return this.peliculaServiceImpl.listar();
    
    }
    public String modificar(String[] data,PeliculaControl peliculaControl){
    var retorno="No se modifico correctamente ";
    var nombre=data[0];
    var nombrePersonajeModificado=peliculaControl;
    var x= true;
        for(var peliculas:this.peliculaServiceImpl.listar()){
            if(peliculas.getNombre()==nombre){
                x=false;
            }
        }
        if(x){
        retorno+=", no existe el personaje ";
        }else{
        this.peliculaServiceImpl.modificar(nombre,nombrePersonajeModificado.listar().get(0));
        retorno="Se elimino Correctamente a "+nombre;
        }
        return retorno;
    
    
    
    }
    
    
}
