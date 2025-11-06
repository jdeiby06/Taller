package academico.demo.vistas;



public class vista_calificaciones_detalladas {
    private int calificacionId;
    private int estudianteId;
    private String estudianteIdentificacion;
    private String estudianteNombre;
    private int cursoId;
    private String nombreCurso;
    private String nombrePeriodo;
    private int corteEvaluacionId;
    private String nombreCorte;
    private double porcentajeCorte;       // Usamos double
    private int componenteEvaluacionId;
    private String nombreComponente;
    private double porcentajeComponente;  // Usamos double
    private double nota;                  // Asumo que 'nota' es el campo 'cal.nota'
    private String comentariosCalificacion;
    private double notaPonderadaComponente; // Campo calculado (double)
    private double aporteNotaFinal;        // Campo calculado (double)
    private String conceptoNota;            // Campo calculado

    // Constructor (Omitido por brevedad)
    // Getters y Setters (Omitidos por brevedad)
    
    // Método de presentación de Vista
    public void mostrarDetalle() {
        System.out.println(estudianteNombre + " | " + nombreCorte + " (" + porcentajeCorte + "%)");
        System.out.println("  -> Comp.: " + nombreComponente + " (" + porcentajeComponente + "%)");
        System.out.println("  -> NOTA: " + nota + " | Ponderado: " + notaPonderadaComponente);
        System.out.println("  -> Aporte Final: " + aporteNotaFinal + " | Concepto: " + conceptoNota);
    }
}