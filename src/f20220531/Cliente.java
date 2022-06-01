package f20220531;

import java.util.List;

public class Cliente {

    // Atributos
    // String rut;  este es un ejemplo de un accesador por default, es decir, puedo ver sus atributos desde otras clases que se encuentren en el mismo package o carpeta
    // private String rut; Este es un ejemplo de un accesador private, es decir, solo puedo acceder a sus atributos desde la misma clase
    // protected Integer id; Este es un ejemplo de un accesador protected
    private String rut;
    private Integer id;
    private List<Integer> numerosVenta;
    private String nombre;
    private String correo;

    // Constructor

    public Cliente() {
    }

    public Cliente(String rut, Integer id, List<Integer> numerosVenta, String nombre, String correo) {
        this.rut = rut;
        this.id = id;
        this.numerosVenta = numerosVenta;
        this.nombre = nombre;
        this.correo = correo;
    }

    // Accesadores y mutadores  (Set&Get)

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Integer> getNumerosVenta() {
        return numerosVenta;
    }

    public void setNumerosVenta(List<Integer> numerosVenta) {
        this.numerosVenta = numerosVenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "rut='" + rut + '\'' +
                ", id=" + id +
                ", numerosVenta=" + numerosVenta +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
