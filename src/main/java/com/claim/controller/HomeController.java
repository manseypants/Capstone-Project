package com.claim.controller;



import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.claim.entity.Account;
import com.claim.entity.Beer;
import com.claim.entity.CustomerOrder;
import com.claim.entity.Rep;
import com.claim.entity.Tasks;
import com.claim.service.AccountService;
import com.claim.service.BeersService;
import com.claim.service.TaskService;
import com.claim.service.UserService;

import io.micrometer.core.instrument.search.Search;

@Controller//the command to display information to website.
public class HomeController {
	
	@Autowired//link it to the SQL server
	UserService userService;
	@Autowired
	TaskService taskService;
	@Autowired
	AccountService accountService;
	@Autowired
	BeersService beersService;

	@RequestMapping("/userlogin")//the link to the page in the url
	public ModelAndView index() 
	{
		return new ModelAndView("userlogin", "user", new Rep()); //creating a new rep from the user login.	
	}
	
	@RequestMapping("/dashboard")
	public ModelAndView dashboard(HttpSession session) 
	{
		session.setAttribute("accountsList",accountService.getAllAccounts());
		session.setAttribute("taskList",taskService.getAllTasks());
		return new ModelAndView("dashboard");	
	}
	
	@RequestMapping(value="/dashboard", method=RequestMethod.POST)
	public ModelAndView dashboard(@ModelAttribute("user") Rep user, HttpSession session) 
	{
		System.out.println("Login: "+ user);
		Rep rep = userService.loginUser(user);
		if(rep != null)
		{
			session.setAttribute("accountsList",accountService.getAllAccounts());
			session.setAttribute("taskList",taskService.getAllTasks());
			session.setAttribute("loggedInUser", rep);
			return new ModelAndView("dashboard");	
		}
		else 
		{
			return new ModelAndView("userlogin", "user", new Rep());
		}
		
	}
	
	@RequestMapping("/tasks")
	public ModelAndView tasks() 
	{
		return new ModelAndView("tasks", "task", new Tasks());	
	}
	
	@RequestMapping(value="/tasks", method=RequestMethod.POST)
	public ModelAndView task(@ModelAttribute("task") Tasks task,HttpSession session) 
	{
		taskService.saveTask(task);
		session.setAttribute("accountsList",accountService.getAllAccounts());
		session.setAttribute("taskList",taskService.getAllTasks());
		return new ModelAndView("dashboard");
	}
	
	@RequestMapping("/taskDetail")
	public ModelAndView taskDetail(@RequestParam("id") int taskNumber, HttpSession session) 
	{
		Optional<Tasks> task = taskService.getTaskById(taskNumber);
		System.out.println("my task details!!! "+task);
		session.setAttribute("myTask", task.get());
		return new ModelAndView("taskDetail");	
	}
	
	@RequestMapping("/accountDetail")
	public ModelAndView accountDetail(@RequestParam("id") String accountName, HttpSession session) 
	{
		Optional<Account> account = accountService.getTaskByName(accountName);
		session.setAttribute("myAccount", account.get());
		return new ModelAndView("accountDetail");	
	}
	
	@RequestMapping("/register")
	public ModelAndView register() 
	{
		return new ModelAndView("register", "user", new Rep());	
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public ModelAndView register(@ModelAttribute("user") Rep user, HttpSession session) 
	{
		userService.saveUser(user);
		session.setAttribute("loggedInUser", user);
		session.setAttribute("accountsList",accountService.getAllAccounts());
		session.setAttribute("taskList",taskService.getAllTasks());
		return new ModelAndView("dashboard");
	}
	
	@RequestMapping("/account")
	public ModelAndView account() 
	{
		return new ModelAndView("account", "account", new Account());	
	}
	
	@RequestMapping(value="/account", method=RequestMethod.POST)
	public ModelAndView account(@ModelAttribute("account") Account account,HttpSession session) 
	{
		accountService.saveAccount(account);
		session.setAttribute("accountsList",accountService.getAllAccounts());
		session.setAttribute("taskList",taskService.getAllTasks());
		return new ModelAndView("dashboard");
	}
	
	//user login credentials
	//make a select date calendar
	//check the orderSent page

	
	
}
