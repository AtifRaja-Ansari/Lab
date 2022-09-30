/*1… Write the following code:
 	A class named Arithmetic with a method named add that takes integers as 
parameters and returns an integer denoting their sum.

A class named Adder that inherits from a superclass named Arithmetic*/



package Lab;
//class Arithmetic with method name add
class Arithmetic{
    int add(int a, int b)
    {
         return(a+b);
    }
}
class Adder extends Arithmetic{//Adder class
    
}
public class HandsOn3{
    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();   
        
        System.out.print(a.add(10,3) + "\n" + a.add(10,10) + "\n");
     }
}
