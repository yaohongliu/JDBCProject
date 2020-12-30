package eg1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> fruits = Arrays.asList("Apple","Banana","Orange","Strawberry","grapes","Mango","kiwi");
		
		List<String> fruitsRes = fruits.stream().filter(f->f.length()>5).map(f->f.toUpperCase()).sorted().collect(Collectors.toList());
		System.out.println("FruitsRes: "+fruitsRes);
		
		System.out.println("Count: "+fruits.stream().filter(f->f.length()>5).map(f->f.toUpperCase()).sorted().count());
		fruits.stream().filter(f->f.length()>5).map(f->f.toUpperCase()).sorted().forEach(x->System.out.println(x));
	}

}
