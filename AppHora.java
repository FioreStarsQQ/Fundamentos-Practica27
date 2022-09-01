// Crear la clase Hora que representa una hora del día, por ejemplo
// 3:15:25. Crear los métodos: 1 constructor para inicializar la hora con
// valores consistentes, crear los métodos setUnaHora para establecer
// una hora completa (hh, mm, ss) y que llame a setMinuto, setSegundo y
// setHora que verifiquen los datos correctos. Además los métodos
// aumentarMinuto, aumentarSegundo, aumentarHora. Además crear los 
// get para cada atributo y mostrarHora que imprima en formato hh:mm:ss

public class AppHora {
    public static void main(String[] args) {
        Hora hora1 = new Hora();
        hora1.setUnaHora(05, 58, 54);
        System.out.println(hora1); // Verificación
        hora1.aumentarSegundo(72);
        System.out.println(hora1.getSegundo());
        System.out.println(hora1); // Verificación
        hora1.aumentarMinuto(60);
        System.out.println(hora1.getMinuto());
        System.out.println(hora1); // Verificación
        hora1.aumentarHora(12);
        System.out.println(hora1.getHora());
        System.out.println(hora1); // Verificación
        hora1.aumentarMinuto(125);
        System.out.println(hora1); // Verificación
    }
}
