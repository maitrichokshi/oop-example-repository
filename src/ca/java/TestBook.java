package ca.java;

public class TestBook {

	public static void main(String[] args) {

		Book[] myLibrary = new Book[5];
		
		myLibrary[0] = new Book("Basic Java", "ABC", 5, 0);
		
		System.out.println(myLibrary[0]);
		myLibrary[0].loanBook();
		
		
		
		
		System.out.println(myLibrary[0]);
		myLibrary[0].loanBook();
		System.out.println(myLibrary[0]);
		myLibrary[0].loanBook();
		System.out.println(myLibrary[0]);
		myLibrary[0].loanBook();
		System.out.println(myLibrary[0]);
		myLibrary[0].loanBook();
		System.out.println(myLibrary[0]);
		myLibrary[0].loanBook();
		System.out.println(myLibrary[0]);
		
		myLibrary[0].returnBook();
		System.out.println(myLibrary[0]);
		
	}

}
