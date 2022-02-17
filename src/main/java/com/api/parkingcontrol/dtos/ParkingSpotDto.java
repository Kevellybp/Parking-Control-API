package com.api.parkingcontrol.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class ParkingSpotDto {

	@NotBlank
	private String parkingSpotNumber;

	@NotBlank
	@Size(max = 7)
	private String licensePlateCar;

	@NotBlank
	private String brandCar;

	@NotBlank
	private String modelCar;

	@NotBlank
	private String colorCar;

	@NotBlank
	private String responsibleName;

	@NotBlank
	private String apartament;

	@NotBlank
	private String block;

}
