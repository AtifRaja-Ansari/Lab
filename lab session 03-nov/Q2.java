/*Q.2   Write a Java program to find the duplicate values
of an array of integer values.
*/
package Lab;
public class Q2 {
	public static void main(String args[]) {
		
		int arr[]= {1,2,3,5,3,4,5};
	
		boolean flag=false;
		for(int j=0;j<arr.length;j++) {
			for(int l=j+1;l<arr.length;l++) {
				if(arr[j]==arr[l]) {
					flag=true;
					System.out.println(arr[j]+" is a duplicate value");
				}
			}
		}
		if(flag==false) {
			System.out.println("No duplicate values in the array.");
		}
	}


}
