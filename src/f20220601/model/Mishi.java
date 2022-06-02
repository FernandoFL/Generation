package f20220601.model;

public class Mishi extends Gato{

    // Atributo
    private Boolean famosoEnInternet;

    //Constructores

    public Mishi() {
    }

    public Mishi(Boolean famosoEnInternet) {
        this.famosoEnInternet = famosoEnInternet;
    }

    //Set&Get

    public Boolean getFamosoEnInternet() {
        return famosoEnInternet;
    }

    public void setFamosoEnInternet(Boolean famosoEnInternet) {
        this.famosoEnInternet = famosoEnInternet;
    }

    // Metodo toString

    @Override
    public String toString() {
        return "Mishi{" +
                "famosoEnInternet=" + famosoEnInternet +
                '}'+ super.toString();
    }
}
