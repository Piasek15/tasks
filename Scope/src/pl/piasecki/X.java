package pl.piasecki;

import java.util.Scanner;

/**
 * Created by Patrick on 07 cze 2018
 */
public class X {
    private int x;

    public X() {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a number: ");
        this.x = x.nextInt();
    }

    public void x(){
        for (int x = 1; x<=12; x++){
            System.out.println(x + " * " + this.x + " = " + x*this.x);
        }
    }
}
