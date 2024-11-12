package animales;

public class Gato extends Felino {

    @Override
    public String getAlimentos() {
        return "Gato: su alimentación son los ratones";
    }

    @Override
    public String getHabitat() {
        return "Gato: su hábitat es doméstico";
    }

    @Override
    public String getNombreCientifico() {
        return "Gato: Felis silvestris catus";
    }

    @Override
    public String getSonido() {
        return "Gato: su sonido es el maullido";
    }
    
}
