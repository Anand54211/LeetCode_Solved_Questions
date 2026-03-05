import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    public boolean ContainsDuplicate(int[] nums) {


        Set<Integer> duplicate = new HashSet<>();
        for (int num : nums) {
           if (!duplicate.add(num)){
               return  true;
           };
        }


        return false;

        //return (x != y);
    }
}
