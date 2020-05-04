package com.shorturl.app.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name="original_url")
public class OriginalURL {

	@Id
	@GeneratedValue
	int id;
	
	@Lob
	@Column(columnDefinition ="TEXT" )
	String original_url;
	
	@OneToOne(mappedBy="originalURL",cascade = CascadeType.ALL)
	ShortURLC shorturl;

	
	
	
	
	
	
	@Override
	public String toString() {
		return "OriginalURL [id=" + id + ", original_url=" + original_url + ", shorturl=" + shorturl + "]";
	}

	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOriginal_url() {
		return original_url;
	}

	public void setOriginal_url(String original_url) {
		this.original_url = original_url;
	}

	public ShortURLC getShorturl() {
		return shorturl;
	}

	public void setShorturl(ShortURLC shorturl) {
		this.shorturl = shorturl;
	}
	
	
	
}
