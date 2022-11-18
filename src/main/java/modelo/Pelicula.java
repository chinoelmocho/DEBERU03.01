/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Niko
 */
public class Pelicula {
 
    private String nombre;
    private int numdePelicula;
    private LocalDate yearEstreno;
    private int starPuntacion;
    private String descripcion;
    private ArrayList<Personaje> personajeList;

    public Pelicula(String nombre, int numdePelicula, LocalDate yearEstreno, int starPuntacion, String descripcion) {
        this.nombre = nombre;
        this.numdePelicula = numdePelicula;
        this.yearEstreno = yearEstreno;
        this.starPuntacion = starPuntacion;
        this.descripcion = descripcion;
        this.personajeList = new ArrayList<>();
    }
    public int yeasofPublication(){
    var yearActual = LocalDate.now().getYear();
        var retorno = yearActual - this.yearEstreno.getYear();
        var monthActual = LocalDate.now().getMonthValue();
        var deiActual = LocalDate.now().getDayOfMonth();
        var x = monthActual - this.yearEstreno.getMonthValue();
        var s = deiActual - this.yearEstreno.getDayOfMonth();
        if (x < 0) {
            retorno -= 1;

        }
        if (x == 0) {
            if (s < 0) {
                retorno -= 1;
            }

        }

        return retorno;

    
    }
    
    public String BuenaoMalaCritica(){
    var retorno="La pelicula no fue un exito";
        if (this.starPuntacion>4){
        retorno="La pelicula fue un exito";
    }
    return retorno;
    }
    
    public void Agregar(Personaje personaje){
        this.personajeList.add(personaje);
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumdePelicula() {
        return numdePelicula;
    }

    public LocalDate getYearEstreno() {
        return yearEstreno;
    }

    public int getStarPuntacion() {
        return starPuntacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ArrayList<Personaje> getPersonajeList() {
        return personajeList;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumdePelicula(int numdePelicula) {
        this.numdePelicula = numdePelicula;
    }

    public void setYearEstreno(LocalDate yearEstreno) {
        this.yearEstreno = yearEstreno;
    }

    public void setStarPuntacion(int starPuntacion) {
        this.starPuntacion = starPuntacion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPersonajeList(ArrayList<Personaje> personajeList) {
        this.personajeList = personajeList;
    }
    
    

    @Override
    public String toString() {
        var retorno="Pelicula{" + "nombre=" + nombre + ", numdePelicula=" + numdePelicula + ", yearEstreno=" + yearEstreno + ", starPuntacion=" + starPuntacion + ", descripcion=" + descripcion +"su ultimo lanzamiento fue "+this.yeasofPublication()+this.BuenaoMalaCritica()+ "}"+" \n";
        for(var participadores:this.personajeList){
            retorno+=participadores.nombrePersonaje+" ";
        }
        return retorno;
    }
    
}
