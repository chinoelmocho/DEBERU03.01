/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;

import modelo.Personaje;

/**
 *
 * @author Niko
 */
public interface PersonajeService {
    
    public abstract void crear(Personaje personaje);
    public abstract List<Personaje> listar();
    public abstract void modificar(String nombrePersonaje,Personaje personaje);
    public abstract void eliminar(String nombre);
}
