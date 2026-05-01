class KthLargestinaStream {
    static ArrayList<Integer> kthLargest(int[] arr, int k) {
        // code here
        int n = arr.length;
        
        int[] ans = new int[n];
        int[] a = new int[k];
        
        for(int i = 0; i < k; i++)
        {
            ans[i] = -1;
            a[i] = arr[i];
        }
        Arrays.sort(a);
        
        ans[k-1] = a[0];
        
        /*
        for(int i:a)
            System.out.print(i+", ");
        System.out.println();
        */
        
        for(int i = k; i < n; i++)
        {
            int j, x = arr[i];
            
            //System.out.println("At i = "+i+" x is "+x);
            
            for(j = 0; j < k; j++)
            {
                if(a[j] >= x)
                    break;
            }
            for(int kj = 0; kj < j-1; kj++)
                a[kj] = a[kj+1]; //shifting
            
            /*
            for(int m:a)
                System.out.print(m+", ");
            System.out.println();
            */
            
            if(j > 0)
                a[j-1] = x;
                
            /*
            for(int m:a)
                System.out.print(m+", ");
            System.out.println();
            */
            
            ans[i] = a[0];
        }
        
        ArrayList<Integer> sol = new ArrayList<>();
        for(int i: ans)
            sol.add(i);
            
        return sol;
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 12, 2, 11, 4};
        int k = 3;
        ArrayList<Integer> result = kthLargest(arr, k);
        System.out.println(result); // Output: [-1, -1, 1, 3, 3, 5, 5]
    }
}