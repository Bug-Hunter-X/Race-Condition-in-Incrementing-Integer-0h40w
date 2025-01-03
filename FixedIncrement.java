import java.util.concurrent.atomic.AtomicInteger;

public class MyClass {
    private AtomicInteger x = new AtomicInteger(0);

    public void incrementX() {
        x.incrementAndGet(); // Atomic increment
    }

    public int getX() {
        return x.get(); // Get the value
    }
}