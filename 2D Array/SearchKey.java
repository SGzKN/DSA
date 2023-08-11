import java.util.*;
class SearchKey {
    
    public static boolean search_key(int a[][],int key){
        int n = a.length;//no. of rows
        int m = a[0].length;//no. of columns
        int row=0,col=m-1;
        while(row<n && col>=0){
            if(key == a[row][col]){
                System.out.println("The element "+key+" is in index ("+row+","+col+")");
                return true;
            }else if(key < a[row][col]){
                col--;
            }else{
                row++;
            } 
            
        }
        System.out.println("The element"+key+" is not found.");
        return false;
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
        
        System.out.print("Enter key to search: ");
        int k = sc.nextInt();
        
        search_key(arr,k);

    }
}
