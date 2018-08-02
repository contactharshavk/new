/*package org.mindtree.practice.trainingprog.controller;

import org.mindtree.practice.trainingprog.dao.CricketDataProcess;
import org.mindtree.practice.trainingprog.dto.CricketBeanMain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

public class CricketApiController {

	private String key = "9RkZDDawHEPA1w0QzoU2MgLswp43";
	private String url = "http://cricapi.com/api/cricketScore?";
	
	@Autowired
	private CricketDataProcess process;
	
	@GetMapping("/cricketScore/{unique_id}")
	public void method(@PathVariable String unique_id) {
		String query = url + "unique_id=" + unique_id + key;
		RestTemplate template = new RestTemplate();
		CricketBeanMain cricketBean = template.getForObject(query, CricketBeanMain.class);
		System.out.println(cricketBean.getTeam1() + "-----------------------------   cricketBean ------------------- ");
		process.createBean(cricketBean);
	}
	
}
*/