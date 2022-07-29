package p2;

public class PlanPostPagoMinMeg extends PlanCelular {

    private int min;
    private double costoMin;
    private int gigas;
    private double costoGiga;

    public PlanPostPagoMinMeg(int m, double costMin, int megExpG,
            double costG, String nomPro, String ced, String ciuPro,
            String marcaCelu, String modelCelu, String numCelu) {

        super(nomPro, ced, ciuPro, marcaCelu, modelCelu, numCelu);
        min = m;
        costoMin = costMin;
        gigas = megExpG;
        costoGiga = costG;
    }

    @Override
    public void calcularPagoMensual() {
        pagoMensual = (min * costoMin) + (gigas * costoGiga);
    }

    public void establecerMin(int n) {
        this.min = n;
    }

    public void establecerCostoMin(double n) {
        this.costoMin = n;
    }

    public void establecerGigas(int n) {
        this.gigas = n;
    }

    public void establecerCostoXGiga(double n) {
        this.costoGiga = n;
    }

    public int obtenerMin() {
        return min;
    }

    public double obtenerCostoMin() {
        return costoMin;
    }

    public int obtenerGigas() {
        return gigas;
    }

    public double obtenerCostoXGiga() {
        return costoGiga;
    }

    @Override
    public String toString() {

        String cadena = String.format("Plan Post Pago de Minutos/Megas\n"
                + "%s"
                + "Minutos: %d\n"
                + "Costo por Minuto: %.2f\n"
                + "Gigas: %d\n"
                + "Costo por Giga: %.2f\n"
                + "Pago Mensual: %.2f\n\n",
                super.toString(), min, costoMin, gigas, costoGiga,
                pagoMensual);

        return cadena;
    }

}
