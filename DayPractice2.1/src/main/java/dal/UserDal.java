package dal;

import java.util.List;

import bol.User;
public interface UserDal {
	
	//add a method to save new user details : using openSession
	String saveUserDetails(User newUser);
	
	// add a method to save new user details : : using getCurrentSession
	String saveUserDetailsByGetCurrentSession(User newUser);
	
	// add a method to get user details by it's id
	User getUserdetailsById(Integer id);
	
	// get list of all users
		List<User> getAllUsers();
}
