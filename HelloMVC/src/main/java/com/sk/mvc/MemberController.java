package com.sk.mvc;

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

/**
 * Handles requests for the application home page.
 */

@Controller // 밑에 클래스를 자동으로 .xml의 bean으로 만들어준다. 
public class MemberController {
	
	@RequestMapping(value = "/member1.do", method = RequestMethod.GET)
	public String member1(HttpServletRequest request, Model model) {

		return "member1";
	}
}
