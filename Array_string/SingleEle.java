class SingleEle {
      int single(int[] arr) {
        int n = arr.length;
        // solution using XOR
        int xor = 0;
        for(int i = 0; i < n; i++){
            xor ^= arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        SingleEle sol = new SingleEle();
        int[] arr = {2, 3, 5, 4, 5, 3, 4};
        int result = sol.single(arr);
        System.out.println("The single element is: " + result);
    } 
}