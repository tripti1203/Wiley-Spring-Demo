package fileHandling;

import java.io.*;

public class WriteFileUsingCharacterStream {

	public static void main(String[] args) {
		
		try(Writer writer = new FileWriter("C:\\Users\\HP\\Desktop\\Wiley-OOPS Notes\\CreateNewFileUsingCharacterStream.txt")){
			writer.write("Hello Everyone!!");
			writer.write(" I am writing content from file handling program using character stream");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
