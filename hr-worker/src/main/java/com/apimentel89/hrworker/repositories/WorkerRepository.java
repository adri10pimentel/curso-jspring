package com.apimentel89.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apimentel89.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
