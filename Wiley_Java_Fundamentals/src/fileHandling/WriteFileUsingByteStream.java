package fileHandling;
import java.io.*;

public class WriteFileUsingByteStream {

	public static void main(String[] args) {
		
		try(OutputStream outStream = new FileOutputStream("C:\\Users\\HP\\Desktop\\Wiley-OOPS Notes\\CreateNewFileUsingByteStream.txt")){
			try(Writer writer = new OutputStreamWriter(outStream)){
				writer.write("Hello Everyone!!");
				writer.write(" I am writing content from file handling program using byte stream");
			}catch (IOException e) {
				System.out.println(e.getMessage());
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
