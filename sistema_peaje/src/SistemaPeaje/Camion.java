package SistemaPeaje;

public class Camion extends Vehiculo {
    static int valorPeajeEje = 5000;
    int numeroEjes;

    Camion(String placa, int numEjes) {
        super(placa);
        this.numeroEjes = numEjes;
    }
    
}
