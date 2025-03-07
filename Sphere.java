//Aastha Chordia
// 23070126003
class Sphere extends Shape implements Volume {
    public Sphere(double radius) {
        super(radius, 0);
    }
    public double calculateArea() {
        return 4 * 3.14 * dimension1 * dimension1;
    }

    public double calculatePerimeter() {
        return 0; // Spheres do not have a perimeter
    }

    public double calculateVolume() {
        return (4.0 / 3.0) * 3.14 * Math.pow(dimension1, 3);
    }
}
