package fileHandling;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\HP\\Desktop\\Wiley-OOPS Notes\\createnewFile.txt");
		try {
			if(file.createNewFile()) {
				System.out.println("File is created");
			}
			else {
				System.out.println("File already exists in the directory");
			}
		} catch (IOException e) {
			e.getMessage();
		}
	}

}
