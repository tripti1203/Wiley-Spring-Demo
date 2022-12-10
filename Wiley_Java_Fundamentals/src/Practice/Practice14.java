package Practice;

class catchException{
	public static void multipleCatchTest() {
		int arr[] = {10,20,30,40};
		int a = 50;
		int b = 10;
		try {
			try {
				System.out.println(a/b);
				System.out.println("4th ele : " + arr[3]);
				System.out.println("5th ele : " +arr[4]);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e);
			}
			int num = Integer.parseInt("30");
			System.out.println(num);
		}catch(NumberFormatException e) {
			System.out.println(e);
		}
	}
}

public class Practice14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		catchException.multipleCatchTest();
	}

}
