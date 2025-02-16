package com.ar.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ar.demo.alien.Alien;

public interface Alienrepo extends JpaRepository<Alien, Integer>{
	List<Alien> findByAlang(String alang);
	List<Alien> findByAidGreaterThan(Integer aid);
	@Query("from Alien where alang=?1 order by aname")
	List<Alien> findByLangSorted(String alang);

}
