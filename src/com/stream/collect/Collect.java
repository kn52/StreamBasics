package com.stream.collect;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.lang.System.out;

public class Collect {

	List<Integer> list;
	String s=null;
	
	Optional<Integer> k;
	List<Integer> st;
	Double d;
	
	public void collectMethod(List<Integer> integer) {
		out.println("===Collect Method===");
		list=integer.stream().filter(x->x%2==0).collect(Collectors.toList());
		out.println("To List: "+list);
		
		s=integer.stream().collect(StringBuilder::new,(x,y)->x.append(y),(a,b)->a.append(",").append(b)).toString();
		out.println("Collect with sequential stream: "+s);
		
		s=integer.parallelStream().collect(StringBuilder::new,(x,y)->x.append(y),(a,b)->a.append(",").append(b)).toString();
		out.println("Collect with parallel stream: "+s);
		
		d=integer.stream().collect(Collectors.averagingDouble(x->x));
		out.println("Averaging Double: "+d);
		
		d=integer.stream().collect(Collectors.averagingInt(x->x));
		out.println("Averaging Int: "+d);
		
		d=integer.stream().collect(Collectors.averagingLong(x->x));
		out.println("Averaging Long: "+d);
		
		Long count=integer.stream().collect(Collectors.counting());
		out.println("Counting: "+count);
		
		list=integer.stream().collect(Collectors.filtering(x->x%1==0, Collectors.toList()));
		out.println("Filtering: "+list);
		
		String s=integer.stream().map(String::valueOf).collect(Collectors.joining());
		out.println("Joining: "+s);
		
		s=integer.stream().map(String::valueOf).collect(Collectors.joining(","));
		out.println("Joining with comma: "+s);
		
		s=integer.stream().map(String::valueOf).collect(Collectors.joining(",", "A", "Z"));
		out.println("Joining: "+s);
		
		list=integer.stream().collect(Collectors.mapping(x->x*x, Collectors.toList()));
		out.println("Mapping: "+list);
		
		Integer max=integer.stream().collect(Collectors.maxBy(Comparator.comparing(x->Integer.parseInt(String.valueOf(x))))).get();
		out.println("Maxby: "+max);
		
		Integer min=integer.stream().collect(Collectors.minBy(Comparator.comparing(x->Integer.parseInt(String.valueOf(x))))).get();
		out.println("Minby: "+min);
		
	}
}
