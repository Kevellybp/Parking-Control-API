package com.api.parkingcontrol.repository;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.parkingcontrol.models.ParkingSpotModel;

@Repository
public interface ParnkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {


}