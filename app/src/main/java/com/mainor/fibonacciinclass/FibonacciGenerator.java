package com.mainor.fibonacciinclass;

import java.util.ArrayList;

public class FibonacciGenerator {

    public static ArrayList<Long> getFibonacciNums(int count) {
        long first = 0;
        long second = 1;
        ArrayList<Long> list = new ArrayList<>(count);

        long n1=0,n2=1,n3,i;
        //System.out.print(n1+" "+n2);//printing 0 and 1
        list.add(n1);
        list.add(n2);
        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            list.add(n3);
            n1=n2;
            n2=n3;
        }
        return list;
    }
}
