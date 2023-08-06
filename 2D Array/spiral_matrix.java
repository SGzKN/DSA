import java.util.*;
class SpiralMatrix {
    
    public static void spiral_matrix(int a[][]){
        int n = a.length;//no. of rows
        int m = a[0].length;//no. of columns
        int sr = 0;//start row
        int er = n-1;//end row
        int sc = 0;//start column
        int ec=m-1;//end column
        while(sc<=ec && sr<=er){
            //print top
            for(int i=sc;i<=ec;i++){
                System.out.print(a[sc][i]+"\t");
            }
            //print right
            for(int i=sr+1;i<=er;i++){
                System.out.print(a[i][ec]+"\t");
            }
            //print bottom
            for(int i=ec-1;i>=sc;i--){
                if(sc==ec){
                    return;
                }
                System.out.print(a[er][i]+"\t");
            }
            //print left
            for(int i=er-1;i>=sr+1;i--){
                if(sr==er){
                    return;
                }
                System.out.print(a[i][sc]+"\t");
            }
            
            sc++;
            ec--;
            sr++;
            er--;

            
        }
        
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
        
        spiral_matrix(arr);

    }
}
