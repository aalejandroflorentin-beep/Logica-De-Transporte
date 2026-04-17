import java.util.ArrayList;

public class CentroControl {

    private ArrayList<Vehiculo> flota;

    public CentroControl() {
        this.flota = new ArrayList<>();
    }

    public void registrarUnidad(Vehiculo v) {
        flota.add(v);
        System.out.println("Unidad registrada: " + v.getId());
    }

    public void monitorearFlota() {
        System.out.println("\n--- Monitoreando flota ---");
        for (Vehiculo v : flota) {
            v.patronMovimiento();
        }
        System.out.println("--- Fin del monitoreo ---\n");
    }
}