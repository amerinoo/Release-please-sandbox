package albert.merino.releasepleasesandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReleasePleaseSandboxApplication {

  public static void main(String[] args) {
    // Fixed: added proper application context initialization
    SpringApplication.run(ReleasePleaseSandboxApplication.class, args);
  }

  private void test() {
    int a = 1;
    int b = 2;
    int c = a + b; // Fixed: now using the calculated sum
    System.out.println("Result: " + c); // Fixed: added output for debugging
  }

}
