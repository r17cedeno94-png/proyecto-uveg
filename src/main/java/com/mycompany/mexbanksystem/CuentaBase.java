
package banco;

public class CuentaBase {
    protected double montoActual;
    
    public CuentaBase(double apertura) {
        this.montoActual = apertura;
    }
    
    public void depositar(double cantidad) {
        montoActual += cantidad;
        System.out.print("Deposito realizado. Nuevo monto: $" + montoActual);
    }
    
    public double getMontoActual() {
        return montoActual;
    }
}
