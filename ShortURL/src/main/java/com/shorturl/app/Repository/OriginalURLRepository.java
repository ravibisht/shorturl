package com.shorturl.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shorturl.app.Model.OriginalURL;

@Repository
public interface OriginalURLRepository extends JpaRepository<OriginalURL, Integer> {

	
}
