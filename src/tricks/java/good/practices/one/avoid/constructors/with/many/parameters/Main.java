package tricks.java.good.practices.one.avoid.constructors.with.many.parameters;

public class Main {

    public static void main(String[] args){
        Rectangle rectangle = new Rectangle.Builder(100,100).x(5).y(5).build();
        System.out.println("rectangle: " + rectangle.toString());
    }
}
