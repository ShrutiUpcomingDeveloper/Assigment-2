import java.util.Arrays;
class Quicksort {
  
     void sort(int[]nums,int low, int high){
        if(low>=high){
            return;
        }
        int s=low;
        int e= high;
        int m =s+ (e-s)/2;
        int pivot=nums[m];
        while(s<=e){
            while(nums[s]<pivot){
                s++;
            }
            while(nums[e]>pivot){
                e--;
            }
        
        if(s<=e){
            int temp= nums[s];
            nums[s]= nums[e];
            temp= nums[s];
            s++;
            e--;

        }
    }
    sort(nums,s,high);
    sort(nums,e,low);
    }
    public static void main(String[] args) {
       
        int nums[] = {7, -5, 3, 2, 1, 0, 45};
        Arrays.sort(nums);
        System.out.println("\nThe sorted array is: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }  
        }  
    }