class BubbleSortString{
    public static void buublesort(String arr[]){
        for(int i=0;i<arr.length-1;i++){
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i].compareTo(arr[j])>0){
                    String temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        String arr[] = { "GeeksforGeeks", "Quiz",
        "Practice", "Gblogs", "Coding" };
        buublesort(arr);
        System.out.println("String after sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("String "+i+" "+arr[i]);
        }
    }
}