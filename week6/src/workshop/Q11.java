package workshop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LibraryService {
	private List<String> books = new ArrayList<>();

	public void addBook(String title) {
		books.add(title);
	}

	public List<String> searchBooks(String keyword) {
		List<String> results = new ArrayList<>();
		for (String book : books) {
			if (book.contains(keyword)) {
				results.add(book);
			}
		}
		return results;
	}
}

public class Q11 {
	private LibraryService library;

	@BeforeEach
	void setup() {
		library = new LibraryService();
		library.addBook("Java Book");
		library.addBook("Python Book");
	}

	@Test
	void testAddBook() {
		library.addBook("C++ Book");
	}

	@Test
	void testSearchBooks() {
		List<String> result = library.searchBooks("Java");
		assertEquals(1, result.size());
		assertEquals("Java Book", result.get(0));
	}

	@Test
	void testSearchNoMatch() {
		List<String> result = library.searchBooks("C++");
		assertTrue(result.isEmpty());
	}
}
