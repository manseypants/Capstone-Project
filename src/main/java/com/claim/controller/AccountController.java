package com.claim.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.claim.entity.Beer;
import com.claim.entity.CustomerOrder;
import com.claim.entity.Rep;
import com.claim.service.AccountService;
import com.claim.service.BeersService;
import com.claim.service.CustomerOrderService;
import com.claim.service.SendMail;

@Controller
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@Autowired
	CustomerOrderService customerOrderService;
	
	@Autowired
	BeersService beerService;
	
	@Autowired
	SendMail sendMail;
	
	@RequestMapping("/orderSent")
	public ModelAndView orderSent(@ModelAttribute("myOrder") CustomerOrder customerOrder, HttpSession session)
	{
		Rep user = (Rep) session.getAttribute("loggedInUser");
		sendMail.sendMail(user.getEmail(), "Order Created", "Dear "+user.getFirstName()
				+ "\n Your order has been created with the following products: \n"+customerOrder.getBeerNames());
		customerOrderService.save(customerOrder);
		return new ModelAndView("orderSent");
	}
	
	@RequestMapping("/beers")
	public ModelAndView beers()
	{
		return new ModelAndView("beers", "beers", new Beer());
	}
	
	@RequestMapping("/order")
	public ModelAndView order(HttpSession session) 
	{
		session.setAttribute("beerList", beerService.getAllBeerNames());
		session.setAttribute("accountNames", accountService.getAllAccountName());
		return new ModelAndView("order", "myOrder", new CustomerOrder());	
	}

}
