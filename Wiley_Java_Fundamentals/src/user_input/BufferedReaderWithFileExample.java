package user_input;
import java.io.*;
public class BufferedReaderWithFileExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\Wiley-OOPS Notes\\File Handling.txt"));
		int i;
		while((i=reader.read()) != -1) {
			System.out.print((char)i);
		}
		reader.close();
	}

}
