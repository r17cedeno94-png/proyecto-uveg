
package banco;

public class TarjetaCredito extends CuentaBase {
    
    public TarjetaCredito(double apertura) {
        super(-Math.abs(apertura));
    }
    
    public void sumarInteres() {
        double interes = montoActual * 0.15;
        montoActual += interes;
        System.out.print("Interes del 15% aplicado. Nueva deuda: $" + montoActual);
    }
    
}
