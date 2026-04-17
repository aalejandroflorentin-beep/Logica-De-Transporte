public class DronTransporte extends Vehiculo implements IConectable, IRecargable {

    private int nivelBateria;

    public DronTransporte(String id, int nivelBateria) {
        super(id);
        this.nivelBateria = nivelBateria;
    }

    @Override
    public void patronMovimiento() {
        System.out.println("[Dron " + getId() + "] Movimiento: vuelo autónomo a baja altitud.");
    }

    @Override
    public void sincronizarGPS() {
        System.out.println("[Dron " + getId() + "] GPS sincronizado vía satélite.");
    }

    @Override
    public void recargarEnergia() {
        nivelBateria = 100;
        System.out.println("[Dron " + getId() + "] Batería recargada al 100%.");
    }
}