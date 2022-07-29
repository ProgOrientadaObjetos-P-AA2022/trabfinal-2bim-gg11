package p2;

public class PlanPostPagoMinutos extends PlanCelular {

    private int minN;
    private double costoMinN;
    private int minInt;
    private double costoMinInt;

    public PlanPostPagoMinutos(int min, double costoMN, int minI,
            double costoMinI, String nomPro, String ced, String ciuPro,
            String marcaCelu, String modelCelu, String numCelu) {

        super(nomPro, ced, ciuPro, marcaCelu, modelCelu, numCelu);
        minN = min;
        costoMinN = costoMN;
        minInt = minI;
        costoMinInt = costoMinI;
    }

    public void establecerMinN(int n) {
        minN = n;
    }

    public void establecerCostoMinN(double n) {
        costoMinN = n;
    }

    public void establecerMinInt(int n) {
        minInt = n;
    }

    public void establecerCostoMinInt(double n) {
        costoMinInt = n;
    }

    public int obtenerMinN() {
        return minN;
    }

    public double obtenerCostoMinN() {
        return costoMinN;
    }

    public int obtenerMinInt() {
        return minInt;
    }

    public double obtenerCostoMinInt() {
        return costoMinInt;
    }

    @Override
    public void calcularPagoMensual() {
        pagoMensual = (minN * costoMinN) + (minInt * costoMinInt);
    }

    @Override
    public String toString() {

        String cadena = String.format("Plan Post Pago de Minutos\n"
                + "%s"
                + "Minutos (Nacional): %d\n"
                + "Costo por Minuto(Nacional): %.2f\n"
                + "Minutos (Internacional): %d\n"
                + "Costo por Minuto(Internacional): %.2f\n"
                + "Pago Mensual: %.2f\n\n",
                super.toString(), minN, costoMinN, minInt,
                costoMinInt, pagoMensual);
        return cadena;
    }

}
