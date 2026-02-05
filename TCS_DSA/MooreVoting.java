public class MooreVoting {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        int result = majorityElement(arr);
        if(result != -1){
            System.out.println("Majority Element: " + result);
        } else {
            System.out.println("No majority element");
        }
    }
    public static int majorityElement(int[] nums){
        int count=0;
        int candidate=0;
        for(int num:nums){
           if(count==0){
               candidate=num;
           }
           if(num==candidate){
            count++;
           }
           else{
            count--;
           }
        }
        int occurrences = 0;
        for(int num: nums){
            if(num == candidate) occurrences++;
        }
        if(occurrences > nums.length/2) return candidate;
        return -1;
    }

}
