package com.Jc.Series;

/**
 * Created by priyaranjanjc on  ${date}.
 */
public class Series {
    private String hello;

    public Series() {

    };

    public static int nSum(int n){
        int sum =0;
        for ( int i = 0;i<n;i++){
            sum += i;
        }
        return sum;
    }

    public static long factorial(int n){
        long prod = 1L;
        for(int i =1;i<n;i++){
            prod = prod*i;
        }
        return prod;
    }

    public static int fibonacci(int n){
        int a =0;
        int b =1;
        int fib = 0;
        if(n == 1)
            return 1;
        for(int i=1;i<n;i++){
            fib = a +b;
            a =b;
            b=fib;
        }
        return fib;
    }
}
