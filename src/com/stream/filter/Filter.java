package com.stream.filter;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.System.out;

public class Filter {
	List<Integer> list;
	Optional<Integer> k;
	Stream<Integer> limit;
	Integer sum=0;
	
	public void filterMethod(List<Integer> integer) {
		out.println("===Filter Method===");
		list=integer.stream().filter(x->x%2==0).collect(Collectors.toList());
		out.println("Filter: "+list);
		
		k=integer.stream().filter(x->x%2==0).findFirst();
		out.println("Find_First with filter: "+k.toString());
		
		k=integer.stream().findFirst();
		out.println("Find_First: "+k);
		
		k=integer.stream().findAny();
		out.println("Find_Any: "+k);
		
		k=integer.stream().filter(x->x%2==1).max(Comparator.comparing(x->x));
		out.println("Find Max with filter: "+k);
		
		k=integer.stream().filter(x->x%2==1).min(Comparator.comparing(x->x));
		out.println("Find Min with filter: "+k);
		
		sum=integer.stream().filter(x->x%2==1).reduce(0,(ans,i)->ans+i);
		out.println("Find Sum with filter: "+sum);		
		
	}

	
}
