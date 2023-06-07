package in.harshal.contoller;

public class Rectangle implements shapes {
		private double length;
		private double width;

		public Rectangle(double length, double width) {
			this.length = length;
			this.width = width;
		}

		@Override
		public double getArea() {
			// TODO Auto-generated method stub
			return length * width;
		}
		@Override
		public double getPerimeter() {
			// TODO Auto-generated method stub
			return 2*(length + width);
		}
		
		
		
	

}
