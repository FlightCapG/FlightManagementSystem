package com.cg.flight.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.flight.app.entity.Passenger;

@Repository
public interface IPassengerRepository extends JpaRepository<Passenger,Integer> {



}

