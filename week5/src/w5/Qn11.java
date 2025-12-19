package w5;

class Library {
	Book[] books;

	Library(Book[] books) {
		this.books = books;
	}
}

class Book {
	String title;

	Book(String title) {
		this.title = title;
	}

	void show() {
		System.out.println(title);
	}
}

public class Qn11 {
	public static void main(String[] args) {

		Book b1 = new Book("Java");
		Book b2 = new Book("Python");

		Book[] bookList = { b1, b2 };

		Library lib = new Library(bookList);

		lib = null;

		b1.show();
		b2.show();
	}
}