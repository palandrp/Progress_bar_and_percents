public class Test {

  private static final String PATTERN = "%3d\r";

  static void updateProgress(double progressPercentage) {

    final int width = 50; // progress bar width in chars

    System.out.print("\r[");

    int i = 0;
    
    for (; i <= (int)(progressPercentage*width); i++) {
      System.out.print(".");
    }

    for (; i < width; i++) {
      System.out.print(" ");
    }

    System.out.print("]");
  }



  public static void main(String[] args) throws InterruptedException {
    try {
      int i = 0;
      for (double progressPercentage = 0.0; progressPercentage < 1.0; progressPercentage += 0.01) {
        System.out.format(PATTERN, i);
        updateProgress(progressPercentage);
        Thread.sleep(1000);
        i++;
      }
    } catch (InterruptedException e) {}
  }
}