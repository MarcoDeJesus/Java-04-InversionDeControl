package base;

import cobranza.IServicioDeCobranza;
import formasDePago.IServiciosFormaDePago;

public class FormaDePago implements IServiciosFormaDePago {

    private IServicioDeCobranza servicioDeCobranza;

    public FormaDePago(IServicioDeCobranza servicioDePagoSeleccionado){
        this.servicioDeCobranza = servicioDePagoSeleccionado;
    }

    @Override
    public void RealizaElCargoALaFormaDePago() {
        System.out.println("El Cargo está en Proceso...");
        this.servicioDeCobranza.ProcesarPago();
    }
}
