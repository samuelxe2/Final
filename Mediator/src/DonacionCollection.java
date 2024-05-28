import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DonacionCollection implements Iterable<Donacion> {
    private Map<String, Donacion> donaciones = new HashMap<>();

    public void agregarDonacion(String id, Donacion donacion) {
        donaciones.put(id, donacion);
    }

    @Override
    public Iterator<Donacion> iterator() {
        return donaciones.values().iterator();
    }
}
