import java.lang.NullPointerException;

public class Lab4{
   public static void main(String[] args){
      int[] a1 = {1,2,3,5,4};
      int[] a2 = {5,4,3,2,1};
      int[] a3 = {3,4,5,2,1};
      int[] a4 = {1,2,3,4,5};
      int[] a5 = {5,5,5,1,3};
      int[] a6 = null; 
      
      int[] b1 = sort(a1);
      int[] b2 = sort(a2);
      int[] b3 = sort(a3);
      int[] b4 = sort(a4);
      int[] b5 = sort(a5);
      int[] b6 = sort(a6);
      
   }
   public static int[] sort(int[] a){
      try{
      
         int curr = 0;
      
         for(int i = 0; i < a.length; i++){
            for(int j = i + 1; j < a.length; j++){
               if(a[j] > a[i]){
                  curr = a[i];
                  a[i] = a[j];
                  a[j] = curr;
               }
            } 
         }
         return a;
      }
      catch(NullPointerException e){
         System.out.println("Null array entered");
      }
      return a;
   }
}
