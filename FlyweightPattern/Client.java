package FlyweightPattern;

public class Client {
    public static void main(String[] args) {
        Flyweight flyweight1 = FlyweightFactory.getFlyweight("state1");
        Flyweight flyweight2 = FlyweightFactory.getFlyweight("state1");
        Flyweight flyweight3 = FlyweightFactory.getFlyweight("state2");
        Flyweight flyweight4 = FlyweightFactory.getFlyweight("state4");
        System.out.println(flyweight1);
        System.out.println(flyweight2);
        System.out.println(flyweight3);
        System.out.println(flyweight4);

        flyweight1.operation(); // prints "ConcreteFlyweight: state1"
        flyweight2.operation(); // prints "ConcreteFlyweight: state1"
    }
}
