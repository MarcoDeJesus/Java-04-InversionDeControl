package cobranza.credito;

import cobranza.IServicioDeCobranza;

public class CobranzaTarjetaCredito implements IServicioDeCobranza {
    @Override
    public void ProcesarPago() {
        System.out.println("Pagando con Tarjeta de Crédito. A 24 Meses sin intereses.");
        System.out.println("El pago con su Tarjeta de Crédito se ha realizado con Éxito!!!");
    }
}
