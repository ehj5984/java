package com.kopo.project0521;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "main";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String listMethod(Locale locale, Model model) {
//		DBCommon<Student> db = new DBCommon<Student>("c:/tomcat/p500.db", "student");
//		ArrayList<Student> student = db.selectArrayList(new Student());
//		String htmlString = "";
//		for (int i = 0; i < student.size(); i++) {
//			htmlString = htmlString + "<tr>";
//			htmlString = htmlString + "<td>";
//			htmlString = htmlString + student.get(i).idx;
//			htmlString = htmlString + "</td>";
//			htmlString = htmlString + "<td>";
//			htmlString = htmlString + student.get(i).name;
//			htmlString = htmlString + "</td>";
//			htmlString = htmlString + "<td>";
//			htmlString = htmlString + student.get(i).middleScore;
//			htmlString = htmlString + "</td>";
//			htmlString = htmlString + "<td>";
//			htmlString = htmlString + student.get(i).finalScore;
//			htmlString = htmlString + "</td>";
//			htmlString = htmlString + "<td>";
//			htmlString = htmlString + student.get(i).created;
//			htmlString = htmlString + "</td>";
//			htmlString = htmlString + "<td>";
//			htmlString = htmlString + "<a href='update?idx=" + student.get(i).idx + "'>????????????</a>";
//			htmlString = htmlString + "</td>";
//			htmlString = htmlString + "</tr>";
//		}
//		model.addAttribute("list", htmlString);

		UserDB db = new UserDB();
		String htmlString = db.selectData();
		model.addAttribute("list", htmlString);
		return "list";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insertMethod(Locale locale, Model model) {
		return "insert";
	}

	@RequestMapping(value = "/insert_action", method = RequestMethod.GET)
	public String insertAction(Locale locale, Model model, @RequestParam("name") String sName,
			@RequestParam("middleScore") String middleScoreString,
			@RequestParam("finalScore") String finalScoreString) {
//		int middleScore = Integer.parseInt(middleScoreString);
//		int finalScore = Integer.parseInt(finalScoreString);
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		String now = sdf.format(Calendar.getInstance().getTime());
//
//		DBCommon<Student> db = new DBCommon<Student>("c:/tomcat/p500.db", "student");
//		db.insertData(new Student(sName, middleScore, finalScore, now));

		UserDB db = new UserDB();
		double middleScore = Double.parseDouble(middleScoreString);
		double finalScore = Double.parseDouble(finalScoreString);
		db.insertData(sName, middleScore, finalScore);

		model.addAttribute("m1", "???????????? ?????????????????????.");
		return "message";
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String updateMethod(Locale locale, Model model, @RequestParam("idx") int idx) {
//		DBCommon<Student> db = new DBCommon<Student>("c:/tomcat/p500.db", "student");
//		Student selectStudent = db.detailsData(new Student(), idx);

		UserDB db = new UserDB();
		Student selectStudent = db.detailsData(idx);

		if (selectStudent != null) {
			model.addAttribute("idx", selectStudent.idx);
			model.addAttribute("studentName", selectStudent.name);
			model.addAttribute("middleScore", selectStudent.middleScore);
			model.addAttribute("finalScore", selectStudent.finalScore);
		}
		return "update";
	}

	@RequestMapping(value = "/update_action", method = RequestMethod.GET)
	public String updateAction(Locale locale, Model model, @RequestParam("idx") int idx,
			@RequestParam("name") String sName, @RequestParam("middleScore") String middleScoreString,
			@RequestParam("finalScore") String finalScoreString) {
//		int middleScore = Integer.parseInt(middleScoreString);
//		int finalScore = Integer.parseInt(finalScoreString);
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		String now = sdf.format(Calendar.getInstance().getTime());
//
//		DBCommon<Student> db = new DBCommon<Student>("c:/tomcat/p500.db", "student");
//		db.updateData(new Student(idx, sName, middleScore, finalScore, now));

		UserDB db = new UserDB();
		double middleScore = Double.parseDouble(middleScoreString);
		double finalScore = Double.parseDouble(finalScoreString);
		db.updateData(idx, sName, middleScore, finalScore);

		model.addAttribute("m1", "???????????? ?????????????????????.");
		return "message";
	}

	@RequestMapping(value = "/create_table", method = RequestMethod.GET)
	public String createTable(Locale locale, Model model) {
//		DBCommon<Student> db = new DBCommon<Student>("c:/tomcat/p500.db", "student");
//		db.createTable(new Student());
		UserDB db = new UserDB();
		db.createTable();
		model.addAttribute("m1", "???????????? ?????????????????????.");
		return "message";
	}
}
//@Controller
//public class HomeController {
//
//	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
//
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String home(Locale locale, Model model) {
//
//		return "main";
//	}
//
//	@RequestMapping(value = "/insert", method = RequestMethod.GET)
//	public String insertMethod(Locale locale, Model model) {
//
//		return "insert";
//	}
//
//	@RequestMapping(value = "/create_table", method = RequestMethod.GET)
//	public String createTable(Locale locale, Model model) {
//		model.addAttribute("m1", "???????????? ?????????????????????~~");
//		return "message";
//	}
//
//	@RequestMapping(value = "/insert_action", method = RequestMethod.GET)
//	public String insertAction(Locale locale, Model model, @RequestParam("student_name") String sName,
//			@RequestParam("middleScore") String sMiddle, @RequestParam("fianlScore") String sFinal) {
//		int iMiddle = Integer.parseInt(sMiddle);
//		int iFinal = Integer.parseInt(sFinal);
//
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  HH : mm : ss");
//		String now = sdf.format(Calendar.getInstance().getTime());
//
//		DBCommon<Student> db = new DBCommon<Student>("c:/tomcat/p0521.db", "student");
//		db.insertData(new Student(sName, iMiddle, iFinal, now));
//
//		model.addAttribute("m1", "???????????? ?????????????????????~~");
//		return "message";
//	}
//
//	@RequestMapping(value = "/list", method = RequestMethod.GET)
//	public String listMethod(Locale locale, Model model) {
//		DBCommon<Student> db = new DBCommon<Student>("c:/tomcat/p0521.db", "student");
//		ArrayList<Student> student = db.selectArrayList(new Student());
//		String htmlString = "";
//
//		for (int i = 0; i < student.size(); i++) {
//			htmlString = htmlString + "<tr>";
//
//			htmlString = htmlString + "<td>";
//			htmlString = htmlString + student.get(i).idx;
//			htmlString = htmlString + "</td>";
//
//			htmlString = htmlString + "<td>";
//			htmlString = htmlString + student.get(i).name;
//			htmlString = htmlString + "</td>";
//
//			htmlString = htmlString + "<td>";
//			htmlString = htmlString + student.get(i).middleScore;
//			htmlString = htmlString + "</td>";
//
//			htmlString = htmlString + "<td>";
//			htmlString = htmlString + student.get(i).finalScore;
//			htmlString = htmlString + "</td>";
//
//			htmlString = htmlString + "<td>";
//			htmlString = htmlString + student.get(i).created;
//			htmlString = htmlString + "</td>";
//
//			htmlString = htmlString + "</tr>";
//		}
//		model.addAttribute("list", htmlString);
//		return "list";
//	}
//	
//	
//
//	
//
//}
