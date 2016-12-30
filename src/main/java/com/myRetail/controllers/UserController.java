package com.myRetail.controllers;

import com.myRetail.models.Product;
import com.myRetail.models.User;
import com.myRetail.models.dto.UserActionDto;
import com.myRetail.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@ComponentScan("com.myRetail")
@EnableAutoConfiguration
@RequestMapping("/user")
@RestController
public class UserController {
	@Autowired
	UserRepository userRepo;


	private final Logger log = LoggerFactory.getLogger(UserController.class);




	@RequestMapping(path="/login", method=RequestMethod.POST)
	public ResponseEntity<User>login(@RequestBody long uid, HttpServletRequest request, HttpServletResponse response){
		/*//TODO: again, we shouldnt be creating new users in the login endpoint
		log.trace("In user login endpoint userId={}", uid);
		User user = userService.findUserById(uid);

		if(user != null){
			if(user.getName() == null) {
				String defaultName = "Generic Jerk";
				log.warn("userId={} found without a name.  Setting name to name={}", user.getId(), defaultName);
				user.setName(defaultName);
				userService.save(user);
			}
			userService.login(user);
			return new ResponseEntity<>(user, HttpStatus.OK);

		} else{
			user = new User();
			userService.save(user);
			if(user.getName() == null) {
				String defaultName = "Generic Jell";
				log.warn("New userId={} found without a name.  Setting default to name={}", user.getId(), defaultName);
				user.setName(defaultName);
				userService.save(user);
			}

			userService.login(user);

			log.info("New user being sent: userId={}", user.getId());

			log.trace("test"); //TODO: What purpose does this line serve?  Could it be more descriptive?
			return new ResponseEntity<>(user, HttpStatus.OK);
		}*/
	}

	@RequestMapping(path="/create", method=RequestMethod.POST)
	public ResponseEntity<User> create(String username, String password,
									   int permLevel, String state, int zip, boolean bloodfeast) {
		//TODO: What is the point of having the action field if we are hitting action specific endpoints?
		theReturn = new RequestBody<User>()

		return theReturn;
	}
}

