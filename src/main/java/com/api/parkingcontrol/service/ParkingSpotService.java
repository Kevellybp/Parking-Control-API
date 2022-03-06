package com.api.parkingcontrol.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repository.ParnkingSpotRepository;

@Service
public class ParkingSpotService {

	@Autowired
	private ParnkingSpotRepository repository;



	public boolean existsByLicensePlateCar(String licensePlateCar) {

		return repository.existsByLicensePlateCar(licensePlateCar);
	}

	public boolean existsByParkingSpotNumber(String parkingSpotNumber) {

		return repository.existsByParkingSpotNumber(parkingSpotNumber);
	}

	public boolean existsByApartamentAndBlock(String apartament, String block) {

		return repository.existsByApartamentAndBlock(apartament, block);
	}

	public List<ParkingSpotModel> findAll (){
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public Optional<ParkingSpotModel> findById(UUID id) {
		
		return repository.findById(id);
	}

	@Transactional
	public void delete(ParkingSpotModel parkingSpotModel) {
		repository.delete(parkingSpotModel);
		
	}

	public Object save(ParkingSpotModel parkingSpotModel) {
		// TODO Auto-generated method stub
		return repository.save(parkingSpotModel);
	}

}
