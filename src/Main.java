import java.util.*;

public class Main {

    public static void main(String[] args) {

        // two sum - 1
        /*
        int [] arr = {3,7,8,2};
        int target = 11;
        TwoSum twosum = new TwoSum();
        System.out.println(Arrays.toString(twosum.TwoSUM(arr,target)));
        */

        //valid parenthesis - 20
        /*
        String s = "{[]}";
        ValidParenthesis validParenthesis = new ValidParenthesis();
        System.out.println(validParenthesis.validParenthesis(s));
        */

        //merge two sorted lists - 21
        /*
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        MergeTwoSortedLists.ListNode l1 = new MergeTwoSortedLists.ListNode(1, new MergeTwoSortedLists.ListNode(3, new MergeTwoSortedLists.ListNode(5)));
        MergeTwoSortedLists.ListNode l2 = new MergeTwoSortedLists.ListNode(2, new MergeTwoSortedLists.ListNode(4, new MergeTwoSortedLists.ListNode(6)));
        MergeTwoSortedLists.ListNode merge = mergeTwoSortedLists.mergeTwoSortedLists(l1, l2);
        System.out.println(merge.toString());
         */

        PlusOne plusOne = new PlusOne();
        int [] arr = {4,5,9};
        System.out.println(Arrays.toString(plusOne.plusOne(arr)));


    }
}