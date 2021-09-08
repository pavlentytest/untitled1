package ru.samsung.itschool.mdev;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    // Java code style

    public static void main(String[] args) {
  
        for(int i=0;i<10;i++) {
            System.out.println("11111");
        }


        // do {
        //
        // } while(1==1);
       // if(1==1) {
        //
       // }

        int f = 0;
        switch(f) {
            case 0:
                System.out.println(0);
                break;
            case 1:
                System.out.println(1);
                break;
            default:
                System.out.println("");
        }

        Car car = new Car();

        ECar tesla = new ECar();
        tesla.setName("Tesla");

        Moveable moveable = new Moveable() {
            @Override
            public void doMove() {

            }
            @Override
            public void doBeep() {

            }
        };
        moveable.doBeep();
        moveable.doMove();

        Engine engine = new Engine() {
            @Override
            void doSmth() {

            }
        };

        //Scanner scanner = new Scanner(System.in);
       // int aa = scanner.nextInt();

        int[] h = new int[5];
        int[][] j = new int[9][6];

        ArrayList arrayList = new ArrayList();
        arrayList.add("66");
        arrayList.add(66);
        arrayList.add(new Object());

        int gg = (int)arrayList.get(0);
        System.out.println(gg);

        ArrayList<String> list = new ArrayList<>();
        list.add("sdfgadfg");
        //list.add(234234);

        ArrayList<Integer> cc = new ArrayList<>();
        cc.add(2);
        cc.add(333);
        System.out.println(cc.get(0));



    }


}
