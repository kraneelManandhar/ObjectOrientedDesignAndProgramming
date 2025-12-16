package week1;

public class book {
		String title,name;
		int year;
		
		public book(String name,String title, int year){
			this.name = name;
			this.title = title;
			this.year = year;
		}
		
		public String toString() {
	        return "Name: " + name + ", Title: " + title + ", Year: " + year;
	    }
}