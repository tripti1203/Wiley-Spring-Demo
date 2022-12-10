package fileHandling;
import java.io.*;
public class ReadFileUsingCharacterStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileReader reader = new FileReader("C:\\Users\\HP\\Desktop\\Wiley-OOPS Notes\\CreateNewFileUsingCharacterStream.txt")){
			int data;
			while((data = reader.read())!= -1){
				System.out.print((char) data);
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
