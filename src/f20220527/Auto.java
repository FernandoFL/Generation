package f20220527;

public class Auto {

    // una clase es un modelo o prototipo
    //objeto nace a partir de la clase, caracteristicas o atributo
    // tiene metodos o funciones
    //algo concreto, lo convertimos en abstracto( no tangible)
    //tangible: usamos los 5 sentiodos para decribir

    // Atributos
    // Todos los atributos tienen accesibilidad provada ( private )
    // [Accesador][TipoDato][NombreAtributo]
    private String color;
    private String marca;
    private String modelo;
    private Double velocidad;

    // Constructor vacio

    public Auto() {
    }

    // Constructores con parametros

    public Auto(String color, String marca, String modelo, Double velocidad) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    // Accesadores y mutadores ( get y set )

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    // Metodos o funciones. estas son personalizadas, es decir, se ascriben a mano
    //
    public void aumentarVelocidad() {
        this.velocidad = 10d;
    }
}



