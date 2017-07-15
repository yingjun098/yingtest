package org.ying.service;

import org.ying.model.Airline;

public interface AirlineService {
	boolean inserairline(Airline airline);

	boolean updateAirline(Airline airline);

	Airline findAirlineByPk(Long id);
}
