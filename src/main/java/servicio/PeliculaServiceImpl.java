/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Pelicula;
import modelo.Personaje;

/**
 *
 * @author Niko
 */
public final class PeliculaServiceImpl implements PeliculaService{
private ArrayList<Pelicula> peliculaList;
    
    public PeliculaServiceImpl (){
        this.peliculaList=new ArrayList<>();
    }
@Override
    public void crear(Pelicula pelicula) {
         this.peliculaList.add(pelicula);
    }

    @Override
    public List<Pelicula> listar() {
        return this.peliculaList;
    }

    @Override
    public void modificar(String nombre, Pelicula pelicula) {
        var indice=0;
        for (var peliculas:this.peliculaList){
            if(peliculas.getNombre()==nombre){
                this.peliculaList.set(indice,pelicula);
                break;
            }else{
                indice++;
                        
                        }
            
        }
    }

    @Override
    public void eliminar(String nombre) {
         var indice=0;
        for (var peliculas:this.peliculaList){
            if(peliculas.getNombre()==nombre){
                this.peliculaList.remove(indice);
                break;
            }else{
                indice++;
                        
                        }
            
        }
    }
    }
    

