import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum{

  public int[] TwoSUM(int[] arr, int target)
  {
      Map<Integer,Integer> hash = new HashMap<>();

      for(int f = 0; f < arr.length; f++ ){
          int v = target - arr[f];

          if(hash.containsKey(v)){
             return (((new int[] {hash.get(v), f})));
          }
          hash.put(arr[f],f);
      }
      return new int[]{};
  }


}
