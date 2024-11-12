package animales;

public class Leon extends Felino {

    @Override
    public String getAlimentos() {
        return "León: su alimentación es carnívora";
    }

    @Override
    public String getHabitat() {
        return "León: su hábitat es la pradera ";
    }

    @Override
    public String getNombreCientifico() {
        return "León: Panthera leo";
    }

    @Override
    public String getSonido() {
        return "León: su sonido es el rugido";
    }
    
}
