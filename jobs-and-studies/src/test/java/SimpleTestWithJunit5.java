import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class SimpleTestWithJunit5 {

  @BeforeAll
  public static void beforeAllTestSuit() {
    System.out.println("Before all test suite");
  }

  @BeforeEach
  public void beforeEachTest() {
    System.out.println("Before each test");
  }

  @Test
  @Order(1)
  public void simpleCTest() {
    System.out.println("Test 1");
  }

  @Test
  @Order(2)
  @DisplayName("testul meu smecher")
  public void simpleBTest() {
    System.out.println("Test 2");
  }

  @AfterEach
  public void afterEachTest() {
    System.out.println("After each test");
  }

  @AfterAll
  public static void afterAllTestSuit() {
    System.out.println("After all test suite");
  }

}
