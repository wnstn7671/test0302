package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("명언앱");


        while(true)
        {


            String 명령=null;
            Scanner sc = new Scanner(System.in);
            명령=sc.nextLine();
            if(명령=="종료")
            {
            System.out.println("종료합니다.");
            }
        }
    }
}