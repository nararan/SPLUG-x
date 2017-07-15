package com.ssu.splug;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@RequestMapping(value = "write", method = RequestMethod.GET)
	public String write(Locale locale, Model model, @RequestParam("where") String where) {
		
		logger.info("client write at "+where, locale);
		
		if(where.equals("agora")){
			where="<자유게시판> ";
		}
		else if (where.equals("notification")){
			where="<공지사항> ";
		}
		
		model.addAttribute("where" , where);

		return "/write/write";
	}
	
	@RequestMapping(value = "writeContent", method = RequestMethod.POST)
	 public ModelAndView writeContetent(HttpServletRequest httpServletRequest) {	
	   
	          
	        String title = httpServletRequest.getParameter("title");
	        String contents = httpServletRequest.getParameter("contents");

	        
	        ModelAndView view = new ModelAndView();
	        view.setViewName("write/testView");
	        view.addObject("title", title);
	        view.addObject("contents", contents);


		return view;
	}
	
}
