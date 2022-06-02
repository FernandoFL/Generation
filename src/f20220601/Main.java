package f20220601;

import f20220601.model.Gato;
import f20220601.model.Mascota;
import f20220601.model.Mishi;
import f20220601.model.Perro;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Herencia

        // Instanciar a la clase Mascota
        Mascota mascota = new Mascota();

        // Instanciar a la clase Perro
        Perro perro = new Perro();
        perro.setColor("Green");
        perro.setNombre("Rocco");

        //Instanciar a la clase Gato
        Gato gato = new Gato();
        gato.setEspecie("Felino");
        gato.setPelaje("Pelo");
        gato.setPeso(3f);

        // Agregando valores a los parametros
        mascota.setColor("Gris");
        mascota.setNombre("Tom");

        // Imprimir los valores
        System.out.println(gato);

        Mishi mishi = new Mishi(true);

        System.out.println(mishi.toString());

        // Polimorfismo

        List<Mascota> listaMascotas = new ArrayList<Mascota>();

        Mascota regalon = new Mascota("negro", "Canes", "Pelo", "Firulais", 1.5f, "Macho");
        listaMascotas.add(regalon);

        Mascota felix = new Gato();
        felix.setNombre("Feliz");
        felix.setColor("Negro");
        felix.setPeso(3f);
        listaMascotas.add(felix);

        Mascota chocolo = new Perro();
        chocolo.setNombre("Chocolo");
        chocolo.setColor("Cafe");
        chocolo.setPeso(10f);
        listaMascotas.add(chocolo);

        regalon.hacerSonido(); // Lamado al metodo en mascota
        felix.hacerSonido();
        chocolo.hacerSonido();

        System.out.println("******");

        //recorrer el arreglo
        for (Mascota mascota2 : listaMascotas) {
            mascota2.hacerSonido();
        }

        // Transformar el objeto generico a uno especifico
        Perro perroChocolo = (Perro) chocolo;
        perroChocolo.setCantPaseo(6);

    }
}
