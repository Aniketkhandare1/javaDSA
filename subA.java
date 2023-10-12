import java.util.*;
public class subA{

    public static void subArray(int nums[]){
        int sum =0;  for(int i=0; i<nums.length; i++){
            int start =i;
             for(int j=i; j<nums.length; j++){
            int end =j;
             for(int k=start; k<=end; k++){
           System.out.print(nums[k]+" " );
          
        
        }
         sum += nums[i];
            System.out.println("total of subArray:" + sum);
            int larger=Integer.MIN_VALUE;
            if(larger< nums[i]){
                larger= nums[i];
            }
            
              System.out.println("largest no subArray:" + larger);
         System.out.println();
        }
         System.out.println();
        }
    }
    public static void main (String args[]){
        int nums[]={2,4,6,8,10};
        subArray(nums);
    }
}
