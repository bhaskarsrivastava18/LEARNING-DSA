import java.util.Scanner;

class target{
          public static void main(String[] args){
             Scanner scn=new Scanner(System.in);
             int[] array={1,2,3,4,5,6};
             int count=0;
             int target=9;
             for(int i=0;i<6;i++){
                for(int j=i;j<6;j++){
                     if(array[i]+array[j]==target){
                                 count+=1;
                      }
                   }
                 }
              if(count !=0){
                        System.out.print("True");
                     }
               else{
                      System.out.print("False");
                   }
             
             }//main closed
} //class closed