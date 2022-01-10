
public class ArrayTest {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        MyTools mt = new MyTools();
        mt.printArr(nums);

        for(int num:nums){
            System.out.println(num);
        }
    }
}

class MyTools {

    String name;

    public void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}