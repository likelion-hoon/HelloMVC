package com.sk.mvc;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */

@Controller // �ؿ� Ŭ������ �ڵ����� .xml�� bean���� ������ش�. 
public class HomeController {
	
	// get������� ������ ��û�� ���ؼ��� �����Ѵ�.
	// method���� �����ϸ� get,post ��� �����Ѵ�. 
	@ResponseBody
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest request, Model model) {
	
		model.addAttribute("serverTime", new Date());
		model.addAttribute("item1", "���");
		
		
		String html = ""; 
		html += "id = " + request.getParameter("item1");		// ���������� home.jsp�� �����Ѵ�. 
		return html; 
	}
	
	@ResponseBody
	@RequestMapping(value = "/test.do", method = RequestMethod.GET)
	public String test(@RequestParam(value="id") String id,
			@RequestParam(value="name") String name, 
			@RequestParam(value="age",required=false, defaultValue="30") int age) {
		
		String html = ""; 
		html += "id = " + id + " name=" + name + " age=" + age; // ���������� home.jsp�� �����Ѵ�. 
		return html; 
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/test2.do", method = RequestMethod.GET)
	public String test2(@RequestParam Map<String,String> map) {
		
		String html = "";
		html += "id = "+map.get("id") + "<br>"; 
		html += "name = "+map.get("name") + "<br>"; 
	
		return html; 
	}
	
	@ResponseBody
	@RequestMapping(value = "/test3.do", method = RequestMethod.GET)
	public String test3(Member m) {
		
		String html = "";
		html += "id=" + m.getName(); 
		
		return html; 
	}
	
	@ResponseBody
	@RequestMapping(value = "/test4.do", method = RequestMethod.GET)
	public String test4(Member m, 
						@RequestParam(value="mode",required=false, defaultValue="0") int mode) {
		return mode==1 ? "age="+m.getAge() : "name="+m.getName(); 
	}

	// value�� url���� 
	@RequestMapping(value = "/list.do")
	public String list(Model model) {
	
		model.addAttribute("serverTime", new Date());
		model.addAttribute("item1", "�ٳ���");
		
		// ���������� home.jsp�� �����Ѵ�.(���ϸ�)
		return "home";
	}
	
	@ResponseBody
	@RequestMapping(value = "/body.do", method = RequestMethod.GET)
	public String body(Model model) {
	
		model.addAttribute("serverTime", new Date());
		model.addAttribute("item1", "����");
		
		// ���������� home.jsp�� �����Ѵ�.(���ϸ�)
		return "<h1>Hello</h1>";
	}
	
	@RequestMapping(value = "/member.do", method = RequestMethod.GET)
	public String member(Member m, Model model) {
		
		ArrayList<Member> ml = new ArrayList<Member>(); 
		ml.add(new Member(m.getAge(),m.getName()+"_1"));
		ml.add(new Member(m.getAge(),m.getName()+"_2"));
		model.addAttribute("ml", ml); 
		
		
		return "member";
	}
}
