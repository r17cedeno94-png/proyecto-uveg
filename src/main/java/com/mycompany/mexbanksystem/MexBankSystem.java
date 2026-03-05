package banco;

public class MexBankSystem {

    public static void main(String[] args) {
        System.out.print("=== tarjeta de Credito ===");
        TarjetaCredito tc = new TarjetaCredito(6000);
        tc.sumarInteres();
        
        System.out.print("\n=== Tarjeta de Debito ===");
        TarjetaDebito td = new TarjetaDebito(2000);
        td.depositar(3000);
        td.retirar(4000);
        
        System.out.print("\n=== Cuenta de Ahorro ===");
        CuentaAhorro ca = new CuentaAhorro(16000);
        ca.invertir(6000);
    }
}
