package in.harshal.contoller;

public class Parallelogram implements shapes {
		private double base;
		private double height;
		private double lenHorizontal;
		private double lenVertical;
		
		public Parallelogram(double base, double height, double lenHorizontal, double lenVertical) {
			this.base = base;
			this.height = height;
			this.lenHorizontal = lenHorizontal;
			this.lenVertical = lenVertical;
		}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return  base * height;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return  2 *lenHorizontal+ 2 * lenVertical;
	}

	
	

}
