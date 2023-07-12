package Arrays;

public class MaxArr {
    public static void main(String[] args) {
        int[] arr ={1,6,6,8,9};

        System.out.println(MaxRange(arr,1,3));
    }

    static int MaxRange(int[] arr, int start, int end){

        int maxvalue = arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i]> maxvalue){
                maxvalue = arr[i];
            }
        }
        return maxvalue;
    }
    static int Max(int[] arr){

        int maxvalue = arr[0];
        for (int i = 0; i < 5; i++) {
            if (arr[i]> maxvalue){
                maxvalue = arr[i];
            }
        }
        return maxvalue;
    }
}
