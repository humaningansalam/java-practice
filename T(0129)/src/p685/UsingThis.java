package p685;

public class UsingThis {
	
	public int outterField = 10;

	//여기에 코드를 삽입하세요.
	
	class inner{
		int InnerField = 20;
		
		void method() {
			//람다식
			
			MyFunctionalInterface fi = () -> {
				System.out.println("outterField:" + outterField);
				System.out.println("outterField:" + UsingThis.this.outterField + "\n");
				
				System.out.println("InnerField:" + InnerField);
				System.out.println("InnerField:" + this.InnerField + "\n");
			};
			
			fi.method();
		}
	}
}

