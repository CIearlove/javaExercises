package Chapter22;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class staticMethodsInListAndCollection {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("red","green","blue");
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
	}

}
