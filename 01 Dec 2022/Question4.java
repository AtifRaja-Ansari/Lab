package labio;
import java.io.FileInputStream;
import java.io.ByteArrayInputStream;

public class Question4 {
	public static void main(String[] args) {
		try{
			FileInputStream f = new FileInputStream("D:\\testQ4.txt");
			byte arr[]= f.readAllBytes();
			ByteArrayInputStream b = new ByteArrayInputStream(arr);
			int i = 0;
			while((i=b.read())!=-1) {
				System.out.println((char)i);
			}
			f.close();
			b.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
