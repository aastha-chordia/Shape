// Aastha Chordia
class EquilateralPyramid extends Shape implements Volume {
    private double height;
    
    public EquilateralPyramid(double baseSide, double height) {
        super(baseSide, baseSide);
        this.height = height;
    }
