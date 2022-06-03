package f20220602.EjercicioClienteProveedor.Model;

public class Cliente extends Fabrica  {

    // Atributos
    private boolean capacidadDeCompra;
    private int dineroDeCompraMensual;

    // Constructores

    public Cliente() {
    }

    public Cliente(boolean capacidadDeCompra, int dineroDeCompraMensual) {
        this.capacidadDeCompra = capacidadDeCompra;
        this.dineroDeCompraMensual = dineroDeCompraMensual;
    }

    // Set&Get

    public boolean isCapacidadDeCompra() {
        return capacidadDeCompra;
    }

    public void setCapacidadDeCompra(boolean capacidadDeCompra) {
        this.capacidadDeCompra = capacidadDeCompra;
    }

    public int getDineroDeCompraMensual() {
        return dineroDeCompraMensual;
    }

    public void setDineroDeCompraMensual(int dineroDeCompraMensual) {
        this.dineroDeCompraMensual = dineroDeCompraMensual;
    }

    // Metodos

    @Override
    public String toString() {
        return "Cliente{" +
                "capacidadDeCompra=" + capacidadDeCompra +
                ", dineroDeCompraMensual=" + dineroDeCompraMensual +
                '}';
    }

    // Funcion cliente
    public void comprar() {
        System.out.println("Comprar productos para venta al detalle");
    }

}
