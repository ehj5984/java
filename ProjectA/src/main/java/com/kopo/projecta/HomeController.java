package com.kopo.projecta;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "main";
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String create(Locale locale, Model model) {
		UserDB userDB = new UserDB();
		boolean isSuccess = userDB.createDB();
		if (isSuccess) {
			model.addAttribute("m1", "테이블이 생성되었습니다.");
		} else {
			model.addAttribute("m1", "DB Error");
		}
		return "message";
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert(Locale locale, Model model) {
		return "insert";
	}
	
	
	@RequestMapping(value = "/insert_action", method = RequestMethod.GET)
	public String insertAction(Locale locale, Model model, 
			@RequestParam("id") String id,
			@RequestParam("pwd") String pwd,
			@RequestParam("name") String name,
			@RequestParam("birthday") String birthday,
			@RequestParam("address") String address) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String now = sdf.format(Calendar.getInstance().getTime());

		People people = new People(id, pwd, name, birthday, address, now, now); 
		UserDB userDB = new UserDB();
		
		boolean isSuccess = userDB.insertDB(people);
		if (isSuccess) {
			model.addAttribute("m1", "데이터가 입력되었습니다.");
		} else {
			model.addAttribute("m1", "DB Error");
		}
		return "message";
		
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String listMethod(Locale locale, Model model) {
		UserDB db = new UserDB();
		String htmlString = db.selectData();
		model.addAttribute("list", htmlString);
		return "list";
	}
}
