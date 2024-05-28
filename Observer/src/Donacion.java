import java.util.ArrayList;
import java.util.List;

public class Donacion {
    private String tipo;
    private String detalle;
    private List<DonacionObserver> observers = new ArrayList<>();

    public Donacion(String tipo, String detalle) {
        this.tipo = tipo;
        this.detalle = detalle;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
        notifyObservers();
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
        notifyObservers();
    }

    public void addObserver(DonacionObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(DonacionObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (DonacionObserver observer : observers) {
            observer.update(this);
        }
    }
}
