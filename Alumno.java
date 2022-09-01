
public class Alumno {
    private String nombreAlumno, apellidoAlumno;
    private int promedioAlumno;
    public void setNombreAlumno(String nombre) {
        nombreAlumno = nombre;
    }
    public void setApellidoAlumno(String  apellido) {
        apellidoAlumno = apellido;
    }
    public void setPromedioAlumno(int promedio) {
        promedioAlumno = promedio;
    }
    public String getNombreAlumno() {
        return  nombreAlumno;
    }
    public String getApellidoAlumno() {
        return  apellidoAlumno;
    }
    public int getPromedioAlumno() {
        return  promedioAlumno;
    }
    public String toString() {
        return nombreAlumno +" "+ apellidoAlumno +" = "+ promedioAlumno;
    }
}
