package ua.com.alevel.insider;

public class Car implements Cloneable {

    private String name;
    private Integer speed;
    private TypeCar typeCar;

    public Car(String name, Integer speed, TypeCar typeCar) {
        this.name = name;
        this.speed = speed;
        this.typeCar = typeCar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public TypeCar getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(TypeCar typeCar) {
        this.typeCar = typeCar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (name != null ? !name.equals(car.name) : car.name != null) return false;
        if (speed != null ? !speed.equals(car.speed) : car.speed != null) return false;
        return typeCar == car.typeCar;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (speed != null ? speed.hashCode() : 0);
        result = 31 * result + (typeCar != null ? typeCar.hashCode() : 0);
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }

    @Override
    public String toString() {
        return "\nCar{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", typeCar=" + typeCar +
                '}';
    }
}
