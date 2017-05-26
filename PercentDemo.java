public class PercentDemo {
	private static final String PATTERN = "%3d\r";
 
	public static void main(String[] args) throws InterruptedException {
		for (int i = 1; i <= 100; i++) {
			System.out.format(PATTERN, i);
			Thread.sleep(1000);
		}
	}
}