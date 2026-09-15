import java.util.*;
public class q9 {
    public static ArrayList<Integer> cancellation(int arr[],int n,int k){
        ArrayList<Integer> list = new ArrayList<>();
          
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] % k != 0){
                list.add(arr[i]);
            }
          
        }
          return list;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]  arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k =  sc.nextInt();
        System.out.print(cancellation(arr,n,k));
    }

}
