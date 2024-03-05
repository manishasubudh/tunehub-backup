package com.kodnest.tunehub.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.tunehub.entity.User;
import com.kodnest.tunehub.repository.UserRepository;
import com.kodnest.tunehub.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository repository;

	public String addUser(User user) {
		repository.save(user);
		return "User added successfully";
	}


	// to check the duplicate entries
	public boolean emailExists(String email) {
		if (repository.findByEmail(email) != null) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean validateuser(String email, String password) {
		if(emailExists(email)) {

			User user = repository.findByEmail(email);
			String dbpwd = user.getPassword();
			if (password.equals(dbpwd)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	
	@Override
	public String getRole(String email) {
		User user = repository.findByEmail(email);
		return user.getRole();
	}


	@Override
	public User getUser(String email) {
		
		return repository.findByEmail(email);
	}


	@Override
	public void updateUser(User user) {
		repository.save(user);
		
	}


	@Override
	public User geUser(String email) {
		// TODO Auto-generated method stub
		return null;
	}




	

}

