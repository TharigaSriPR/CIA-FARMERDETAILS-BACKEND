package com.example.FarmerDetails.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.FarmerDetails.Entity.FarmerDetails;
import com.example.FarmerDetails.Repository.FarmerDetailsRepo;

@Service
public class FarmerService {
	@Autowired
	private FarmerDetailsRepo r;
	
	//add(post)
	public FarmerDetails addFarmer(FarmerDetails obj)
	{
		return r.save(obj);
	}
	
    //get(show)
	public List<FarmerDetails> getFarmer()
	{
		List<FarmerDetails> a=new ArrayList<>();
		a=r.findAll();
		return a;
	}
	
	//update
	public FarmerDetails updateFarmer(int id,FarmerDetails obj)
	{
		return r.saveAndFlush(obj);
	}
	
	//delete
	public void delFarmer(int farmer_id)
	{
		r.deleteById(farmer_id);
	}
}
