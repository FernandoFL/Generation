package f20220601.model;

public class Gato extends Mascota {

    // Atributos
    private Boolean garrasRetractil;
    private Boolean visionNocturna;

    // Constructor

    public Gato() {
    }

    public Gato(Boolean garrasRetractil, Boolean visionNocturna) {
        this.garrasRetractil = garrasRetractil;
        this.visionNocturna = visionNocturna;
    }

    // Set&Get

    public Boolean getGarrasRetractil() {
        return garrasRetractil;
    }

    public void setGarrasRetractil(Boolean garrasRetractil) {
        this.garrasRetractil = garrasRetractil;
    }

    public Boolean getVisionNocturna() {
        return visionNocturna;
    }

    public void setVisionNocturna(Boolean visionNocturna) {
        this.visionNocturna = visionNocturna;
    }

    // Metodo toString

    @Override
    public String toString() {
        return "Gato{" +
                "garrasRetractil=" + garrasRetractil +
                ", visionNocturna=" + visionNocturna +
                '}' + super.toString() ;
    }

    public void hacerSonido(){
        System.out.println("Miau, Miau");
    }
}
