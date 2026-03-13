import java.util.Arrays ;
public class Main {
    public int threeTimes(int[] arr){
        int n = arr.length ;
        int ones = 0 ;
        int twos = 0 ;

        for(int i = 0 ; i < n ; i++){
            ones = (ones ^ arr[i]) & ~twos ;
            twos = (twos ^ arr[i]) & ~ones ;
        }

        return ones ;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2,2,3,2} ;
        Main main = new Main() ;
        int result = main.threeTimes(arr) ;
        
        System.out.println(result) ;
    }
}
