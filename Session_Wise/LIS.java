class Main {
    public static int solve(int curr , int prev , int[] arr){
        if(curr >= 5) return 0 ;
        
        int notTake = solve(curr+1 , prev , arr);
        
        int take = 0 ;
        
        if(prev == -1 || arr[curr] > arr[prev]){
            take = 1 + solve(curr + 1 , curr , arr);
        }
        
        return Math.max(take,notTake);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,5,6};
        
        int currIdx = 0 ;
        int prevIdx = -1;
        
        int ans = solve(currIdx,prevIdx,arr);
        
        System.out.println(ans);
        
    }
}
