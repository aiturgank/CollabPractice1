public class Practice1 {
    public static void main(String[] args) {

     Practice1 test = new Practice1();
     int[] nums = {6,6,7,8};
        System.out.println("test.array667(nums) = " + test.array667(nums));

    }

    public int array667(int[] nums) {

        int count = 0;

        for(int i = 0; i< nums.length-1; i++){

            if( nums[i]==6 && nums[i+1]==6){
                count ++;
            }else if(nums[i]==6 & nums[i+1]==7){
                count++;
            }
        }
        return count;
    }

}
