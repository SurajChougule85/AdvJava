package tester;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import bol.Role;
import bol.User;
import dal.UserDal;
import dal.UserDalImpl;

import static utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

public class RegisterNewUser {

	public static void main(String[] args) {
		
		try(SessionFactory sf=getFactory();Scanner sc=new Scanner(System.in)){
			
			UserDalImpl userDal=new UserDalImpl();
			System.out.println(
					"Enter user details :  firstName,  lastName,  email,  password,  confirmPassword,  userRole, regAmount, regDate(yr-mon-day) ");
		
		User user =new User(sc.next(), sc.next(), sc.next(), sc.next(),sc.next(), Role.valueOf(sc.next().toUpperCase()),sc.nextDouble(), LocalDate.parse(sc.next()));
		
		//	PUT USER DETAILS IN USERDAL SAVEUSER METHOD...
		System.out.println(userDal.saveUserDetails(user));
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
