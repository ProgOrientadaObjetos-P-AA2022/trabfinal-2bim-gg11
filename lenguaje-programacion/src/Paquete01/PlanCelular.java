
package Paquete01;


public abstract class PlanCelular {
    
    protected String nombre;
    protected String cedula;
    protected String ciudad;
    protected String marca;
    protected String modelo;
    protected String numero;
    protected double pagoMensual;

    public PlanCelular(String nomPro, String ced, String ciuPro, 
            String marcaCelu, String modelCelu, String numCelu) {
        
        nombre = nomPro;
        cedula = ced;
        ciudad = ciuPro;
        marca = marcaCelu;
        modelo = modelCelu;
        numero = numCelu;
    }
    
    public abstract void calcularPagoMensual();

    public void establecerNombre(String n) {
        this.nombre = n;
    }

    public void establecerCedula(String n) {
        this.cedula = n;
    }

    public void establecerCiudad(String n) {
        this.ciudad = n;
    }

    public void establecerMarca(String n) {
        this.marca = n;
    }

    public void establecerModelo(String n) {
        this.modelo = n;
    }

    public void establecerNumero(String n) {
        this.numero = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    public String obtenerMarca() {
        return marca;
    }

    public String obtenerModelo() {
        return modelo;
    }

    public String obtenerNumero() {
        return numero;
    }
    
    public double obtenerPagoMensual() {
        return pagoMensual;
    }
    
    @Override
    public String toString() {
        
        String cadena = String.format("Nombre propietario: %s\n"
                + "Cedula: %s\n"
                + "Ciudad: %s\n"
                + "Marca celular: %s\n"
                + "Modelo: %s\n"
                + "Numero: %s\n",
                nombre, cedula, ciudad, marca, modelo, numero);     
        return cadena;
    }
    
}
