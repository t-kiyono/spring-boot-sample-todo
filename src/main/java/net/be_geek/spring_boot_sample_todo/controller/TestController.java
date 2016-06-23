package net.be_geek.spring_boot_sample_todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController extends BaseController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index() {
		return new ModelAndView("test/index", null);
	}
}
