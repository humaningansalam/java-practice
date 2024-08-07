package p691;

import java.util.function.*;


public class ConsumerExample {
	public static void main(String[] args) {
		//여기에 코드를 삽입하세요.
		
		Consumer<String> consumer = t -> System.out.println(t + "8");
		consumer.accept("java");
		
		BiConsumer<String, String> bigConsumer =  (t, u) -> System.out.println(t + u);
		bigConsumer.accept("java", "8");
		
		DoubleConsumer doubleConsumer = d -> System.out.println("java" + d);
		doubleConsumer.accept(8.0);
		
		ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t + i);
		objIntConsumer.accept("java", 8);	
		
	}
}
