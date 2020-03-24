package com.stream.basis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.stream.collect.Collect;
import com.stream.filter.Filter;
import com.stream.map.Map;
import com.stream.reduce.Reduce;

import static java.lang.System.out;

public class StreamBasis {

	public static void main(String[] args) {
		out.println("===Main Method===");
		List<Integer> integer=new ArrayList(Arrays.asList(1,2,3,4,5,6));
		out.println(integer);
		
		new Filter().filterMethod(integer);
		
		new Map().mapMethod(integer);
		
		new Collect().collectMethod(integer);
		
		new Reduce().reduceMethod(integer);
	}
}
