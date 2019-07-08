package com.wjl.multidatasource.controller;

import com.wjl.multidatasource.model.Master;
import com.wjl.multidatasource.service.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author kevin.wu
 * @date 2019/7/4 16:12
 */
@RestController
@RequestMapping("/master")
public class MasterController {

	@Autowired
	private MasterService service;

	@GetMapping("list")
	public List<Master> list(){
		return service.list();
	}

	@GetMapping("/{id}")
	public Master id(@PathVariable Integer id){
		return service.findById(id);
	}

	@PostMapping("/update")
	public void update(Integer id ,String name){
		service.update(name,id);
	}
}
