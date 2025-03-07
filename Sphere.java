//Aastha Chordia
// 23070126003
class Sphere extends Shape implements Volume {
    public Sphere(double radius) {
        super(radius, 0);
    }
    public double calculateArea() {
        return 4 * Math.PI * dimension1 * dimension1;
    }

    public double calculatePerimeter() {
        return 0; // Spheres do not have a perimeter
    }

