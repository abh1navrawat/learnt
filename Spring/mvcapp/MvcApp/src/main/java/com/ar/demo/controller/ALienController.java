package com.ar.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.ar.demo.alien.Alien;
import com.ar.demo.dao.Alienrepo;

@RestController
public class ALienController {
	
	@Autowired
	Alienrepo repo;
	
	@RequestMapping("/")
	public String Home() {
		System.out.println(repo.findByAlang("Bihari"));
		System.out.println(repo.findByAidGreaterThan(103));
		System.out.println(repo.findByLangSorted("Bihari"));
		
		System.out.println("1112");
		
		return "home.jsp";
	}
//	@PostMapping("/addAlien")
//	public Alien addAlien(@RequestBody Alien alien) {
//		repo.save(alien);
//		return alien;
//	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		repo.save(alien);
		return "home.jsp";
	}
	
	@DeleteMapping("/delAlien")
	public Alien delAlien(@RequestBody Alien alien) {
		repo.delete(alien);
		return alien;
	}
//	@RequestMapping("/getAlien")
//	public ModelAndView getAlien(@RequestParam Integer aid) {
//		ModelAndView mv = new ModelAndView("getAlien.jsp");
//		Alien alien = repo.findById(aid).orElse(new Alien());
//		
//		mv.addObject(alien);
//		return mv;
//	}
	@RequestMapping("/alien/{aid}")
	@ResponseBody
	public Optional<Alien> getAlien(@PathVariable("aid") Integer aid) {
		return repo.findById(aid);
	}
	
	@RequestMapping("/getAliens")
	public List<Alien> Aliens() {
		return repo.findAll();
	}
}
