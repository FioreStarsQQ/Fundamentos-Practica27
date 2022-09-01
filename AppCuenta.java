// Crear la clase Cuenta que representa una cuenta bancaria, me importa
// el nombre del titular de la cuenta y su saldo. Puedo depositar, retirar,
// ver saldo. Además crear los set y get para cada atributo, crear
// constructor y esPremium (verifica si tiene saldo mayor a 50000)

public class AppCuenta {
    public static void main(String[] args) {
        Cuenta usuario1 = new Cuenta("Juan Perez");
        Cuenta usuario2 = new Cuenta("Maria Flores");
        System.out.println("Usuario 1: " + usuario1.getSaldo() + "\tUsuario 2: " + usuario2.getSaldo()); // Verificación
        usuario1.setDeposito(2500); // estableciendo los depositos
        usuario2.setDeposito(40000);
        System.out.println("Usuario 1: " + usuario1.getSaldo() + "\tUsuario 2: " + usuario2.getSaldo()); // Verificación
        usuario1.setDeposito(-2500); // Verificar que el deposito no deberia ser negativo
        System.out.println("Usuario 1: " + usuario1.getSaldo() + "\tUsuario 2: " + usuario2.getSaldo()); // Verificación
        usuario2.setRetiro(10000); // estableciendo el retiro
        usuario1.setRetiro(-500); // En el retiro se permite el valor negativo
        usuario1.verSaldo();
        System.out.println("Usuario 1: " + usuario1.getSaldo() + "\tUsuario 2: " + usuario2.getSaldo()); // Verificación
        usuario2.setDeposito(35000);
        // Muestra la informacion de las cuentas
        System.out.println(usuario1);
        System.out.println(usuario2);
    }
}