package com.test;

/**
 * @author DUMBLEDOG
 * @date 2020/7/14 18:40
 */
public class Demo2 {
    public static void main(String[] args) {
        int i=10 ;
        if (i++ == 10) {
            ++i;
            System.out.println("++i ="+i);
        } else {
            --i;
            System.out.println("--i ="+i);
        }
        System.out.println(i);
    }
}
