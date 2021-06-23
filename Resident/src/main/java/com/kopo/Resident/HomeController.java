package com.kopo.Resident;

import java.io.UnsupportedEncodingException;
import java.lang.System.Logger;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	private static final Logger logger = (Logger) LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "main";
	}

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String create(Locale locale, Model model) {
		residentDB resident = new residentDB();
		resident.creatdDB();
		boolean isSuccess = resident.creatdDB();
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

	@RequestMapping(value = "/insert_action", method = RequestMethod.POST)
	public String insertAction(HttpServletRequest request, Locale locale, Model model) {
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String gender = request.getParameter("gender");

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String now = sdf.format(Calendar.getInstance().getTime());
		Resident resident = new Resident(name, age, gender, now, now);

		residentDB db = new residentDB();
		boolean isSuccess = db.insertDb(resident);
		if (isSuccess) {
			model.addAttribute("m1", "posting complete");
		} else {
			model.addAttribute("m1", "posting error");
		}
		return "message";
	}

	@RequestMapping(value = "/allList", method = RequestMethod.GET)
	public String selectData(Locale locale, Model model) {

		residentDB db = new residentDB();
		String htmlString = db.selectData();
		model.addAttribute("list", htmlString);
		return "list";
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String updateMethod(Locale locale, Model model, @RequestParam("name") String name) {
		return "update";
	}

	@RequestMapping(value = "/update_action", method = RequestMethod.GET)
	public String updateAction(Locale locale, Model model, @RequestParam("name") String name,
			@RequestParam("age") String age, @RequestParam("gender") String gender, @RequestParam("idx") int idx) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String now = sdf.format(Calendar.getInstance().getTime());
		residentDB resident = new residentDB();

		boolean isSuccess = resident.updateData(name, age, gender, now, idx);
		if (isSuccess) {
			model.addAttribute("m1", "데이터가 수정되었습니다.");
		} else {
			model.addAttribute("m1", "데이터 수정에 실패하였습니다.");
		}
		return "message";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deleteData(Locale locale, Model model, @RequestParam("idx") int idx) {

		residentDB db = new residentDB();
		boolean isSuccess = db.deleteData(idx);
		if (isSuccess) {
			model.addAttribute("m1", "데이터가 삭제되었습니다.");
		} else {
			model.addAttribute("m1", "데이터 삭제에 실패하였습니다.");
		}
		return "message";
	}

}
