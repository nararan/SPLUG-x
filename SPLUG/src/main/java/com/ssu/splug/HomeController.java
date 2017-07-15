package com.ssu.splug;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("client at home", locale);
		
		return "home";
	}
	@RequestMapping(value = "home", method = RequestMethod.GET)
	public String home2(Locale locale, Model model) {
		logger.info("client at home", locale);
		
		return "home";
	}
	
	@RequestMapping(value = "notification", method = RequestMethod.GET)
	public String notification(Locale locale, Model model) {
		logger.info("client at home", locale);
		
		
		return "notification";
	}
	@RequestMapping(value = "recruit", method = RequestMethod.GET)
	public String recruit(Locale locale, Model model) {
		logger.info("client at recruit", locale);
			
		return "recruit";
	}
	@RequestMapping(value = "agora", method = RequestMethod.GET)
	public String agora(Locale locale, Model model) {
		logger.info("client at agora", locale);
		
		
		return "agora";
	}
	@RequestMapping(value = "galary", method = RequestMethod.GET)
	public String galary(Locale locale, Model model) {
		logger.info("client at galary", locale);

		return "galary";
	}
	@RequestMapping(value = "data", method = RequestMethod.GET)
	public String data(Locale locale, Model model) {
		logger.info("client at data", locale);

		
		return "data";
	}
	@RequestMapping(value = "meetingLog", method = RequestMethod.GET)
	public String meetingLog(Locale locale, Model model) {
		logger.info("client at meetingLog", locale);

		return "meetingLog";
	}
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		logger.info("client at login", locale);

		return "login";
	}

	
}
