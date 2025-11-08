 package academico.demo.modelo;


import org.springframework.aot.generate.Generated;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import org.springframework.stereotype.Indexed;



@EntityScan

public class Estudiantes {

    private int  estudiante_id ;

    private int identificacion;

    private String nombre;

    private String correo_institucional;

    private String correo_personal;

    private String telefono;

    private int es_vocero;

    private String tipo_documento;

    private String genero;


   

   

    public int getEstudiante_id() {

        return estudiante_id;

    }

    public void setEstudiante_id(int estudiante_id) {

        this.estudiante_id = estudiante_id;

    }


    public int getIdentificacion() {

        return identificacion;

    }

    public void setIdentificacion(int identificacion) {

        this.identificacion = identificacion;

    }

    public String getNombre() {

        return nombre;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public String getCorreo_institucional() {

        return correo_institucional;

    }

    public void setCorreo_institucional(String correo_institucional) {

        this.correo_institucional = correo_institucional;

    }

    public String getCorreo_personal() {

        return correo_personal;

    }

    public void setCorreo_personal(String correo_personal) {

        this.correo_personal = correo_personal;

    }

    public String getTelefono() {

        return telefono;

    }

    public void setTelefono(String telefono) {

        this.telefono = telefono;

    }

    public int getEs_vocero() {

        return es_vocero;

    }

    public void setEs_vocero(int es_vocero) {

        this.es_vocero = es_vocero;

    }

    public String getTipo_documento() {

        return tipo_documento;

    }

    public void setTipo_documento(String tipo_documento) {

        this.tipo_documento = tipo_documento;

    }

    public String getGenero() {

        return genero;

    }

    public void setGenero(String genero) {

        this.genero = genero;

    }



   

} 