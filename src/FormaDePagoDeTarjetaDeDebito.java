public class FormaDePagoDeTarjetaDeDebito implements IFormasDePago{

    @Override
    public IServiciosFormaDePago obtenerFormaDePago() {
        return new FormaDePago(new CobranzaTarjetaDebito());
    }
}
