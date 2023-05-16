
package com.mycompany.jpaprueba.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mascota implements Serializable {
    
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   private int num_cliente;
   private String nombre;
   private String raza;
   private String color;
   private String alergico;
   private String aten_especial;
   private String obvservaciones;
   
   @OneToOne
   
   private Duenio unDuenio;

    public Mascota() {
    }

    public Mascota(int num_cliente, String nombre, String raza, String color, String alergico, String aten_especial, String obvservaciones, Duenio unDuenio) {
        this.num_cliente = num_cliente;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.aten_especial = aten_especial;
        this.obvservaciones = obvservaciones;
        this.unDuenio = unDuenio;
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getAten_especial() {
        return aten_especial;
    }

    public void setAten_especial(String aten_especial) {
        this.aten_especial = aten_especial;
    }

    public String getObvservaciones() {
        return obvservaciones;
    }

    public void setObvservaciones(String obvservaciones) {
        this.obvservaciones = obvservaciones;
    }

    public Duenio getUnDuenio() {
        return unDuenio;
    }

    public void setUnDuenio(Duenio unDuenio) {
        this.unDuenio = unDuenio;
    }
   
   
}
