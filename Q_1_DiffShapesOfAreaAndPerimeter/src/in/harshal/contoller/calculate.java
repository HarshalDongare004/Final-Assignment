package in.harshal.contoller;

public class calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		shapes circle = new Circle(6);
		System.out.println("The area of circle is "+ circle.getArea());
		System.out.println("The circumference of the circle is "+ circle.getPerimeter());
		
		shapes parallelogram = new  Parallelogram(6,10,8,8);
		System.out.println("The area of Paralleloram is "+ parallelogram.getArea());
		System.out.println("The perimeter of parallelogram is "+ parallelogram.getPerimeter());
		
		shapes rectangle = new Rectangle(10,6);
		System.out.println("The area of rectangle is "+ rectangle.getArea());
		System.out.println("The perimeter of rectangle is " + rectangle.getPerimeter());
		
		shapes trapzoid = new Trapezoid(12, 9, 6, 8, 8);
		System.out.println("The area of trapezoid is "+ trapzoid.getArea());
		System.out.println("The perimeter of trapezoid is "+ trapzoid.getPerimeter());
		
		shapes triangle = new Triangle(15,20);
		System.out.println("The area of triangle is "+ triangle.getArea());
		System.out.println("The perimeter of triangle is "+ triangle.getPerimeter());
	
		
	}

}
