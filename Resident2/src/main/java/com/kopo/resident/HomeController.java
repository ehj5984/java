package com.kopo.resident;
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
			@RequestParam("name") String name,
			@RequestParam("age") String age,
			@RequestParam("gender") String gender
			) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String now = sdf.format(Calendar.getInstance().getTime());

		People people = new People(name, age, gender, now, now); 
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
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deleteData(Locale locale, Model model, @RequestParam("idx") int idx) {

		UserDB db = new UserDB();
		boolean isSuccess = db.deleteData(idx);
		if (isSuccess) {
			model.addAttribute("m1", "데이터가 삭제되었습니다.");
		} else {
			model.addAttribute("m1", "데이터 삭제에 실패하였습니다.");
		}
		return "message";
	}

}
