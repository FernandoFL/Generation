package f20220602.EjercicioClienteProveedor.Model;

public class Proveedor extends Fabrica {

    // Atributos
    private int numCentrosDistribucion;
    private int cantidadMinimaCompra;
    private Boolean despachoDomicilio;

    // Constructor

    public Proveedor() {
    }

    public Proveedor(int numCentrosDistribucion, int cantidadMinimaCompra, Boolean despachoDomicilio) {
        this.numCentrosDistribucion = numCentrosDistribucion;
        this.cantidadMinimaCompra = cantidadMinimaCompra;
        this.despachoDomicilio = despachoDomicilio;
    }
// Set&Get

    public int getNumCentrosDistribucion() {
        return numCentrosDistribucion;
    }

    public void setNumCentrosDistribucion(int numCentrosDistribucion) {
        this.numCentrosDistribucion = numCentrosDistribucion;
    }

    public int getCantidadMinimaCompra() {
        return cantidadMinimaCompra;
    }

    public void setCantidadMinimaCompra(int cantidadMinimaCompra) {
        this.cantidadMinimaCompra = cantidadMinimaCompra;
    }

    public Boolean getDespachoDomicilio() {
        return despachoDomicilio;
    }

    public void setDespachoDomicilio(Boolean despachoDomicilio) {
        this.despachoDomicilio = despachoDomicilio;
    }


    // Metodos


    @Override
    public String toString() {
        return "Proveedor{" +
                "numCentrosDistribucion=" + numCentrosDistribucion +
                ", cantidadMinimaCompra=" + cantidadMinimaCompra +
                ", despachoDomicilio=" + despachoDomicilio +
                '}';
    }

    // Funcion Proveedor
    public void comprar() {
        System.out.println("Comprar productos para venta al mayor");
    }

}

