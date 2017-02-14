package com.project.moviestore.model;
import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "dummy", catalog = "sakila")
@XmlRootElement
public class Dummy {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int a;
	
	public Dummy(){}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	
}
