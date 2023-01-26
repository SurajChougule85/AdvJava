package tester;
import static utils.HibernateUtils.getFactory;
import org.hibernate.SessionFactory;

import dal.UserDalImpl;

public class GetAllUserDetl {

	public static void main(String[] args) {

try(SessionFactory sf = getFactory()) {
	
	UserDalImpl dal=new UserDalImpl();
	dal.getAllUsers().forEach(System.out::println);
	
} catch (Exception e) {


}

	}

}
