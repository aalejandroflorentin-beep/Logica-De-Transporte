public class Main {

    public static void main(String[] args) {

        DronTransporte dron1 = new DronTransporte("DRON-001", 80);
        CamionAutonomo camion1 = new CamionAutonomo("CAM-001", "Ruta 1");
        BicicletaDeCarga bici1 = new BicicletaDeCarga("BIC-001", 15.5);

        CentroControl centro = new CentroControl();
        centro.registrarUnidad(dron1);
        centro.registrarUnidad(camion1);
        centro.registrarUnidad(bici1);

        centro.monitorearFlota();

        // Comportamientos extra (interfaces)
        dron1.sincronizarGPS();
        dron1.recargarEnergia();
        camion1.sincronizarGPS();
    }
}