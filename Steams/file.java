package Steams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class file{
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3,4,5,6,7);
        Consumer<Integer> con = n -> System.out.println(n); 
        // li.forEach(con);
        // for(int i:li){
        //     System.out.println(li.get(i) + "HI");
        // }
        // // System.out.println(li);
        

        // for(int i:li){
        //     if(i%2==0){
        //          i=i*2;
        //          System.out.println("even" +i);
        //         //  System
        //     }
        //     else{
        //        System.out.println("ODD");
        //     }

        // }
        Stream<Integer> s1 = li.stream();
        // Stream<Integer> s2 = s1.filter(n->n%2!=0);
        // s2.forEach(n -> System.out.println(n));
        Stream <Integer> s3 = s1.map(a-> a*3);
        
        
        // s3.forEach(a ->System.out.println(a));
        // int result = s3.reduce(2,(c,e)->c+e);
        // // System.out.println(result);
       
       


        // int results = li.stream()
        // // Predicate<Integer> p = n -> n%2==0;
        // // li.stream().filter(p).forEach(con);
        //     // .filter(n -> n%2!=0)
        //     // Function<Integer,Integer> fun = n -> n*2;
        //     // li.stream().map(fun).forEach(con);
        //     .map(n -> n*3)
        //     // BinaryOperator<Integer> b = (c,e) -> c+e;
        //     // System.out.println(li.stream().reduce(b));
        //     .reduce(2,(c,e)->c+e);
        
        // System.out.println(results);
        Stream<Integer> sortedValues = li.stream()
        .filter(n -> n%2!=0)
        .map(n -> n*3)
        .sorted();
            sortedValues.forEach(con);


        
    }
}
