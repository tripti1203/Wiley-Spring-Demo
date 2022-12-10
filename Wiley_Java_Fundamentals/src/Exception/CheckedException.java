package Exception;


import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader file = new FileReader("C:\\Users\\HP\\Desktop\\Wiley-OOPS Notes");
		file.close();
	}

}
