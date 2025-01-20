public class MergeTwoArr {
    public static  void mergeArrays(int a[], int b[]) {
        // code here
        int[] temp=new int[a.length+b.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length&&j<b.length){
            if(a[i]<=b[j]){
                temp[k]=a[i];
                i++;
                k++;
            }
            else{
                temp[k]=b[j];
                j++;
                k++;
            }
        }
        while(i<a.length){
            temp[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length){
            temp[k]=b[j];
            j++;
            k++;
        }
        int m=0;
        for(int l=0;l<temp.length;l++){
            if(l<a.length){
                a[l]=temp[l];
            }
            else{
                b[m]=temp[l];
                m++;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {2, 4, 7, 10};
        int[] b = {2, 3};
        mergeArrays(a,b);
        for(int i:a){
            System.out.println(i+" ");
        }
        for(int i:b){
            System.out.println(i+" ");
        }
    }
}
