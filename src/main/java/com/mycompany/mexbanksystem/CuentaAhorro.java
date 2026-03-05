package banco;

public class CuentaAhorro extends CuentaBase {
    
    public CuentaAhorro(double apertura) {
        super(apertura);
    }
    
    public void invertir(double cantidad) {
        double ganancia = cantidad + 0.10;
        montoActual += ganancia;
        System.out.print("Inversion del 10% aplicada. nuevo monto: $" + montoActual);
    }
    
}
