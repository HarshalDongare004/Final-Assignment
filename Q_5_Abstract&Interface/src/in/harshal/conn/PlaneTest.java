package in.harshal.conn;

public class PlaneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//CARGO PLANE IS DOING THEIR THINGD USING ABSTRACT CLASSES
		CargoPlane cp = new CargoPlane();
		cp.type();
		cp.fly();
		cp.speed();
		
		//Passenger plane is doing things using interfaces
		PassengerPlane pp = new PassengerPlane();
		pp.type();
		pp.fly();
		pp.speed();
		
		
	}

}
