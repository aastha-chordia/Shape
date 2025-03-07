class Circle extends Shape{
		public Circle(double radius){
				super(radius,0,0,0);
		}

		public double calculateArea(){
				return 3.14* radius *radius;
		}
