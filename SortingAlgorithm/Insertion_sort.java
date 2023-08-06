
import java.util.*;
class Insertionsort{
    
    public static void insertion_sort(int a[]){
        //(0 index is sorted array at first)from 1 index to last
        for(int i=1;i<5;i++){
            int temp = a[i];
            int j = i-1;
            while(j>=0 && a[j]>temp){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;
            
        }
        
        
    }
    
    public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++){
		    arr[i] = sc.nextInt();
		}
		
		insertion_sort(arr);
		
		//print sorted array
		for(int i=0; i<5; i++){
		    System.out.print(arr[i]+"\t");
		}
		
		
    }
}
