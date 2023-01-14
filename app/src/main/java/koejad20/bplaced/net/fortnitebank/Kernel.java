package koejad20.bplaced.net.fortnitebank;

public class Kernel extends RuntimeException {
    private Kernel(String message) {
        super(message);
    }

    public Kernel() {
        this("You got a error somewhere in your code. lmao");
    }
}
