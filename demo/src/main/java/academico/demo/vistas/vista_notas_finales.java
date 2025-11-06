package academico.demo.vistas;



public class vista_notas_finales {
    private int estudianteId;
    private String identificacion;
    private String estudiante;
    private int cursoId;
    private String nombreCurso;
    private String nombrePeriodo;
    private String nombreDocente;
    private double notaFinal; // Campo calculado (double)
    private String estado;    // Campo calculado
    private String conceptoFinal; // Campo calculado

    // Constructor (Omitido por brevedad)
    // Getters y Setters (Omitidos por brevedad)
    
    // Método de presentación de Vista
    public void mostrarDetalle() {
        System.out.println("Estudiante: " + estudiante + " en " + nombreCurso);
        System.out.println("Docente: " + nombreDocente + " | Período: " + nombrePeriodo);
        System.out.println("NOTA FINAL: " + notaFinal + " | Estado: **" + estado + "** | Concepto: " + conceptoFinal);
    }
}