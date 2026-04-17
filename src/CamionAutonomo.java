public class CamionAutonomo extends Vehiculo implements IConectable {

    private String ruta;

    public CamionAutonomo(String id, String ruta) {
        super(id);
        this.ruta = ruta;
    }

    @Override
    public void patronMovimiento() {
        System.out.println("[Camión " + getId() + "] Movimiento: desplazamiento terrestre por ruta " + ruta + ".");
    }

    @Override
    public void sincronizarGPS() {
        System.out.println("[Camión " + getId() + "] GPS sincronizado. Ruta actualizada: " + ruta + ".");
    }
}