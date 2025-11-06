package academico.demo.modelo;



// Esta clase representa la relación muchos a muchos
public class docentes_cursos {
    private int docenteId; // docente_id
    private int cursoId;   // curso_id

    // Constructor con todos los argumentos
    public docentes_cursos(int docenteId, int cursoId) {
        this.docenteId = docenteId;
        this.cursoId = cursoId;
    }
    
    // Getters y Setters
    
    public int getDocenteId() {
        return docenteId;
    }
    public void setDocenteId(int docenteId) {
        this.docenteId = docenteId;
    }
    public int getCursoId() {
        return cursoId;
    }
    public void setCursoId(int cursoId) {
        this.cursoId = cursoId;
    }
}