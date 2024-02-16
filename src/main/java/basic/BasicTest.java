package basic;

import io.vavr.control.Option;

/**
 * For this basic test, you should not use any library. e.g. you should not use Math.pow for power method
 */
public class BasicTest {

  /**
   * return i ^ n for positive Integer, None otherwise
   * also return None in case of errors
   */
  public static Option<Integer> power(Integer i, Integer n) {
    if (i != null && n != null && i >= 0 && n >= 0 && n <= 10) { // error handling for null, negative and large values
      double result = 1.0;
      for (int j = 0; j < n; j++) {
        result *= i;
      }
      return Option.of((int) result); // return the result
    } else {
      return Option.none();
    }
  }
}
