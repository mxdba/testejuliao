package com.xpto.cities.service;

import java.nio.file.Path;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

import com.xpto.cities.model.CityModel;
import com.xpto.cities.payload.DefaultResponse;
import com.xpto.cities.repository.CityRepository;

public interface ICityService {

	CityRepository getCityRepository();

	Page<CityModel> list(Map<String, String> filters, Pageable pageable);

	void saveAllCities(List<CityModel> cities);

	List<CityModel> findAll();

	DefaultResponse findCapitals();

	DefaultResponse getNumberCitiesUf();

	DefaultResponse getLargestSmallestUfs();

	DefaultResponse findByIbgeId(Long ibgeId);

	DefaultResponse getCitiesByUf(String uf);

	DefaultResponse saveCity(CityModel city);

	DefaultResponse deleteCity(Long ibgeId);

	DefaultResponse getTotalRecords();

	DefaultResponse getGreaterDistance();

	List<CityModel> getCitiesByFile(MultipartFile file, Path citiesFileLocation);

}
