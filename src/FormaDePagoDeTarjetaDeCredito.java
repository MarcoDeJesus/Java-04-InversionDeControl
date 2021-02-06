public class FormaDePagoDeTarjetaDeCredito implements IFormasDePago{

    public FormaDePagoDeTarjetaDeCredito(){
        System.out.println("La Forma de Pago se ha identificado como: TARJETA DE CRÉDITO");
    }

    @Override
    public IServiciosFormaDePago obtenerFormaDePago() {
        return new FormaDePago(new CobranzaTarjetaCredito());
    }
}
