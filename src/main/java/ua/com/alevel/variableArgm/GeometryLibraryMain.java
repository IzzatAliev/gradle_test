package ua.com.alevel.variableArgm;

public class GeometryLibraryMain {

    public static void main(String[] args) {
        GeometryLibrary geometryLibrary = new SquareGeometryLibraryImpl();
        System.out.println(geometryLibrary.perimeter(2.0, 3.0, 2.0, 4.0));
        GeometryLibrary geometryLibrary1 = new TriangleGeometryLibraryImpl();
        System.out.println(geometryLibrary1.perimeter(2.0, 3.0, 2.0));
    }
}
