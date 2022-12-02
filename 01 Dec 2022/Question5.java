package labio;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class Question5 {
	public static void main(String args[]) {
		try {
			FileInputStream f=new FileInputStream("D:\\labtest.txt");
			BufferedInputStream b=new BufferedInputStream(f);
			LineNumberReader reader = new LineNumberReader(new InputStreamReader (b));
			String i;
			while(((i=reader.readLine())!=null)&&reader.getLineNumber()<=3) {
				System.out.println(i);
			}
			f.close();
			b.close();
			}catch(Exception e) {
				System.out.println(e);
			}
	}
}