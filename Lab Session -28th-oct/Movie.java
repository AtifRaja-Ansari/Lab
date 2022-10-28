/*
 * Movie Theater Management System, where you can create two classes one is main another one is movie, 
movie class can have two methods setMovie,getMovie where you can create movieName,movieStartTime,movieEndTime,
MovieTicketPrice as instance variables

 */ package Lab;
 

class Movie {
	//instance variables
	 String movieName;
	 String movieStartTime,movieEndTime;
	 int MovieTicketPrice;
//using setter method
	public void set_moviename(String m){
		movieName=m;
	}
	public void set_moviestarttime(String m){
		movieStartTime=m;
	}
	public void set_movieendtime(String m){
		movieEndTime=m;
	}
	public void set_movieticketprice(int m){
		MovieTicketPrice=m;
	}
	
	//using getter method
	public String get_moviename(){
		return movieName;
	}
	public String get_moviestarttime(){
		return movieStartTime;
	}
	public String get_movieendtime(){
		return movieEndTime;
	}
	public int get_movieticketprice(){
		return MovieTicketPrice;
	}
	
	
}
class MainMovie {//main movie

	public static void main(String[] args) {
	

		Movie obj=new Movie( );
		
		obj.set_moviename("IP Man");
		
		obj.set_moviestarttime("08:00 Pm");
		
		obj.set_movieendtime("09:45 Pm");
		
		obj.set_movieticketprice(150);
		
		//printing outputs
		System.out.println("Movie Name: "+obj.get_moviename());
		System.out.println("Movie Start Time: "+obj.get_moviestarttime());
		System.out.println("Movie End Time: "+obj.get_movieendtime());
		System.out.println("Movie Price Ticket: "+obj.get_movieticketprice());
		
	}

}