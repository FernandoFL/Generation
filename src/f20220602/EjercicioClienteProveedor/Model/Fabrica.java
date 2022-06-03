package f20220602.EjercicioClienteProveedor.Model;

public class Fabrica {

    // Atributos
    private String nombre;
    private String rut;
    private String direccion;
    private String giro;
    private int numFactura;

    // Constructor

    public Fabrica() {
    }

    public Fabrica(String nombre, String rut, String direccion, String giro, int numFactura) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
        this.giro = giro;
        this.numFactura = numFactura;
    }

    // Set&Get

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro) {
        this.giro = giro;
    }

    public int getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
    }


    // Metodos toString

    @Override
    public String toString() {
        return "Fabrica{" +
                "nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                ", direccion='" + direccion + '\'' +
                ", giro='" + giro + '\'' +
                ", numFactura=" + numFactura +
                '}';
    }

    // Metodo Comprar
    public void comprar(){
        System.out.println("Compra materia prima");
    }
}

