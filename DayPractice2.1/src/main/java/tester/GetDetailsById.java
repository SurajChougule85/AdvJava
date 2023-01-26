package tester;

import org.hibernate.SessionFactory;

import bol.User;
import dal.UserDalImpl;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;
public class GetDetailsById {

	public static void main(String[] args) {

try(SessionFactory sf=getFactory();Scanner sc=new Scanner(System.in)) {
	
	UserDalImpl dal=new UserDalImpl();
	System.out.println("Enter user id");
	User userDetails=dal.getUserdetailsById(sc.nextInt());
	System.out.println(userDetails);
} catch (Exception e) {
	// TODO: handle exception
}

	}

}
