package com.smacrs.newproject;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//import com.smacrs.testproject.db.UserModel;

/**
 * Sample controller for going to the home page with a message
 */
@Controller
public class HomeController {

	// private static final Logger logger =
	// LoggerFactory.getLogger(HomeController.class);

	/**
	 * Selects the home page and populates the model with a message
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		// logger.info("Welcome home!");
		return "home";
	}

	@PersistenceContext
	private EntityManager em;

	@Transactional
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public @ResponseBody String greetingSubmit(@ModelAttribute("UserName") String UserName, @ModelAttribute("UserEmail") String Email,
			@ModelAttribute("UserAdress") String Adress, @ModelAttribute("UserAge") String Age,
			@ModelAttribute("UserSalary") String Salary) {

		UserModel user = new UserModel();
		// user.setUserEmail(Email);
		// user.setUserAdress(Adress);
		// user.setUserAge(Age);
		user.setUserName(UserName);
		// user.setUserSalary(Salary);

		System.out.println(user.getUserAdress());
		System.out.println(user.getUserAge());
		System.out.println(user.getUserID());
		System.out.println(user.getUserName());
		System.out.println(user.getUserSalary());

		em.persist(user);

		return user.toString();
	}

}
