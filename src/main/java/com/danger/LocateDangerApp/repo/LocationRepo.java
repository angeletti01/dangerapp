package com.danger.LocateDangerApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.danger.LocateDangerApp.model.Location;

@Repository
public interface LocationRepo extends JpaRepository<Integer,Location> {

}
