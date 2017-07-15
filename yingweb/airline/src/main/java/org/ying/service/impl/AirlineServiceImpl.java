package org.ying.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.ying.dao.AirlineMapper;
import org.ying.model.Airline;
import org.ying.service.AirlineService;
@Service
public class AirlineServiceImpl implements AirlineService{
	
	@Resource
	AirlineMapper airlineMapper;

	@Override
	public boolean inserairline(Airline airline) {
		return airlineMapper.insert(airline)==1;
	}

	@Override
	public boolean updateAirline(Airline airline) {
		return airlineMapper.updateByPrimaryKey(airline) ==1;
	}

	@Override
	public Airline findAirlineByPk(Long id) {
		return airlineMapper.selectByPrimaryKey(id);
	}
	

}
