package com.api.parkingcontrol.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repository.ParnkingSpotRepository;

@Service
public class ParkingSpotService {

	
	@Autowired
	private ParnkingSpotRepository repository;

	@Transactional
	public Object save(ParkingSpotModel parkingSpotModel) {
		
		return repository.save(parkingSpotModel) ;
	}


}
