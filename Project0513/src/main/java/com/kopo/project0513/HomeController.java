package com.kopo.project0513;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);
		model.addAttribute("a1", "안녕하세여");

		return "home";
	}

	@RequestMapping(value = "/page", method = RequestMethod.GET)
	public String page(Locale locale, Model model) {
		return "p1";
	}

	@RequestMapping(value = "/create", method = RequestMethod.GET)  // 테이블 생성 용도
	public String create(Locale locale, Model model) {
		DBCommon<Student> db = new DBCommon<Student>("c:/tomcat/s.db", "student"); // db파일이름과 테이블이름 
		db.createTable(new Student());	// create table 해줘	
		return "p1";
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert(Locale locale, Model model) {
		DBCommon<Student> db = new DBCommon<Student>("c:/tomcat/s.db", "student");
		db.insertData(new Student("나혜진", 30));
		return "p1";
	}
	
}
