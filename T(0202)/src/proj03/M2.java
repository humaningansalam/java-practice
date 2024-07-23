package proj03;

public class M2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] qq = new int[5][5];

		int count = 0;
		int value = 0;
		for(int i=0; i <5; i++) {
			for(int j=0; j<5; j++) {
				qq[i][j] = count + 1;
				count++;
				System.out.print("\t" + qq[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		for(int i=0; i <5; i++) {
			for(int j=0; j<5; j++) {
				if(i == 0 || i==2 || i==4) {
					value = qq[i][j] +value;
				}
				else {
					qq[i][j] = 0;
				}
				System.out.print("\t" + qq[i][j]);
			}
			System.out.println();
		}

		System.out.println();
		System.out.println(value);
	}

}
