package CodingBat.Array2;

public class CountEvens {

    public static void main(String[] args) {
        int[] arrInt = {1, 3, 5};
        System.out.println(countEvens(arrInt));
    }

    public static int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }


}
