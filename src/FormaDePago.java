public class FormaDePago implements IServiciosFormaDePago{

    private IServicioDeCobranza servicioDeCobranza;

    public FormaDePago(IServicioDeCobranza servicioDePagoSeleccionado){
        this.servicioDeCobranza = servicioDePagoSeleccionado;
    }

    @Override
    public void RealizaElCargoALaFormaDePago() {
        this.servicioDeCobranza.ProcesarPago();
    }
}
