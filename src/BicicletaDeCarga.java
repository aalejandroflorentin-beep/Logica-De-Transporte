public class BicicletaDeCarga extends Vehiculo {

    private double capacidadKg;

    public BicicletaDeCarga(String id, double capacidadKg) {
        super(id);
        this.capacidadKg = capacidadKg;
    }

    @Override
    public void patronMovimiento() {
        System.out.println("[Bicicleta " + getId() + "] Movimiento: pedaleando con carga de " + capacidadKg + " kg.");
    }
}