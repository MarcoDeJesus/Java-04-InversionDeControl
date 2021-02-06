public class FormaDePagoDeTarjetaDeDebito implements IFormasDePago{

    public FormaDePagoDeTarjetaDeDebito(){
        System.out.println("La Forma de Pago se ha identificado como: TARJETA DE DÉBITO");
    }

    @Override
    public IServiciosFormaDePago obtenerFormaDePago() {
        return new FormaDePago(new CobranzaTarjetaDebito());
    }
}
