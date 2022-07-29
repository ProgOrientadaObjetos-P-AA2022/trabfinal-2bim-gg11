package Paquete01;

public class PlanPostPagoMegas extends PlanCelular {

    private int gigas;
    private double costoGiga;
    private double tarifaBase;

    public PlanPostPagoMegas(int g, double costoG,
            double tarifaB, String nomPro, String ced, String ciuPro,
            String marcaCelu, String modelCelu, String numCelu) {

        super(nomPro, ced, ciuPro, marcaCelu, modelCelu, numCelu);
        gigas = g;
        costoGiga = costoG;
        tarifaBase = tarifaB;
    }

    public void establecerGigas(int n) {
        gigas = n;
    }

    public void establecerCostoXGiga(double n) {
        costoGiga = n;
    }

    public void establecerTarifaBase(double n) {
        tarifaBase = n;
    }

    public int obtenerGigas() {
        return gigas;
    }

    public double obtenerCostoXGiga() {
        return costoGiga;
    }

    public double obtenerTarifaBase() {
        return tarifaBase;
    }

    @Override
    public void calcularPagoMensual() {
        pagoMensual = tarifaBase + (costoGiga * gigas);
    }

    @Override
    public String toString() {

        String cadena = String.format("Plan Post Pago de Megas\n"
                + "%s"
                + "Tarifa Base: %.2f\n"
                + "Gigas: %d\n"
                + "Costo por Giga: %.2f\n"
                + "Pago Mensual: %.2f\n\n",
                super.toString(), tarifaBase, gigas, costoGiga,
                pagoMensual);

        return cadena;
    }

}
