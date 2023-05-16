
package com.mycompany.jpaprueba.logica;

import com.mycompany.jpaprueba.persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();     

    public void guardar(String nombreMasco, String raza, String color, String obvservaciones, String alergico, String atenEsp, String nombreCliente, String celDuenio) {
        
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreCliente);
        duenio.setCelDuenio(celDuenio);
        
        
        Mascota masco = new Mascota();
        masco.setAlergico(alergico);
        masco.setAten_especial(atenEsp);
        masco.setColor(color);
        masco.setObvservaciones(obvservaciones);
        masco.setRaza(raza);
        masco.setNombre(nombreMasco);
        masco.setUnDuenio(duenio);
        
        controlPersis.guardar(duenio,masco);
        
    }
}
