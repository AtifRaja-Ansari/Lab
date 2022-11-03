/*Q3.we need to print the elements of the array
 which are present in odd positions.
 This can be accomplished by looping through the array
 and printing the elements of an array by incrementing i by 2 
 till the end of the array is reached.
 */
package Lab;
public class Q3 {
	 public static void main(String[] args) {  
		    
	       int [] arr = new int [] {7,0,0,5,8,4,3,1,1,2,4}; //Initialize array 
	       System.out.println("Elements in the array: ");//printing the elements of the array
			for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");} 
	       System.out.println("\nElements on the odd position are: ");  
	        
	        for (int i = 0; i < arr.length; i = i+2) { //using for loop to locate elements on odd position 
	            System.out.print(arr[i]+" ");  
	        }  
	   }   
}
