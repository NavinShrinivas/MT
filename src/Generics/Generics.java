package Generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
//        list.add("c");
        list.add(3);
        int sum = 0;
        for(Object o : list){
            sum+=(int)o;
        }

        ExampleClass1 ex1 = new ExampleClass1(2,3);
        ExampleClass2 ex2 = new ExampleClass2(2,3);
        BoundedGeneric bg = new BoundedGeneric(ex1);
//        BoundedGeneric bg = new BoundedGeneric(7); // wont work
        System.out.println(bg.something_nice(ex2));
    }
}
