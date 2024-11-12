package animales;

public class Lobo extends Canido {

    @Override
    public String getAlimentos() {
        return "Lobo: su alimentación es carnívora";
    }

    @Override
    public String getHabitat() {
        return "Lobo: su hábitat es el bosque";
    }

    @Override
    public String getNombreCientifico() {
        return "Lobo: Canis lupus";
    }

    @Override
    public String getSonido() {
        return "Lobo: su sonido es el aullido";
    }
    
}
