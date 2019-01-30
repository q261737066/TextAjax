package com.text.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.text.bean.Text;
import com.text.dao.TextDao;



@Controller
public class TextController {
	@RequestMapping(value="/all")
  public String queryAll(Model model) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		TextDao tdao=(TextDao) context.getBean("textdao");
		List<Text> textList=new ArrayList<Text>();
		textList=tdao.queryAll();
		model.addAttribute("texts",textList);
		return "text";


  }
}
