class KthElement{
    public static void main(String[] args) {
        int[] a={2, 3, 6, 7, 9};
        int[] b={1, 4, 8, 10};
        int l=5;
        System.out.println("Answer: "+kthElement(a,b,l));
    }
    public static int kthElement(int a[], int b[], int l) {
        // code here
        int[] temp=new int[a.length+b.length];
        int i=0,j=0,k=0;
        while(i<a.length&&j<b.length){
            if(a[i]<b[j]){
                temp[k++]=a[i++];
            }
            else{
                temp[k++]=b[j++];
            }
        }
        while(i<a.length){
            temp[k++]=a[i++];
        }
        while(j<b.length){
            temp[k++]=b[j++];
        }
        return temp[l-1];
    }
}