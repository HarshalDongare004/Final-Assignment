package in.harshal.contoller;

public class Trapezoid implements shapes {
	private double base1;
	private double base2;
	private double height;
	private double length1;
	private double length2;

	public Trapezoid(double base1,double base2,double height,double length1,double length2) {
		this.base1 = base1;
		this.base2 = base2;
		this.height = height;
		this.length1 = length1;
		this.length2 = length2;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return ((base1+base2)/2 * height);
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return  length1  + base1+ base2 + length2;
	}

	

}
