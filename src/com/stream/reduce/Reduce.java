package com.stream.reduce;

import java.util.List;
import java.util.Optional;

import static java.lang.System.out;

public class Reduce {

	Optional<Integer> var;
	public void reduceMethod(List<Integer> integer) {
		out.println("===Reduce Method===");
		var=integer.stream().reduce((x,y)->x+y);
		out.println(var);
		
		var=integer.stream().reduce((x,y)->x>y?x:y);
		out.println(var);
		
		var=integer.stream().reduce((x,y)->x-y);
		out.println(var);
		
	}

}
