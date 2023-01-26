package utils;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	
	public static SessionFactory factory;
	
	static {
		System.out.println("in a static block");
		factory=new Configuration().configure().buildSessionFactory();
		//configure() used for mapping purpose in pom.xml..
	}
	public static SessionFactory getFactory() {
		return factory;
	}

}
