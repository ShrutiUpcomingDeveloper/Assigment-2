import java.util.Scanner;
public class Duplicate{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
            boolean flag = false;
            int N= scn.nextInt();
            int[]arr = new int[N];
            
            for(int k=0; k<N;k++){
                arr[k]= scn.nextInt();
            }
            
            int key=scn.nextInt();
            for(int j=0; j<N;j++){
               if(arr[j]==key){
                   System.out.println("Key found at index" + j);
                   flag= true;
               }
            }
            if(flag==false){
               System.out.println("Key not found");
            }
            }
}