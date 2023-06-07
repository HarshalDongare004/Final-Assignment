package in.harshal.contoller;

public class Triangle implements shapes{
		private double base;
		private double height;
		private double a;
		private double b;
		private double c;
		
		public Triangle(double base, double height) {
			this.base = base;
			this.height = height;
		}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 1/2 * base * height;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return base + height + Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
	}

	

	

}
