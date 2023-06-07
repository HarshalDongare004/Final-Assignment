
public class EvenOddPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread evenThread = new Thread(new Runnable() {;
		@Override
		public void run() {
			for (int i=2;i<=10;i+=2) {
				System.out.println(i);
			}
		}
	});
		
		Thread oddThread = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i=1;i<=10;i+=2) {
					System.out.println(i);
				}
			}
		});
		
		//starting two threads
		evenThread.start();
		oddThread.start();
		
		
	}

}
