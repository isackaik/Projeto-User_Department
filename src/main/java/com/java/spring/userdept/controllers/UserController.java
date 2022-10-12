package com.java.spring.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.spring.userdept.entities.User;
import com.java.spring.userdept.repositories.UserRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class UserController.
 */
@RestController
@RequestMapping(value = "/users")
public class UserController {

	/** The repository. */
	@Autowired
	UserRepository repository;

	/**
	 * Find all.
	 *
	 * @return the list
	 */
	@GetMapping
	public List<User> findAll() {
		List<User> result = repository.findAll();
		return result;
	}

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the user
	 */
	@GetMapping(value = "/{id}")
	public User findById(@PathVariable Long id) {
		User result = repository.findById(id).get();
		return result;
	}

	/**
	 * Insert.
	 *
	 * @param user the user
	 * @return the user
	 */
	@PostMapping
	public User insert(@RequestBody User user) {
		User result = repository.save(user);
		return result;
	}
}


