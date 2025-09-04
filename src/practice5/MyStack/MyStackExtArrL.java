package practice5.MyStack;

import practice5.GenericStack.GenericStack2;

import java.util.ArrayList;
import java.util.Scanner;

public class MyStackExtArrL extends ArrayList {
    MyStackExtArrL() {
        super();
    }

    MyStackExtArrL(MyStackExtArrL list) {
        super(list);
    }

    public static void main(String[] args) {
        MyStackExtArrL myStack = new MyStackExtArrL();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            myStack.add(sc.next());
        }

        while(!myStack.isEmpty()){
            System.out.println(myStack.removeLast());
        }
    }
}

