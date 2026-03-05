
package banco;

public class TarjetaDebito extends CuentaBase {
    
    public TarjetaDebito(double apertura) {
        super(apertura);
    }
    
    public void retirar(double cantidad) {
        if (cantidad <= montoActual) {
            montoActual -= cantidad;
            System.out.print("Retiro realizado. Nuevo saldo: $" + montoActual);
        } else {
            System.out.print("Fondos insuficientes.");
        }
    }
    
}
