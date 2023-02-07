package com.cg.flight.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.flight.app.entity.Flight;
@Repository

public interface IFlightDetailsRepository extends JpaRepository<Flight, Integer>{
}

