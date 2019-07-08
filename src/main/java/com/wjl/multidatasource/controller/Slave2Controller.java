package com.wjl.multidatasource.controller;

import com.wjl.multidatasource.model.Slave2;
import com.wjl.multidatasource.service.Slave2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author kevin.wu
 * @date 2019/7/4 16:12
 */
@RestController
@RequestMapping("/slave2")
public class Slave2Controller {

	@Autowired
	private Slave2Service service;

	@GetMapping("list")
	public List<Slave2> list(){
		return service.list();
	}

	@GetMapping("/{id}")
	public Slave2 id(@PathVariable Integer id){
		return service.findById(id);
	}
}
