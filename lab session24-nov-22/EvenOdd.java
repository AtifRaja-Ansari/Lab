package Lab;
//Problem1
class first extends Thread{
	public void run() {

		for(int i=1;i<=20;i++)
			if(i%2==0)
			System.out.print(i+", ");
		System.out.println();
}}
public class EvenOdd extends Thread{
	public void run() {
		for(int i=1;i<=20;i++)
			if(i%2!=0)
			System.out.print(i+", ");
	}
	public static void main(String[] args) {
		first f=new first()	;
		EvenOdd l=new EvenOdd();
		System.out.println("Even nos from 1-20=");
		f.start();
		try {
			f.sleep(1000);
			f.join();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Odd nos from 1-20: ");
		l.start();
}}