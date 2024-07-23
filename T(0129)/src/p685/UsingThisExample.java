package p685;

public class UsingThisExample {
	public static void main(String... args) {
		UsingThis usingThis = new UsingThis();
		UsingThis.inner inner = usingThis.new inner();
		inner.method();
	}
}

