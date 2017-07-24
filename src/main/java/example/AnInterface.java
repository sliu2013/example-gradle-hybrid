package example;

/**
 * Created by sliu on 7/24/2017.
 */
public interface AnInterface {

  int addition (int x);

  static int staticAdd(int y){
    int z = y + 10;
    return z;
  }
}
