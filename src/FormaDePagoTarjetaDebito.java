public class FormaDePagoTarjetaDebito {

    private CobranzaTarjetaDebito cobranzaTarjetaDebito = new CobranzaTarjetaDebito();

    public FormaDePagoTarjetaDebito(){
        System.out.println("La Forma de Pago se ha identificado como: TARJETA DE DÉBITO");
    }

    public void obtenerFormaDePago() {
        cobranzaTarjetaDebito.ProcesarPago();
    }
}
