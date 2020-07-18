package com.test;

import java.util.Scanner;

/**
 * @author DUMBLEDOG
 * @date 2020/7/14 17:51
 */
public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字:");
        int num = 0;
        try {
            num = scanner.nextInt();
        } catch (Exception e) {

            System.out.println("输入含有非数字字符！");
            return;
        }
        String str1 = Integer.toString(num);
        int len = str1.length();
        for(int i = len-1;i>=0;i-- ){

            if(str1.charAt(i)>'9'||str1.charAt(i)<'0'){
                System.out.println("str1.charAt(i)="+str1.charAt(i));
                System.out.println("含有非法字符！");
                return;
            }
        }

        int t = 0;
        String str = "";
        if(num>0){
            while (num!=0){
                t = num%10;
                str=str+t;
                num/=10;
            }
        }
        int result = Integer.parseInt(str);
        System.out.println(result);
    }
}
