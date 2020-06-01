package com.example.InneclassDemo;

public class Book {
	
	private String bookName;
	private double cost;
	
	
	public Book(String bookName, double cost) {
		super();
		this.bookName = bookName;
		this.cost = cost;
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", cost=" + cost + "]";
	}
	
	

}
