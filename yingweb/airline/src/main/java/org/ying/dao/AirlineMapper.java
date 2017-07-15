package org.ying.dao;

import java.util.List;
import org.ying.model.Airline;

public interface AirlineMapper {
    int deleteByPrimaryKey(Long ariid);

    int insert(Airline record);

    Airline selectByPrimaryKey(Long ariid);

    List<Airline> selectAll();

    int updateByPrimaryKey(Airline record);
}