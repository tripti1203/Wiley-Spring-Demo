package fileHandling;
import java.io.*;

public class ReadFileUsingByteStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(InputStream inStream = new FileInputStream("C:\\Users\\HP\\Desktop\\Wiley-OOPS Notes\\CreateNewFileUsingByteStream.txt")){
			try(Reader reader = new InputStreamReader(inStream)){
				int data = reader.read();
				while(data != -1) {
					System.out.print((char)data);
					data = reader.read();
				}
			}catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			}	
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} 
	}

}
