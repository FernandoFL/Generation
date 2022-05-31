package f20220527;

public class Alumno {

    //Atributos
    private String nombre;
    private String Apellido;
    private Integer edad;

    // Constructor Vacio

    public Alumno() {
    }

    // Constructor con parametros

    public Alumno(String nombre, String apellido, Integer edad) {
        this.nombre = nombre;
        Apellido = apellido;
        this.edad = edad;
    }

    // Accesadores y mutadores

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    // Metodos y funciones;
}
