package com.example.NurseryManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.NurseryManagementSystem.model.plantModel;

public interface plantRepository extends JpaRepository<plantModel , String>{

}
