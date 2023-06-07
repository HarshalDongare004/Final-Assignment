import java.util.*;
import java.util.stream.*;


public class sortAndFilter {
public static void main(String[] args) {

ArrayList<Integer> al = new ArrayList<Integer>();
al.add(10);
al.add(20);
al.add(0);
al.add(5);
al.add(25);
al.add(15);
System.out.println(al);
//sorted list
List<Integer> result = al.stream().sorted().collect(Collectors.toList());
System.out.println(result);

//unsorted and filtered list
List<Integer> streamList=al.stream().sorted().filter(i-> i%2==0).collect(Collectors.toList());
System.out.println(streamList);

//sorted and filtered array
List<Integer> streamListUnsorted=al.stream().filter(i-> i%2==0).collect(Collectors.toList());
System.out.println(streamListUnsorted);
}
}
