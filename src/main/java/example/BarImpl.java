package example;

/**
 * Created by sliu on 7/24/2017.
 */
public class BarImpl implements Bar{
  @Override
  public String doSomething(String arg) {
    int x = 10;
    int y = x * 10;
    return "hi";
  }
}
