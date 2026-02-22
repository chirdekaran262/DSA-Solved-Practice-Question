public class MejPro {
    public static void main(String[] args) {
        int[] arr = { 44, 21, 21, 5, 5, 5, 5, 5, 5, 5, 5, 5, 2, 2, 6, 8, 9, 4, 9, 10, 8, 5 };
        int ans = mejEle(arr);
        System.out.print("Mejority Element " + ans);
    }

    public static int mejEle(int[] arr) {
        int count = 0;
        int candidate = -1;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                candidate = arr[i];
            }
            count += (arr[i] == candidate) ? 1 : -1;
        }
        return candidate;
    }

}
