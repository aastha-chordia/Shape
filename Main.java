// Aastha chordia

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\nShape Calculation Menu:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Equilateral Pyramid");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter radius of the circle: ");
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle(radius);
                    displayResults(circle);
                    break;
                 case 2:
                    System.out.print("Enter length: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter width: ");
                    double width = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(length, width);
                    displayResults(rectangle);
                    break;
                case 3:
                    System.out.print("Enter side of square: ");
                    double side = scanner.nextDouble();
                    Square square = new Square(side);
                    displayResults(square);
                    break;
                case 4:
                    System.out.print("Enter radius of the sphere: ");
                    double sphereRadius = scanner.nextDouble();
                    Sphere sphere = new Sphere(sphereRadius);
                    displayResults(sphere);
                    break;
                case 5:
                    System.out.print("Enter radius of the cylinder: ");
                    double cylinderRadius = scanner.nextDouble();
                    System.out.print("Enter height of the cylinder: ");
                    double height = scanner.nextDouble();
                    Cylinder cylinder = new Cylinder(cylinderRadius, height);
                    displayResults(cylinder);
                    break;
                case 6:
                    System.out.print("Enter base side of the pyramid: ");
                    double baseSide = scanner.nextDouble();
                    System.out.print("Enter height of the pyramid: ");
                    double pyramidHeight = scanner.nextDouble();
                    EquilateralPyramid pyramid = new EquilateralPyramid(baseSide, pyramidHeight);
                    displayResults(pyramid);
                    break;
                 case 7:
                    System.out.println("Exiting program.");
                    break;
               
