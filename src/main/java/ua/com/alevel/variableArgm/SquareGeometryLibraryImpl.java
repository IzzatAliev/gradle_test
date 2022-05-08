package ua.com.alevel.variableArgm;

import java.util.Arrays;

public class SquareGeometryLibraryImpl implements GeometryLibrary{
    @Override
    public double perimeter(double... par) {
        if (par.length == 4)
        return Arrays.stream(par).sum();
        else
            throw new IllegalArgumentException("Square == 4 arguments but yours = " + par.length);
    }
}
