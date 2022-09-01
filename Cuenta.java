
import java.text.*;

public class Cuenta {
    DecimalFormat df = new DecimalFormat("0.00");
    private String nombresTitular;
    private double saldoCuenta = 0;
    // Constructor con parametro nombre de cuenta
    public Cuenta(String cuentaUsuario) {
        setNombreTitular(cuentaUsuario);
    }
    // Establece el nombre del usuario
    public void setNombreTitular(String nombres) {
        nombresTitular = nombres;
    }
    // Establece el valor del deposito
    public void setDeposito(double deposito) {
        if (deposito < 0) {
            saldoCuenta += 0;
        } else {
            saldoCuenta += deposito;
        }
    }
    // Establece el valor del dinero retirado
    public void setRetiro(double retiro) {
        saldoCuenta -= Math.abs(retiro);
    }
    // Devuelve el valor del saldo
    public double getSaldo() {
        return saldoCuenta;
    }
    // Ver saldo
    public void verSaldo() {
        System.out.println(df.format(getSaldo()));
    }
    // Retorna el valor de verdad de si es una cuenta premium o no
    public boolean esPremium() {
        return saldoCuenta > 50000;
    } 
    // Retorna la info de la cuenta
    public String toString() {
        return nombresTitular + "\n\tSaldo en cuenta: " + df.format(saldoCuenta) + " soles.\n\t¿Es Premium? "
                + esPremium();
    }
}
