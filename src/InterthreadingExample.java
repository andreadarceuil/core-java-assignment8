/**
 * 
 */

/**
 * @author darce
 *
 */
public class InterthreadingExample {

	/**
	 * 
	 */
	public InterthreadingExample() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {

					System.out.println("Running thread one...");
			}
			
			
		});
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Running thread two...");				
			}
			
		});
		t1.start();
		t2.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
