
package com.mycompany.jpaprueba.persistencia;

import com.mycompany.jpaprueba.logica.Duenio;
import com.mycompany.jpaprueba.logica.Mascota;

public class ControladoraPersistencia {
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascoJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {
        duenioJpa.create(duenio);
        
        mascoJpa.create(masco);
    }
    
}
