package harish.projects;

import java.util.Scanner;

public class Main {
static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number....");
      try{  int k= sc.nextInt();
        boolean flag=false;
        if(k==1){
            flag =true;
        }
        for(int i=2;i<k/2;i++){
            if(k%i==0){
                flag=true;
            }
        }
        if(flag==true){
            System.out.println(k+" is not a prime number");
        }else{
            System.out.println(k+" is prime number");
        }

    }catch (Exception hi){
          System.out.println("please enter the correct input value");
      }
    }
    }



