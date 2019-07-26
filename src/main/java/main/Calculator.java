package main;
import java.util.*; 

public class Calculator {
    public static void main(String[] args)
    {
        System.out.println("Enter first and second number:");
        Scanner inp= new Scanner(System.in);
        int num1,num2;
        num1 = inp.nextInt();
        num2 = inp.nextInt();
        int ans;
        System.out.println("Enter your selection: 1 for Addition, 2 for substraction 3 for Multiplication and 4 for division:");
        int choose;
        choose = inp.nextInt();
        if(choose==1)
            System.out.println(add( num1,num2));
        else if(choose==2)
            System.out.println(sub( num1,num2));  
        else if(choose==3)
            System.out.println(mult( num1,num2));
        else if(choose==4)
            System.out.println(div( num1,num2));
        else
                System.out.println("Illigal Operation");
    }
    public static int add(int x, int y)
    {
//        write your code here 
    	int result=x+y;
    	
        return result;
    }
    public static int sub(int x, int y)
    {
//        write your code here
    	int result=x-y;
        return result;
    }
    public static int mult(int x, int y)
    {
//      write your code here
    	int result=x*y;
    	return result;
    }
    public static int div(int x, int y)
    {
//      write your code here
    	int result=x/y;
    	return result;
    }

}