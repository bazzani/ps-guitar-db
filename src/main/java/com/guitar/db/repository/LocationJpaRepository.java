package com.guitar.db.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guitar.db.model.Location;

@Repository
public interface LocationJpaRepository extends JpaRepository<Location, Long> {
	List<Location> findByStateIgnoreCaseStartingWith(String stateName);
	List<Location> findByStateNotLikeOrderByStateAsc(String stateName);

	Location findFirstByStateIgnoreCaseStartingWith(String stateName);
	List<Location> findTop5ByStateIgnoreCaseStartingWith(String stateName);
	// need to implement Distinct DSL Query
//	List<Location> findDistinctLocationStateByStateIgnoreCaseStartingWith(String stateName);
	
	List<Location> findByStateIsOrCountryEquals(String value, String value2);
	List<Location> findByStateNot(String state);
}
