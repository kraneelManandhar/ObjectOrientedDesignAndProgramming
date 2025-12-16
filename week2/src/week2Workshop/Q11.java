package week2Workshop;

interface Readable{
	void read();
}

interface Writable{
	void write();
}

class Book implements Readable,Writable{
	public void read() {
		System.out.println("Read the book");
	}
	public void write() {
		System.out.println("Write the book");
	}
}

public class Q11 {
	public static void main(String[] args) {
		Book bk = new Book();
		bk.read();
		bk.write();
	}
}
