import java.util.Stack;

public class DonacionCareTaker {
    private Stack<Donacion.DonacionMemento> mementoStack = new Stack<>();

    public void save(Donacion donacion) {
        mementoStack.push(donacion.save());
    }

    public void undo(Donacion donacion) {
        if (!mementoStack.isEmpty()) {
            donacion.restore(mementoStack.pop());
        }
    }
}
