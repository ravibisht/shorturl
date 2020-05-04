package com.shorturl.app.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;



@Entity
@Table(name="short_URL")
@Component
public class ShortURLC {

	@Id
	@GeneratedValue
	int id;
	
	@Column(unique = true,name="url_alias")
	String urlAlias;
	
	@OneToOne(cascade = CascadeType.ALL)
	OriginalURL originalURL=new OriginalURL();

	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "ShortURLC [id=" + id + ", urlAlias=" + urlAlias + ", originalURL=" + originalURL + "]";
	}
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getUrlAlias() {
		return urlAlias;
	}




	public void setUrlAlias(String urlAlias) {
		this.urlAlias = urlAlias;
	}




	public OriginalURL getOriginalURL() {
		return originalURL;
	}

	public void setOriginalURL(OriginalURL originalURL) {
		this.originalURL = originalURL;
	}
	
	
	
	
	
}
