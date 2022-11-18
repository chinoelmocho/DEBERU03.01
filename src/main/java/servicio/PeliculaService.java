/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Pelicula;
import modelo.Personaje;

/**
 *
 * @author Niko
 */
public interface PeliculaService {
    public abstract void crear(Pelicula pelicula);
    public abstract List<Pelicula> listar();
    public abstract void modificar(String nombre,Pelicula pelicula);
    public abstract void eliminar(String nombre);
}
