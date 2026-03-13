import java.util.Arrays ;
public class Main {
    public static void main(String[] args) {
        int[] tokens = new int[]{100};
        int power = 50 ;

        int n = tokens.length ;
        int maxScore = 0 ;

        int i = 0 ;
        int j = n-1 ;

        Arrays.sort(tokens) ;

        while( i <= j ){
            if(tokens[i] <= power){
                power -= tokens[i] ;
                maxScore++ ;
                i++ ;
            }else if(maxScore > 0){
                power += tokens[j] ;
                maxScore-- ;
                j-- ;
            }else{
                break ;
            }
        }
      
        System.out.println(result) ;
    }
}
