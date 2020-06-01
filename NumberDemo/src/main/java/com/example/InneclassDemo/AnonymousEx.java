package com.example.InneclassDemo;

import java.util.ArrayList;
import java.util.List;

public class AnonymousEx {

	public static void main(String[] args) {
	List<Book> books = new ArrayList<>();
	Book book =new Book("Java for Beginners",45.0);
	
	//Anonymous Inner class
	
	Library library =new Library() {
		void addBook(Book b){
		books.add(b);
		System.out.print("Book added" + books);
		}
	};
	library.addBook(book);
	}
}
