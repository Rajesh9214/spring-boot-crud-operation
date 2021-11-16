package com.javatpoint.model;

import javax.persistence.*;

@Entity
@Table
public class Books {
	@Id
	@Column
	@GeneratedValue
	private int bookid;
	@Column
	private String bookname;
	@Column
	private String auther;
	@Column
	private int price;

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
