package TwoPointer;

public class Equi {
    public static int findEquilibrium(int arr[]) {
        // code here
        int[] pref=new int[arr.length];
        int[] suff=new int[arr.length];
        
        pref[0]=arr[0];
        suff[arr.length-1]=arr[arr.length-1];
        for(int i=1;i<arr.length;i++){
            pref[i]=pref[i-1]+arr[i];
        }
        for(int j=arr.length-2;j>=0;j--){
            suff[j]=suff[j+1]+arr[j];
        }
        for(int i=0;i<arr.length;i++){
            if(suff[i]==pref[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int result = findEquilibrium(arr);
        System.out.println(result); // Output: -1 (no equilibrium index found)
    }
}
