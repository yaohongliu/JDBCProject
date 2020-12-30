package eg1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> li = Arrays.asList(12,34,223,56,44,56,77,55,44,22,67);
		
		List<Integer> lieven = new ArrayList<>();
		for(Integer i:li) {
			if(i%2 ==0) {
				lieven.add(i);
			}
		}
		System.out.println("Actually list li: "+li);
		System.out.println("Even list lieven: "+lieven);
		
		List<Integer> lievenStreams1 = li.stream().filter(i->(i%2==0)).collect(Collectors.toList());
		System.out.println("Even List streams: "+lievenStreams1);
		List<Integer> lievenStreams2 = li.stream().filter(i->(i%2==0)).distinct().sorted().collect(Collectors.toList());
		System.out.println("Even List streams: "+lievenStreams2);
		
		
	}

}
