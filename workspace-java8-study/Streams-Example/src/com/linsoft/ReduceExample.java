package com.linsoft;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.Optional;
public class ReduceExample {

	public static void main(String[] args) {

		List<Long > num = new ArrayList<>();
		for(long i = 0 ; i<10000000; i++)
		{
			num.add(i);
		}
		
		long start = System.currentTimeMillis();
		Stream<Long> numStream = num.stream();
		 Optional<Long > sum = numStream.reduce( (a,b) -> a+b );
		 System.out.println(sum.get());
		 System.out.println("time taken is"+ (System.currentTimeMillis()-start));
		 
		 
		
		 start = System.currentTimeMillis();
		 numStream = num.stream();
		 long total = numStream.reduce( 0L,(a,b) -> a+b );
		 System.out.println(total);
		 System.out.println("time taken is"+ (System.currentTimeMillis()-start));
		 
		 
		 
		 start = System.currentTimeMillis();
		 Stream<Long> numParallelStream = num.parallelStream();
		 Optional<Long > sumParallel = numParallelStream.reduce( (a,b) -> a+b );
		 System.out.println(sumParallel.get());
		 System.out.println("time taken is"+ (System.currentTimeMillis()-start));
		 
		 start = System.currentTimeMillis();
		 numParallelStream = num.parallelStream();
		 total = numParallelStream.reduce( 0L,(a,b) -> a+b );
		 System.out.println(total);
		 System.out.println("time taken is"+ (System.currentTimeMillis()-start));
	}

}
