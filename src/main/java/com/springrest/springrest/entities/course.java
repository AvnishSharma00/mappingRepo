package com.springrest.springrest.entities;



import java.util.List;

import org.apache.tomcat.util.http.parser.Authorization;

import com.springrest.springrest.services.CourseService;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="Courses")
public class course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Book_id")
	private long id;
	private String title;
	//@OneToOne(cascade = CascadeType.ALL)
	@OneToMany(mappedBy = "course",cascade = CascadeType.ALL)
	private List<Author>  author;
	
	public long getId() {
		return id;
	}
	public course(long id, String title, List<Author> author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
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
	public List<Author> getAuthor() {
		return author;
	}
	public void setAuthor(List<Author> author) {
		this.author = author;
	}
	public course() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "course [id=" + id + ", title=" + title + ", author=" + author + "]";
	}
	
	
	

}
