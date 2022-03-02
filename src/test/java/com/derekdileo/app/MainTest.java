package com.derekdileo.app;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class MainTest {
	
  private final Logger LOG = LoggerFactory.getLogger(MainTest.class);

//  @DisplayName("Result == 1 (because 1 <= 1)")
  @Test
  public void fibShouldReturnNumBecauseNumEqualsOne() {
      int one = 1;
      int result = Main.fibRecursive(one);
      LOG.debug("Called fibShouldReturnNumBecauseNumEqualsOne and result is {} because {} is <= 1", result, one);
      assertEquals(1, result);
  }

//  @DisplayName("Result == -1 (because -1 <= 1)")
  @Test
  public void fibShouldReturnNumbBecauseLessThanOrEqualToOne() {
      int num = -1;
      int result = Main.fibRecursive(num);
      LOG.debug("Called fibShouldReturnNumbBecauseLessThanOrEqualToOne and result is {} because {} is <= 1", result, num);
      assertEquals(result, num);
  }

//  @DisplayName("Result == 55 (because fib(10) == 55)")
  @Test
  public void fibShouldReturn55ForFibOf10() {
      int result = Main.fibRecursive(10);
      String resultStr = "" + result;
      LOG.debug("Called fibShouldReturn55ForFibOf10 and result is {}", resultStr);
      assertEquals(55, result);
  }

  @Test
  public void fibShouldNotReturn34ForFibOf10() {
      int num = 10;
      int result = Main.fibRecursive(num);
      LOG.debug("Called fibShouldNotReturn34ForFibOf10 and result is {} because fib({}) is {}", result, num, result);
      assertNotEquals(34, result);
  }


}
