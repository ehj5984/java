package com.kopo.project0527;

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

import com.kopo.project0527.UserDB;
import com.kopo.project0527.Personnel;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "main";
	}



	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insertMethod(Locale locale, Model model) {
		return "insert";
	}

	@RequestMapping(value = "/insert_action", method = RequestMethod.GET)
	public String insertAction(Locale locale, Model model, @RequestParam("name") String sName,
			@RequestParam("gender") String sGender, @RequestParam("address") String sAddress,
			@RequestParam("depart") String sDepart) {

		UserDB db = new UserDB();
		db.insertData(sName, sGender, sAddress, sDepart);

		model.addAttribute("m1", "데이터가 입력되었습니다.");
		return "message";
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String updateMethod(Locale locale, Model model, @RequestParam("idx") int idx) {

		UserDB db = new UserDB();
		Personnel selectPersonnel = db.detailsData(idx);

		if (selectPersonnel != null) {
			model.addAttribute("idx", selectPersonnel.idx);
			model.addAttribute("name", selectPersonnel.name);
			model.addAttribute("gender", selectPersonnel.gender);
			model.addAttribute("address", selectPersonnel.address);
			model.addAttribute("depart", selectPersonnel.depart);
		}
		return "update";
	}

	@RequestMapping(value = "/update_action", method = RequestMethod.GET)
	public String updateAction(Locale locale, Model model, @RequestParam("idx") int idx,
			@RequestParam("name") String sName, @RequestParam("gender") String sGender,
			@RequestParam("address") String sAddress, @RequestParam("depart") String sDepart) {

		UserDB db = new UserDB();
		db.updateData(idx, sName, sGender, sAddress, sDepart);

		model.addAttribute("m1", "데이터가 수정되었습니다.");
		return "message";
	}

	@RequestMapping(value = "/create_table", method = RequestMethod.GET)
	public String createTable(Locale locale, Model model) {

		UserDB db = new UserDB();
		db.createTable();
		model.addAttribute("m1", "테이블이 생성되었습니다.");
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
