package com.shorturl.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shorturl.app.Model.ShortURLC;

@Repository
public interface ShortURLRepository extends JpaRepository<ShortURLC, Integer>{

	public ShortURLC findByUrlAlias(String alias);
}
