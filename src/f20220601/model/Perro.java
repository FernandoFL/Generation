package f20220601.model;


public class Perro extends Mascota{

    // Atributos
    private Integer cantPaseo;
    private Float tamanoHocico;
    private String sonidoVocal;

    // Constructores

    public Perro() {
    }

    public Perro(Integer cantPaseo, Float tamanoHocico, String sonidoVocal) {
        this.cantPaseo = cantPaseo;
        this.tamanoHocico = tamanoHocico;
        this.sonidoVocal = sonidoVocal;
    }

    // Set&Get

    public Integer getCantPaseo() {
        return cantPaseo;
    }

    public void setCantPaseo(Integer cantPaseo) {
        this.cantPaseo = cantPaseo;
    }

    public Float getTamanoHocico() {
        return tamanoHocico;
    }

    public void setTamanoHocico(Float tamanoHocico) {
        this.tamanoHocico = tamanoHocico;
    }

    public String getSonidoVocal() {
        return sonidoVocal;
    }

    public void setSonidoVocal(String sonidoVocal) {
        this.sonidoVocal = sonidoVocal;
    }

    // Metodo toString

    @Override
    public String toString() {
        return "Perro{" +
                "cantPaseo=" + cantPaseo +
                ", tamanoHocico=" + tamanoHocico +
                ", sonidoVocal='" + sonidoVocal + '\'' +
                '}';
    }

    public void hacerSonido(){
        System.out.println("Guau, Guau");
    }
}
