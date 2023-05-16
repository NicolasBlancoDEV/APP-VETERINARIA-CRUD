package com.mycompany.jpaprueba.logica;

import com.mycompany.jpaprueba.logica.Duenio;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-05-16T11:50:44", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Mascota.class)
public class Mascota_ { 

    public static volatile SingularAttribute<Mascota, Integer> num_cliente;
    public static volatile SingularAttribute<Mascota, String> raza;
    public static volatile SingularAttribute<Mascota, String> color;
    public static volatile SingularAttribute<Mascota, String> alergico;
    public static volatile SingularAttribute<Mascota, String> aten_especial;
    public static volatile SingularAttribute<Mascota, Duenio> unDuenio;
    public static volatile SingularAttribute<Mascota, String> obvservaciones;
    public static volatile SingularAttribute<Mascota, String> nombre;

}