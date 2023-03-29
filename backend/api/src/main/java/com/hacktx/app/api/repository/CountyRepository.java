package com.hacktx.app.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hacktx.app.api.model.County;

public interface CountyRepository extends JpaRepository<County, Integer> {

	@Query(value = "SELECT * FROM county where county = ?1 and crops is not null AND acres is not null", nativeQuery = true)
	List<County> findByCounty(String county_name);
	
	@Query(value = "SELECT * FROM county where county = ?1 and crops is not null AND sales is not null", nativeQuery = true)
	List<County> findMarketValueByCounty(String county_name);

	@Query(value = "SELECT * FROM county where county = ?1 and crops is not null AND rank_in_state is not null AND rank_in_us is not null", nativeQuery = true)
	List<County> findRankingByCounty(String county_name);

}
