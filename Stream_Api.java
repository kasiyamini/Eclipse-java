package CIET;
import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;
class Stream_Api{
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Amit", "Rahul", "Sneha", "Pallavi", "Raj");
		List<String> result = names.stream()
				.filter(name -> name.length() > 4)
				.map(String::toUpperCase)
				.sorted()
				.collect(Collectors.toList());
		System.out.println(result);
	}
}