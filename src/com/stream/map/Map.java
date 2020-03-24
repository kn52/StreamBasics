package com.stream.map;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.lang.System.out;

public class Map {
	List<Integer> list;
	Optional<Integer> k;
	Stream<Integer> limit;
	Integer sum=0;
	
	public void mapMethod(List<Integer> integer) {
		out.println("===Map Method===");
		list=integer.stream().map(x->x*x).collect(Collectors.toList());
		out.println(list);
		
		list=integer.subList(2, 5);
		out.println(list);
	}

}
