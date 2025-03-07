// Aastha Chordia
// 23070126003
class Circle extends Shape{
		public Circle(double radius){
				super(radius,0,0,0);
		}

		public double calculateArea(){
				return 3.14* radius *radius;
		}
		
		public double calculatePerimeter(){
				return 2* 3.14 * radius;
		}
}
