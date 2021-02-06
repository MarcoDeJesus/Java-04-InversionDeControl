public class CobranzaTarjetaDebito implements IServicioDeCobranza {
    @Override
    public void ProcesarPago() {
        System.out.println("Pagando con Tarjeta de Débito. Con un 30% de Descuento.");
        System.out.println("El pago con su Tarjeta de Débito se ha realizado con Éxito!!!");
    }
}
