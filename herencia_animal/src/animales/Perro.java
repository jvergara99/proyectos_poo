package animales;

public class Perro extends Canido {

    @Override
    public String getAlimentos() {
        return "Perro: su alimentación es carnívora";
    }

    @Override
    public String getHabitat() {
        return "Perro: su hábitat es doméstico";
    }

    @Override
    public String getNombreCientifico() {
        return "Perro: Canis lupus familiaris";
    }

    @Override
    public String getSonido() {
        return "Perro:su sonido es el ladrido";
    }
    
    
}
