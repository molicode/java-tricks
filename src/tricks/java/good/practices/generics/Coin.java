package tricks.java.good.practices.generics;

public class Coin {
    private int value;
    private String name;

    public Coin(int value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Moneda{" +
                "value=" + value +
                ", name='" + name + '\'' +
                '}';
    }
}
