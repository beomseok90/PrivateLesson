package org.pl.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 메인 페이지 컨트롤러
 */
@Controller
public class HomeController {
	
	private Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * 메인 화면
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		return "main/home";
	}
	
}
