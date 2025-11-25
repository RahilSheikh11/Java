package com.spring.jdbctemplate;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class userController {
@Autowired
UserService userService;
@RequestMapping(value="/register", method = RequestMethod.GET)
public ModelAndView ShowRegister(HttpServletRequest request, HttpServletRequest response) {
	ModelAndView mav = new ModelAndView("register");
	mav.addObject("user",new User());
	return mav;
}

@RequestMapping(value="/register", method = RequestMethod.POST)
public String registerUser(@ModelAttribute User user, HttpSession session) {
	userService.register(user);
	session.setAttribute("message", "User Registered successfully");
	return "register";
}

@RequestMapping(value="/showusers", method = RequestMethod.GET)
public ModelAndView showusersdata(HttpServletRequest request, HttpServletResponse response) {
	ModelAndView mav = new ModelAndView("showdata");
	mav.addObject("users",userService.getallusers());
	return mav;
}

@RequestMapping(value = "/edit", method = RequestMethod.GET)
public ModelAndView editusers(@RequestParam("id") int id) {
	ModelAndView mav = new ModelAndView("editusers");
	mav.addObject("editdata",userService.getUserById(id));
	return mav;
}

@RequestMapping(value="/editusers", method = RequestMethod.POST)
public String updateusers(@ModelAttribute User user,HttpSession session) {
	userService.updateuser(user);
	session.setAttribute("message", "Updated successfully");
	return "redirect:/showusers";
}

@RequestMapping(value = "/delete", method = RequestMethod.GET)
public String deleteusers(@RequestParam("id")int id, HttpSession session) {
userService.deleteuser(id);
session.setAttribute("message", "Delete successfully");
return "redirect:/showusers";
}
}
	

