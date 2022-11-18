/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Niko
 */
public class Personaje {
    String nombrePersonaje;
    String nombreActor;
    String tipoPersonajeSegunRol;
    String descripcionPersonaje;
    int puntuacionPersonaje;

    public Personaje(String nombrePersonaje, String nombreActor, String tipoPersonajeSegunRol, String descripcionPersonaje, int puntuacionPersonaje) {
        this.nombrePersonaje = nombrePersonaje;
        this.nombreActor = nombreActor;
        this.tipoPersonajeSegunRol = tipoPersonajeSegunRol;
        this.descripcionPersonaje = descripcionPersonaje;
        this.puntuacionPersonaje = puntuacionPersonaje;
    }

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public String getNombreActor() {
        return nombreActor;
    }

    public String getTipoPersonajeSegunRol() {
        return tipoPersonajeSegunRol;
    }

    public String getDescripcionPersonaje() {
        return descripcionPersonaje;
    }

    public int getPuntuacionPersonaje() {
        return puntuacionPersonaje;
    }

    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }

    public void setNombreActor(String nombreActor) {
        this.nombreActor = nombreActor;
    }

    public void setTipoPersonajeSegunRol(String tipoPersonajeSegunRol) {
        this.tipoPersonajeSegunRol = tipoPersonajeSegunRol;
    }

    public void setDescripcionPersonaje(String descripcionPersonaje) {
        this.descripcionPersonaje = descripcionPersonaje;
    }

    public void setPuntuacionPersonaje(int puntuacionPersonaje) {
        this.puntuacionPersonaje = puntuacionPersonaje;
    }
  public String mejorActor(){
  var retorno=" es un mal actor";
     var actor=this.nombreActor;
     var mejoresactores= new String[6];
     mejoresactores[0]="Daniel Day-Lewis";
     mejoresactores[1]="Jack Nicholson";
     mejoresactores[2]="Will Smith";
     mejoresactores[3]="Leonardo DiCaprio";
     mejoresactores[4]="Al Pacino";
     mejoresactores[5]="Tom Hanks";
     var num=mejoresactores.length;
     for(int i=0;i < num ;i++){
         if (actor == mejoresactores[i]){
             retorno=" es un buen actor";
         }
     
     }
     return retorno;
    }
  
  public String calidadActuacion(){
  var retorno =" su actuacion no fue buena";
  if (this.puntuacionPersonaje>7){
  retorno=" su actuacion fue buena";
  }
  return retorno;
  }

    @Override
    public String toString() {
        return "Personaje{" + "nombrePersonaje=" + nombrePersonaje + ", nombreActor=" + nombreActor +this.mejorActor()+this.calidadActuacion()+ ", tipoPersonajeSegunRol=" + tipoPersonajeSegunRol + ", descripcionPersonaje=" + descripcionPersonaje + ", puntuacionPersonaje=" + puntuacionPersonaje + '}';
    }
  
    
    
}
