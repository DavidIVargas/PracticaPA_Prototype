/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author davidvargas
 */
public class Guerrero extends Personaje {

    private int fuerza;

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public Guerrero(int fuerza, String nombre, String habilidad, String equipo) {
        super(nombre, habilidad, equipo);
        this.imagen = "/images/img_guerrero_1.jpeg"; // Aquí se inicializa el atributo imagen
        this.fuerza = fuerza;
    }

    @Override
    public Personaje clonar() {
        Guerrero guerreroClon = new Guerrero(fuerza, nombre, habilidad, equipo);
        guerreroClon.setImagen(imagen);
        guerreroClon.setFuerza(fuerza);
        guerreroClon.setNombre(nombre);
        guerreroClon.setHabilidad(habilidad);
        guerreroClon.setEquipo(equipo);
        return guerreroClon;
    }

}
