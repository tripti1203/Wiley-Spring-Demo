package non_conditional_construct;

public class LabelledBreakStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//first:
		for(int i=0 ; i<5 ; i++) {
			second:
			for(int j=0 ; j<3 ; j++) {
				System.out.println("i = " + i +" and j = " + j + "\t");
				if(i==3)
					break second;
			}
			System.out.println();
		}
	}

}
