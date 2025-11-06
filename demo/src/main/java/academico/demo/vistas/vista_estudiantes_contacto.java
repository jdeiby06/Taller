package academico.demo.vistas;

package com.miaplicacion.vistas;

public class vista_estudiantes_contacto {
    private int estudianteId;
    private String identificacion;
    private String nombre;
    private String correoInstitucional;
    private String correoPersonal;
    private String telefono;
    private String tipoDocumento;
    private String genero;
    private int esVocero;
    private String esVoceroTexto; // Campo calculado en SQL
    private String comentarios;

    // Constructor (Omitido por brevedad)
    // Getters y Setters (Omitidos por brevedad)
    
    // Método de presentación de Vista (Simulando la salida a consola)
    public void mostrarDetalle() {
        System.out.println("ID: " + estudianteId + " | " + nombre + " (" + identificacion + ")");
        System.out.println("Correo Inst.: " + correoInstitucional + " | Teléfono: " + telefono);
        System.out.println("Vocero: " + esVoceroTexto);
        System.out.println("-----------------------");
    }
}