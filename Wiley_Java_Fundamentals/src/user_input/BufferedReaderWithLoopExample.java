package user_input;
import java.io.*;
public class BufferedReaderWithLoopExample {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String message = "";
		while(!message.equals("stop")) {
			System.out.print("Enter your Message : ");
			message = reader.readLine();
			System.out.println(message);
		}
		reader.close();
	}

}
