package streams;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsExample {

	public static void main(String[] args) {
		
		//empty stream
		Stream<String> stream = Stream.empty();
		
		//Printing stream elements
		stream.forEach(element -> {
			System.out.println(element);
		});
		
		System.out.println("-------------------");
		
		//Creating Stream with string elements
		Stream<String> stringStream = Stream.of("King","Kochar","Sarah","Bowling");
		
		//Printing String Stream
		
		stringStream.forEach(ele -> {
			System.out.println(ele);
		});
		
		System.out.println("-------------------");
		
		//Creating stream with integer elements
		Stream<Integer> integerStream = Stream.of(100,200,300,400);
		
		//Printing integer Stream
		integerStream.forEach(ele -> {
			System.out.println(ele);
		});
		
		System.out.println("-----------------------");
		
		Integer[] numArray = new Integer[] {10,20,30,40,50};
		Stream<Integer> arrayStream = Stream.of(numArray);
		arrayStream = Arrays.stream(numArray);
		
		//Printing integer array stream
		
		arrayStream.forEach(ele -> {
			System.out.println(ele);
		});
		
		System.out.println("-----------------------");
		
		//Stream of Collection
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(1000);
		integerList.add(2000);
		integerList.add(3000);
		integerList.add(4000);
		integerList.add(5000);
		Stream<Integer> collectionStream = integerList.stream();
		
		//printing collection stream
		collectionStream.forEach(ele -> {
			System.out.println(ele);
		});
		
		System.out.println("-------------------");
		
		Stream<String> builderStream = Stream.<String>builder().add("King").add("Kochar").add("Sarah").add("Bowling").build();
		
		builderStream.forEach(ele -> {
			System.out.println(ele);
		});
		
		System.out.println("---------------------");
		
		//Range
		IntStream rangeStream = IntStream.range(3, 6);
		rangeStream.forEach(ele -> {
			System.out.println(ele);
		});
	}

}
