import formasDePago.FormaDePagoDeTarjetaDeCredito;
import formasDePago.FormaDePagoDeTarjetaDeDebito;
import formasDePago.IServiciosFormaDePago;

public class Main {
    public static void main(String args[]){

        IServiciosFormaDePago servicioDeCobro;

        // Pagar con un a Tarjeta de Debito
        servicioDeCobro = new FormaDePagoDeTarjetaDeDebito().obtenerFormaDePago();
        servicioDeCobro.RealizaElCargoALaFormaDePago();

        System.out.println();

        // Pagar con un a Tarjeta de Credito
        servicioDeCobro = new FormaDePagoDeTarjetaDeCredito().obtenerFormaDePago();
        servicioDeCobro.RealizaElCargoALaFormaDePago();
    }
}
