package ua.com.alevel.ma12.java.entity;

import java.util.Arrays;

public class Calculator {

  public static void sum2(int a, int b){
      System.out.println(a+b);
  }

  public void minus2(int a, int b){
      System.out.println(a-b);
  }

  public void sum(int ... a){
      System.out.println(Arrays.stream(a).sum());
  }

  public void multiply(int ... a){
      System.out.println(Arrays.stream(a).reduce(1,(b, c)->b*c));
  }

  public void divide(int ... a){
      System.out.println(Arrays.stream(a).reduce((b,c)->b/c));
  }

}
