package collection;

import basic.BasicTest;
import io.vavr.control.Option;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * You should complete the function in this class
 * <p>
 * Feel free to define any method and / or class you want
 */
class CollectionTest {

  /**
   * operation : x -> ((x * 2) + 3) ^ 5
   */
  public static List<Double> compute1(List<Integer> input) {
    List<Double> result = new ArrayList<>();
    // parsing the input and computing the result
    for (Integer value : input) {
      Option<Integer> computedValue = BasicTest.power((value * 2) + 3, 5); // compute the value
      result.add(computedValue.getOrElse(0).doubleValue()); // add the value to the result
    }
    return result;
  }

  /**
   * operation : abc -> AbcAbc
   */
  public static List<String> compute2(List<String> input) {
    List<String> result = new ArrayList<>();
    if(input.isEmpty()) {
      return result; // return empty list
    }
    for (String value : input) {
      if(Objects.equals(value, "")){
        result.add(""); // add empty string
        continue;
      }
      // capitalize the first letter and add concatenation Abc -> AbcAbc
      String temp = value.substring(0, 1).toUpperCase() + value.substring(1);
      result.add(temp + temp); // concatenate and add to result
    }
    return result; // return the result
  }
}