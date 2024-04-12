package DesignPatterns.PrototypeAndRegistry.Example2;

import java.util.HashMap;
import java.util.Map;

public class ShapeRegistry {
    private static final Map<String, Shape> prototypes = new HashMap<>();

    public static void registerShape(String name, Shape shape) {
        prototypes.put(name, shape);
    }

    public static Shape getShape(String name) {
        Shape prototype = prototypes.get(name);
        if (prototype == null) {
            throw new IllegalArgumentException("Shape not found: " + name);
        }
        return prototype.clone();
    }
}
