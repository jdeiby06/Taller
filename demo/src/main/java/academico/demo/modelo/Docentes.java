package academico.demo.modelo;

import org.springframework.stereotype.Indexed;

import jakarta.annotation.Generated;

public class Docentes {
    private int docente_id;
    private String nombre_docente;
    private int identificacion;
    private String tipo_identificacion;
    private String genero;
    private String  correo;
    private String titulo_estudios;
    private String idiomas;
    private String certificaciones;


    @Generated(value = { "" })
    public int getDocente_id() {
        return docente_id;


}
    public void setDocente_id(int docente_id) {
        this.docente_id = docente_id;
    }
    public String getNombre_docente() {
        return nombre_docente;
    }
    public void setNombre_docente(String nombre_docente) {
        this.nombre_docente = nombre_docente;
    }
    public int getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }
    public String getTipo_identificacion() {
        return tipo_identificacion;
    }
    public void setTipo_identificacion(String tipo_identificacion) {
        this.tipo_identificacion = tipo_identificacion;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getTitulo_estudios() {
        return titulo_estudios;
    }
    public void setTitulo_estudios(String titulo_estudios) {
        this.titulo_estudios = titulo_estudios;
    }
    public String getIdiomas() {
        return idiomas;
    }
    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }
    public String getCertificaciones() {
        return certificaciones;
    }
    public void setCertificaciones(String certificaciones) {
        this.certificaciones = certificaciones;
    }

}