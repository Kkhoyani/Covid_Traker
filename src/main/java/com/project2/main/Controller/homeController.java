package com.project2.main.Controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project2.main.Model.DistrictwiseCase;
import com.project2.main.Model.StatewiseCase;
import com.project2.main.Service.dataService;

@Controller
public class homeController {

	@Autowired
	dataService dataservice;
	
	@RequestMapping("/")
	public ModelAndView homepage()
	{
		ModelAndView mnv = new ModelAndView("home.jsp");
		List<StatewiseCase> list = dataservice.getInfoList();
		mnv.addObject("list", list);
		return mnv;
	}
	
	@RequestMapping("/action")
	public ModelAndView districtPage(@RequestParam("keyword") String keyword)
	{
		ModelAndView mnv = new ModelAndView("district.jsp");
		List<DistrictwiseCase> list = dataservice.getInfoList();
		List<DistrictwiseCase> data = list.
				stream().filter(c -> c.getState().equalsIgnoreCase(keyword)).collect(Collectors.toList());
		mnv.addObject(keyword, keyword);
		mnv.addObject("list", data);
		return mnv;
	}
	
}
