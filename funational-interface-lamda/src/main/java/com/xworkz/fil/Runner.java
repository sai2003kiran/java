package com.xworkz.fil;

import com.xworkz.fil.interfaces.*;

public class Runner {
    public static void main(String[] args) {
//  1 program
        Substract substract = (x,y)-> {
            System.out.println(x-y);
        };
        substract.doSub(12, 4);

//   2 program
    Business business = ()->{
    System.out.println("the sandwhich business is been impliemented");
    };
    business.DoBusiness();

//  3 program
        Multiplication multiplication = (r,y,k)->{
            double q=r*y*k;
            System.out.println(q);
             return q;
        };
        multiplication.proudct(12.0,12.0,12.0);
//  4 program
        Trainee trainee = (name, Age, course, price, phoneNumber) ->{
            System.out.println(name + Age + course + price + phoneNumber);
        };
        trainee.doRegisteration("mahesh "," 123 "," javaFullStackDevelopment "," 15k "," 9876543210 ");
//  5 program
        GreaterNumber greaterNumber = (a,b,c,d)->{
            if (a>b && a>c) {
                System.out.println(a);
            } else if (b>c && b>d) {
                System.out.println(b);
            } else if (c>d) {
                System.out.println(c);
            }else System.out.println(d);
        };
        greaterNumber.input(12227,344,40,123);
    }
}
