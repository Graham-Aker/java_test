package gateway;

public class call_here
{
	public static void loop() throws InterruptedException {
		while(true){
			System.out.println("Hello");
			Thread.sleep(10000);
		}
	}

	 public call_here() {}

    public static void main(String[] args) {
	loop();
    }

}
