package tricks.java.good.practices.generics;

public class Cash {
    private int value;
    private String name;

    public Cash(int value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Billete{" +
                "value=" + value +
                ", name='" + name + '\'' +
                '}';
    }
}
