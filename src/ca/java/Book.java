package ca.java;

/*
 * 
 * Create a class called Book that stores the information for each of the books in a library.
The class should keep the title of the book, author, number of copies of the book and number of lend copies. 
The class will contain the following methods: Default constructor. Constructor with parameters. Setters / getters. 
Method Loan that increases the corresponding attribute each time a loan is made from the book. 
No books may be borrowed if no copies are available to lend. 
Returns true if the operation was successful and false otherwise. 
Returns method that decrements the corresponding attribute when a book is returned. 
No books can be returned that have not been lend. Returns true if the operation was successful and false otherwise. 
ToString method to display data from books. 
This method is inherited from Object and we must modify it (override) to adapt it to the Book class. 
Write a program to test the operation of the Book class.
 */

public class Book {
	
	private String title;
	private String author;
	private int countOfCopies;
	private int countOfLendCopies;
	
	public Book()
	{
		
	}
	
	public Book(String title, String author, int countOfCopies, int countOfLendCopies) {
		super();
		this.title = title;
		this.author = author;
		this.countOfCopies = countOfCopies;
		this.countOfLendCopies = countOfLendCopies;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getCountOfCopies() {
		return countOfCopies;
	}

	public void setCountOfCopies(int countOfCopies) {
		this.countOfCopies = countOfCopies;
	}

	public int getCountOfLendCopies() {
		return countOfLendCopies;
	}

	public void setCountOfLendCopies(int countOfLendCopies) {
		this.countOfLendCopies = countOfLendCopies;
	}
	
	public boolean loanBook()
	{
		boolean isSuccessful = false;
		if(countOfLendCopies < countOfCopies )
		{
			this.countOfLendCopies++;
			isSuccessful = true;
		}
		else
		{
			System.out.println("No more copies to lend");
		}
		return isSuccessful;
	}
	
	public boolean returnBook()
	{
		boolean isSuccessful = false;
		if(countOfLendCopies > 0 )
		{
			this.countOfLendCopies--;
			isSuccessful = true;
		}
		else
		{
			System.out.println("No more copies to collect");
		}
		return isSuccessful;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", countOfCopies=" + countOfCopies
				+ ", countOfLendCopies=" + countOfLendCopies + "]";
	}
	
	

}
