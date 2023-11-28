package day1.learningStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnderstandingStream {
    public static void main(String[] args){
        //to filter out all the even number from the list1
        List<Integer> list1= List.of(1,2,3,4,5,6,7,8);

        //without stream
        List<Integer> evenList1= new ArrayList<>();
        for(int i:list1){
            if(i%2==0){
                evenList1.add(i);
            }
        }
        System.out.println("without Stream:" + evenList1);

        //with stream
        Stream<Integer> stream=list1.stream();
        List<Integer> evenList2= stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("with Stream:" + evenList2);

    }
}
