class CheckifanArrayisMaxHeap {
    public boolean isMaxHeap(int[] arr) {
        // code here
        for(int i=arr.length-1;i>=1;i--)
            if(arr[i]>arr[(i-1)/2])
                return false;
        return true;
    }
    public static void main(String[] args) {
        CheckifanArrayisMaxHeap check = new CheckifanArrayisMaxHeap();
        int[] arr = {10, 9, 8, 7, 6};
        System.out.println(check.isMaxHeap(arr)); // Output: true
    }
}