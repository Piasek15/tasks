package com.example.exx;

/**
 * Created by Patrick on 06 cze 2018
 */
public class Series {

    public static int nSum(int n){
        if (n >= 0){
            int result = 0;
            for (int i = 0; i <= n; i++){
                result += i;
            }
            return result;
        }
        System.out.println("number must be greater than or equals 0");
        return -1;
    }

    public static int factorial(int n){
        if (n >= 1){
            int result = 1;
            for (int i = 1; i <= n; i++){
                result *= i;
            }
            return result;
        }
        System.out.println("number must be greater than or equals 1");
        return -1;
    }

    public static int fibonacci(int n){
        if (n >= 0){
            if (n == 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else {
                return fibonacci(n-1) + fibonacci(n-2);
            }
        }
        System.out.println("number must be greater than or equals 0");
        return -1;
    }


}
