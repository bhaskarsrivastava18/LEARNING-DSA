import java.util.Scanner;

class armstrong{
      public static void main(String[] args){
                    Scanner scn=new Scanner(System.in);
                    int rem=0;
                    int x=scn.nextInt();
                    int temp2=x;
                    while(x !=0){
                           int temp=x%10;  
                           rem=rem+(temp*temp*temp);
                           x=x/10;
                          }
                     if(rem==temp2){
                         System.out.print("Its an armstrong Number");
                           } 
                    scn.close();
                  }
}