public class Main {
    public static void main(String args[]){

        IServiciosFormaDePago servicioDeCobro;

        // Pagar con un a Tarjeta de Debito
        servicioDeCobro = new FormaDePagoDeTarjetaDeDebito().obtenerFormaDePago();
        servicioDeCobro.RealizaElCargoALaFormaDePago();
    }
}
