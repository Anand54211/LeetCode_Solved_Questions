public class PlusOne {

    public int[] plusOne(int[] arr){

    int lastindex = arr.length -1;

    for (int i = lastindex; i >= 0; i--) {
        if (arr[i] < 9) {
            arr[i]++;
            return arr;
        }

        arr[i] = 0;
    }
    int[] newArr = new int[arr.length + 1];
    newArr[0] = 1;
    return newArr;

    }
}
