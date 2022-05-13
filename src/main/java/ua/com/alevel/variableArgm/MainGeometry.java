package ua.com.alevel.variableArgm;

import java.util.Arrays;

public class MainGeometry {

    public static void main(String[] args) {

    }

    public void parameter(double...param){
        GeometryLibrarySupplier geometryLibrarySupplier = () -> Arrays.stream(param).sum();
    }
}
