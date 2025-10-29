package academico.demo.modelo;

public class Cursos {
    private int curso_id;
    private String nombre_curso;
    private int periodo_academico_id;
    private int docente_id;
    private String Descripcion_curso;

    public int getCurso_id() {
        return curso_id;
    }
    public void setCurso_id(int curso_id) {
        this.curso_id = curso_id;
    }

    public String getNombre_curso() {
        return nombre_curso;
    }
    public void setNombre_curso(String nombre_curso) {
        this.nombre_curso = nombre_curso;
    }

    public int getPeriodo_academico_id() {
        return periodo_academico_id;
    }
    public void setPeriodo_academico_id(int periodo_academico_id) {
        this.periodo_academico_id = periodo_academico_id;
    }

    public int getDocente_id() {
        return docente_id;
    }
    public void setDocente_id(int docente_id) {
        this.docente_id = docente_id;
    }

    public String getDescripcion_curso() {
        return Descripcion_curso;
    }
    public void setDescripcion_curso(String descripcion_curso) {
        Descripcion_curso = descripcion_curso;
    }

    

}
