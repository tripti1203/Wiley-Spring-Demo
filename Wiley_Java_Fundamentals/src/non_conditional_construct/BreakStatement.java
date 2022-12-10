package non_conditional_construct;

public class BreakStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		while(num < 10) {
			System.out.println(num);
			if(num == 7)
				break;
			num++;
		}
	}

}
