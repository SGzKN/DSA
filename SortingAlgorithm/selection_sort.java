import java.util.*;
public class Main
{
    public static void bubble_sort(int a[]){
        for(int i = 0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if(a[i]>a[j]){
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
    }
        
        
    }
    
	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++){
		    arr[i] = sc.nextInt();
		}
		
		
		
		selection_sort(arr);
		
		//print sorted array
		for(int i=0; i<5; i++){
		    System.out.print(arr[i]+"\t");
		}
		
		
	}
}
