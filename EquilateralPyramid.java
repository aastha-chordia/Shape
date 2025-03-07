// Aastha Chordia
class EquilateralPyramid extends Shape implements Volume {
    private double height;
    
    public EquilateralPyramid(double baseSide, double height) {
        super(baseSide, baseSide);
        this.height = height;
    }
     public double calculateArea() {
        double baseArea = dimension1 * dimension1;
        double slantHeight = Math.sqrt((dimension1 / 2) * (dimension1 / 2) + height * height);
        double lateralArea = 2 * dimension1 * slantHeight;
        return baseArea + lateralArea;
    }

    public double calculatePerimeter() {
        return 4 * dimension1;
    }
    
    public double calculateVolume() {
        return (1.0 / 3.0) * dimension1 * dimension1 * height;
    }
}

