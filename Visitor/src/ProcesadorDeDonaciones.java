import java.util.ArrayList;
import java.util.List;

public class ProcesadorDeDonaciones {
    private List<DonacionVisitable> donaciones;

    public ProcesadorDeDonaciones() {
        donaciones = new ArrayList<>();
    }

    public void agregarDonacion(DonacionVisitable donacion) {
        donaciones.add(donacion);
    }

    public void procesarDonaciones(DonacionVisitor visitor) {
        for (DonacionVisitable donacion : donaciones) {
            donacion.accept(visitor);
        }
    }
}
