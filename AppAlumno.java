// Crear un programa que cree 1 objeto de la clase Alumno, que les dé
// valores ingresados por teclado y que muestre los datos en formato:
// “apellido, nombre = promedio”
public class AppAlumno {
    public static void main(String[] args) {
        Alumno primerAlumno = new Alumno();
        primerAlumno.setNombreAlumno("Juan");
        primerAlumno.setApellidoAlumno("Perez");
        primerAlumno.setPromedioAlumno(15);
        System.out.println(primerAlumno);
    }
}
