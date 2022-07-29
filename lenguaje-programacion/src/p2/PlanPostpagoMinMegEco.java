
package p2;

public class PlanPostpagoMinMegEco extends PlanCelular {
    
    private int min;
    private double costoMin;
    private int gigas;
    private double costoXGiga;
    private int prctjDscto;

    public PlanPostpagoMinMegEco(int m, double costoM, int megExpG, 
            double costoXG, int prctjDsct, String nomPro, String ced, 
            String ciuPro, String marcaCelu, String modelCelu, String numCelu) {
        
        super(nomPro, ced, ciuPro, marcaCelu, modelCelu, numCelu);
        min = min;
        costoMin = costoM;
        gigas = megExpG;
        costoXGiga = costoXG;
        prctjDscto = prctjDsct;
    }
    
    @Override
    public void calcularPagoMensual() {
        pagoMensual = ((min * costoMin) + (gigas * costoXGiga));
        pagoMensual = pagoMensual - ((pagoMensual * prctjDscto) / 100);
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
        this.costoXGiga = n;
    }

    public void establecerPorctjDscto(int n) {
        this.prctjDscto = n;
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
        return costoXGiga;
    }

    public int obtenerPorctjDscto() {
        return prctjDscto;
    }
    
    @Override
    public String toString() {
        
        String porcentaje = "%";
        
        String cadena = String.format("Plan Post Pago Minutos Megas(Económico)\n"
                + "%s"
                + "Minutos: %d\n"
                + "Costo por Minuto: %.2f\n"
                + "Gigas: %d\n"
                + "Costo por Giga: %.2f\n"
                + "Porcentaje descuento: %d%s\n"
                + "Pago Mensual: %.2f\n\n",
                super.toString(), min, costoMin, gigas, costoXGiga,
                prctjDscto, porcentaje, pagoMensual);
        
        return cadena;
    }
    
}
