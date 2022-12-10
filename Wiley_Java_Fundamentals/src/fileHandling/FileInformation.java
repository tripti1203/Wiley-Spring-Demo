package fileHandling;

import java.io.File;

public class FileInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\HP\\Desktop\\Wiley-OOPS Notes\\createnewFile.txt");
		if(file.exists()) {
			System.out.println("File Exists");
			System.out.println("File Name : " +  file.getName());
			System.out.println("File Path : " +  file.getAbsolutePath());
			System.out.println("File is writable ? : " +  file.canWrite());
			System.out.println("File is reable ? : " +  file.canRead());
			System.out.println("File length : " +  file.length());
		}
		else {
			System.out.println("File doesn't exists");
		}
	
	}

}
