package com.guitar.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guitar.db.model.Location;

public interface LocationJpaRepsoiory extends JpaRepository<Location, Long> {

}
