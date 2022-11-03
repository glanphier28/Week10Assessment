/**
 * @author gabel - glanphier
 * CIS175 - Fall 2022
 * Nov 3, 2022
 */
package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	@GeneratedValue
	private long id;
	private String title;
	private String author;
	private String genre;
	private int pageCount;
	
	public Book() {
		super();
	}
	
	public Book(String title) {
		super();
		this.title = title;
	}
	
	public Book(String title, String author, String genre, int pageCount) {
		super();
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.pageCount = pageCount;
	}
	
	public Book(int id, String title, String author, String genre, int pageCount) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.pageCount = pageCount;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title +", author=" + author +", genre=" + genre + ", pageCount=" + pageCount + "]";
	}
}
