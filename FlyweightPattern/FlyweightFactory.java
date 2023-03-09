package FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static final Map<String, Flyweight> flyweights = new HashMap<>();

    public static Flyweight getFlyweight(String intrinsicState) {
        if (!flyweights.containsKey(intrinsicState)) {
            flyweights.put(intrinsicState, new ConcreteFlyweight(intrinsicState));
        }
        return flyweights.get(intrinsicState);
    }
}
