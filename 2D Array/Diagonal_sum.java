
import java.util.*;
class Diagonal_sum {
    
    public static int diagonal_sum(int a[][] ){
        int n = a.length;//no. of rows
        int m = a[0].length;//no. of columns
        int sum = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if((i==j) || (i+j == n-1)){
                    sum += a[i][j];
                }
            }
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //input no. of rows and columns
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();
        
        int arr[][] = new int [n][m];

        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        //print matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.print("\n");
        }
        
        int s = diagonal_sum(arr);
        System.out.println("The sum of all diagonal element is "+s);
        
    }

}
