package file_handling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class NioExamples {

	public static void main(String[] args) throws IOException {
		/*
		//Initializing Path Objects
		//Creating Directories Using Path
		Path path1 = Paths.get("E:/File-NIO-Demo");
		//Creating multiple directories
		Path path2 = Paths.get("E:/File-NIO-Demo/Demo1");
		Path path3 = Paths.get("E:/File-NIO-Demo/Demo2");
		
		Path createDir1 = Files.createDirectory(path1);
		Path createDir2 = Files.createDirectory(path2);
		Path createDir3 = Files.createDirectory(path3);
		
		System.out.println("First Dir: " + createDir1);
		System.out.println("Second Dir: " + createDir2);
		System.out.println("Third Dir: " + createDir3);
		*/
		
		//Creating File Using Path
		Path path1 = Paths.get("E:/File-NIO-Demo/Demo1/file1.txt");
		Path path2 = Paths.get("E:/File-NIO-Demo/Demo2/file2.txt");
		/*
		Path createFile1 = Files.createFile(path1);
		Path createFile2 = Files.createFile(path2);
		
		System.out.println("Created File 1 at " + createFile1.getParent() +" : " +createFile1.getFileName() );
		System.out.println("Created File 2 at " + createFile2.getParent() +" : " +createFile2.getFileName() );
		*/
		
		/*
		//Writing in files
		String str1 = "Hello File1";
		byte[] bs1 = str1.getBytes();
		Path writtenFilePath1 = Files.write(path1, bs1);
		System.out.println("Added !!");
		
		String str2 = "Hello File2";
		byte[] bs2 = str2.getBytes();
		Path writtenFilePath2 = Files.write(path2, bs2);
		System.out.println("Added !!");
		*/
		
		//Read files 
		
		System.out.println("Details of Path1 file : " + Files.readAllLines(path1));
		System.out.println("Details of Path2 file : " + Files.readAllLines(path2));
		
		
		//Different methods in Files
		
		System.out.println("Does file2 exists : " + Files.exists(path2));
		System.out.println("Does file1 exists : " + Files.exists(path1));
		//Files.deleteIfExists(path2);
		
		
		//Copy details of file1 to file2
		
		Path path = Files.copy(path1, path2,StandardCopyOption.REPLACE_EXISTING,StandardCopyOption.COPY_ATTRIBUTES);
		System.out.println("Copied Content in file2 : " + Files.readAllLines(path2));
		
	}

}
