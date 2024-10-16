public class Range_search {
    public static void main(String[] args) {
        int arr[]={49,30,22,54,33,56,23};
        int target=54;
        int s,e;
        int r=search(arr,target,s=2,e=6);
        if(r==-1){
             System.out.print(target+" Number not found  ");    
        }
        else{
         System.out.print(target+" Number found at "+r);
        }
    }
    static int search(int[] arr,int target,int s,int e){
        if(e-s==0){
            System.out.println("Array is empty");
        }
        for(int i=s;i<e;i++){
            if(arr[i]==target){
               return 1;
            }
        }
        return -1;
    } 
}
