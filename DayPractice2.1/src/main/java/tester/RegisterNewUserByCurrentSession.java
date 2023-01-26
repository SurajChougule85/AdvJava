package tester;

import org.hibernate.SessionFactory;

import bol.Role;
import bol.User;
import dal.UserDalImpl;

import static utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;
public class RegisterNewUserByCurrentSession {

	public static void main(String[] args) {

try (SessionFactory sf=getFactory();Scanner sc=new Scanner (System.in)){
	
	UserDalImpl dal=new UserDalImpl();
	
	System.out.println("\"Enter user details :  firstName,  lastName,  email,  password,  confirmPassword,  userRole, regAmount, regDate(yr-mon-day) ");
	
	User newUser=new User(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(),Role.valueOf(sc.next().toUpperCase()),sc.nextDouble(),LocalDate.parse(sc.next()));
	
	System.out.println(dal.saveUserDetailsByGetCurrentSession(newUser));
} catch (Exception e) {
	// TODO: handle exception
}

	}

}
