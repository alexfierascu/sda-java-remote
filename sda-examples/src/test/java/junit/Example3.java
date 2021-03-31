package junit;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;


public class Example3 {

  @Test
  public void testAssertEquals() {
    TestCase.assertEquals(64, 2 * 32);
    TestCase.assertEquals("Values are not equal", 1, 2);
  }

  @Test
  public void testAssertTrueFalse() {
    TestCase.assertTrue(3 == 3);
    Assert.assertFalse("Hello".equals("Not Hello"));
  }

  @Test
  public void testArrayEquals() {
    int[] firstArray = {1, 2, 3};
    int[] secondArray = {4, 5, 6};
    Assert.assertArrayEquals(firstArray, secondArray);
  }

  @Test
  public void testAssertNull() {
    String s = null;
    Assert.assertNull(s);
  }

  @Test
  public void testAssertSame() {
    String s1 = "abc";
    String s2 = "abc";
    Assert.assertSame(s1, s2);
  }

}
