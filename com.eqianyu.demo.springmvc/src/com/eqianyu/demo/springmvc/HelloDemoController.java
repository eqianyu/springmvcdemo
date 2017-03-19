package com.eqianyu.demo.springmvc;

@Controller
@RequestMapping("/hello")
public class HelloDemoController {

	@RequestMapping(method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		model.addAttribute("message", "Hello Spring MVC Framework!");
		return "hello";
	}

}
