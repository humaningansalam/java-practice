package p685;

public class UsingThis {
	
	public int outterField = 10;

	//���⿡ �ڵ带 �����ϼ���.
	
	class inner{
		int InnerField = 20;
		
		void method() {
			//���ٽ�
			
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

