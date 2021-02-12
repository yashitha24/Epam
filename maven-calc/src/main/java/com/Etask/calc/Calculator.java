package com.Etask.calc;

import java.util.Scanner;
public class Calculator 
{
  public static int Add(int a,int b)
  {
    return a+b;
  }
public static int Subtract(int a,int b) 
{
  return a-b;
}
public static int Multiply(int a,int b) 
{
  return a*b;
}
public static int Divide(int a,int b) 
{
  
  if(b==0)
  {
    return 00000;
  }
  
  return a/b;
}

  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    int val;
    System.out.println("Enter your choice: \n1.Add\n2.Subtract\n3.Multiply\n4.Divide");
    val = scan.nextInt();
    int a,b;
    System.out.println("Enter 2 numbers\n");

    a = scan.nextInt();
    b = scan.nextInt();
    
    
    if(val==1)
    {
      System.out.println(Add(a,b));
    }
    else if(val==2)
    {
      System.out.println(Subtract(a,b));
    }
    else if(val==3)
    {
      System.out.println(Multiply(a,b));
    }
    else if(val==4)
    {
      System.out.println(Divide(a,b));
    }
    
    scan.close();
    
  }
}
