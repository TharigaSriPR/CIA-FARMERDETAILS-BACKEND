package com.example.FarmerDetails.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.FarmerDetails.Entity.FarmerDetails;
import com.example.FarmerDetails.Service.FarmerService;


@RestController
@CrossOrigin
public class FarmerDetailsController {
 
	@Autowired
	private FarmerService s;
	
	@PostMapping("/farmer")
	public FarmerDetails postFarmer(@RequestBody FarmerDetails farm)
	{
		return s.addFarmer(farm);
	}
	
	@GetMapping("/farmer")
	public List<FarmerDetails> showFarmer()
	{
		List<FarmerDetails> a=new ArrayList<>();
		a=s.getFarmer();
		return a;
	}
	
	@DeleteMapping("/famer/{id}")
	public String delFarmer(@PathVariable("id") int farm_id) {
		s.delFarmer(farm_id);
		return "Susscessfully deleted";
	}

	@PutMapping("/famer/{id}")
	public String updateFarmer(@PathVariable int id, @RequestBody FarmerDetails obj) {
		s.updateFarmer(id, obj);
		return "Susscessfully updated";
	}
	
}
