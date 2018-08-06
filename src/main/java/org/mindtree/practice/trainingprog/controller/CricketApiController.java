package org.mindtree.practice.trainingprog.controller;

import org.mindtree.practice.trainingprog.dao.CricketDataProcess;
import org.mindtree.practice.trainingprog.dto.CricketBeanMain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.swagger.annotations.Api;

@RestController("http://cricapi.com")
@Api(value="CricketApi List Application", description="CricketApi List Get Operation")
public class CricketApiController {

	private String key = "9RkZDDawHEPA1w0QzoU2MgLswp43";
	private String url = "http://cricapi.com/api/fantasySquad?";
	
	@Autowired
	private CricketDataProcess process;
	
	@GetMapping("/api/fantasySquad/{unique_id}")
	public void getCricketSquade(@PathVariable String unique_id) {
		String query = url + "unique_id=" + unique_id + key;
		RestTemplate template = new RestTemplate();
		CricketBeanMain cricketBean = template.getForObject(query, CricketBeanMain.class);
		System.out.println(cricketBean.getCreditsLeft() + "-----------------------------   cricketBean ------------------- ");
		process.createBean(cricketBean);
	}
	
}
