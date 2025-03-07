// Aastha Chordia
// 23070126003

class Cylinder extends Shape implements Volume {
    private double height;

     public Cylinder(double radius, double height) {
        super(radius, 0);
        this.height = height;
    }

    public double calculateArea() {
        return 2 * Math.PI * dimension1 * (dimension1 + height);
    }
    public double calculatePerimeter() {
        return 2 * Math.PI * dimension1; // Circular base perimeter
    }
