package ua.com.alevel.variableArgm;

import java.util.Arrays;

public class TriangleGeometryLibraryImpl implements GeometryLibrary {
    @Override
    public double perimeter(double... par) {
        if (par.length == 3) {
            return Arrays.stream(par).sum();
        } else {
            throw new IllegalArgumentException("triangle == 3 arguments but yours = " + par.length);
        }
    }
}
