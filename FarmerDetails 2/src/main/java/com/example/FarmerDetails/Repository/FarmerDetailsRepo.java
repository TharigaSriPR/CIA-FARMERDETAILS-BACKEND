package com.example.FarmerDetails.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FarmerDetails.Entity.FarmerDetails;

public interface FarmerDetailsRepo extends JpaRepository<FarmerDetails,Integer>{

}
