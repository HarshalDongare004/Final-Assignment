package in.harshal.contoller;

public class Circle implements shapes {

		// TODO Auto-generated method stub
		private double radius;
		
		public Circle(double radius) {
			this.radius = radius;
		}
	
		// overriding from shapes interface getArea() and getPerimeter()
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}
	
	
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 *Math.PI * radius;
	}

}
