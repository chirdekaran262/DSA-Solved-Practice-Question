package GFG160Days.Hash;

import java.util.HashSet;

class LongCon{
    public int longestConsecutive(int[] arr) {
        // code here
        HashSet<Integer> set=new HashSet<>();
        for(int a:arr){
            set.add(a);
        }
        int res=0;
        for(int a:arr){
            if(set.contains(a)&&!set.contains(a-1)){
                int curr=a;
                int cnt=0;
                while(set.contains(curr)){
                    set.remove(curr);
                    curr++;
                    cnt++;
                }
                if(res<cnt){
                res=cnt;
            }
            }
            
        }
        return res;
    }
    public static void main(String[] args) {
        LongCon lc=new LongCon();
        int arr[]={1,2,3,4,5};
        System.out.println(lc.longestConsecutive(arr));
        int arr2[]={1,9,3,10,4,20,2};
        System.out.println(lc.longestConsecutive(arr2));
    }
}