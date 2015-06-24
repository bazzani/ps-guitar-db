package com.guitar.db.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guitar.db.model.Location;

@Repository
public interface LocationJpaRepsoiory extends JpaRepository<Location, Long> {
	List<Location> findByStateLike(String stateName);
	List<Location> findByStateNotLike(String stateName);
	
	List<Location> findByStateIsOrCountryEquals(String value, String value2);
	List<Location> findByStateNot(String state);
}
