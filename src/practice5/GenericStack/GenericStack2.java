package practice5.GenericStack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;


public class GenericStack2<E> extends ArrayList<E> {
    GenericStack2() {
        super();
    }

    public GenericStack2(ArrayList<E> arrayList) {
        super(arrayList);
    }

    public GenericStack2(Collection<? extends E> collection) {
        super(collection);
    }

    public void push(E e) {
        add(e);
    }

    public E pop() {
        return removeLast();
    }

    public E peek() {
        return getLast();
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            list.add(sc.next());
        }

        GenericStack2<String> stack2 = new GenericStack2<>(list);

        while (!stack2.isEmpty()) {
            System.out.println(stack2.pop());
        }
    }
}

