// Aastha Chordia
// 23070126003

class Cylinder extends Shape implements Volume {
    private double height;

     public Cylinder(double radius, double height) {
        super(radius,height, 0,0);
        this.height = height;
    }

    public double calculateArea() {
        return 2 * 3.14 * dim_one * (dim_one + dim_two);
    }
    public double calculatePerimeter() {
        return 2 * 3.14* dimension1; // Circular base perimeter
    }
    public double calculateVolume() {
        return 3.14 * dim_one * dim_one * dim_two;
    }
}
.
