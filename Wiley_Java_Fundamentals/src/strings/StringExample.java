package strings;


class StringManipulation{
	public static void stringConcat(String str) {
		str += "Fundamentals";
	}
	public static void stringBufferConcat(StringBuffer str) {
		str.append("Fundamentals Using Buffer");
	}
	public static void stringBuilderConcat(StringBuilder str) {
		str.append("Fundamentals Using Builder");
	}
}

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Java";
		StringManipulation.stringConcat(str1);
		System.out.println(str1);
		
		StringBuffer str2 = new StringBuffer("Java ");
		StringManipulation.stringBufferConcat(str2);
		System.out.println(str2);
		
		StringBuilder str3 = new StringBuilder("Java ");
		StringManipulation.stringBuilderConcat(str3);
		System.out.println(str3);
	}

}
