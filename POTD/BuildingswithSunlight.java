class BuildingswithSunlight {
    public int visibleBuildings(int arr[]) {
        // code here
        int n=arr.length;
        int max=arr[0];
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(max<=arr[i]){
                count++;
            }
            max=Math.max(max,arr[i]);
        }
        return count;
    }
    public static void main(String[] args) {
        BuildingswithSunlight bs=new BuildingswithSunlight();
        int[] arr = {3, 5, 4, 4, 3, 1, 3, 2};
        System.out.println(bs.visibleBuildings(arr)); // 4
    }
}