// Aastha Chordia
// 23070126003
// Square.java - Class representing a Square
class Square extends Shape {
    public Square(double side) {
        super(side, side);
    }

    public double calculateArea() {
        return dimension1 * dimension1;
    }

    public double calculatePerimeter() {
        return 4 * dimension1;
    }
}
