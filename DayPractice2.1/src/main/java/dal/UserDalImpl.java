package dal;

import bol.User;
import static utils.HibernateUtils.getFactory;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UserDalImpl implements UserDal {

	@Override
	public String saveUserDetails(User newUser) {
		
		String msg="User register failed!!!!!";
		
		//1.get session from SF
		Session session=getFactory().openSession();
	
		Session session2=getFactory().openSession();
		System.out.println(session==session2);//false..
		
		//open a transaction or begin a transaction...
		Transaction tx=session.beginTransaction();
		System.out.println("is open " + session.isOpen() + " is connected " + session.isConnected());// t t
		
		
		try {
			
			Integer id=(Integer) session.save(newUser);
			tx.commit();
			msg="user regi with id="+id;
			
		} catch (Exception e) {
			if(tx!=null) {
				tx.rollback();
			}
			System.out.println("is open " + session.isOpen() + " is connected " + session.isConnected());
			throw e;
		}
		
		finally {
			if(session!=null) {
				session.close();
			}
		}
		System.out.println("is open " + session.isOpen() + " is connected " + session.isConnected());// f f
		return msg;
	}

	@Override
	public String saveUserDetailsByGetCurrentSession(User newUser) {

		String msg="User register failed!!!!!";
		
		Session session =getFactory().getCurrentSession();
		
		Transaction tx=session.beginTransaction();
		System.out.println("is open " + session.isOpen() + " is connected " + session.isConnected());
		
		try {
			Integer id=(Integer) session.save(newUser);
			tx.commit();
			
			msg = "User regd with ID=" + id;
			System.out.println("is open " + session.isOpen() + " is connected " + session.isConnected());	
			
			
		} catch (Exception e) {
			if(tx!=null) {
				tx.rollback();
				System.out.println("is open " + session.isOpen() + " is connected " + session.isConnected());
				throw e;
			}
		}
		
		return msg;
	}

	@Override
	public User getUserdetailsById(Integer id) {
		
		User user=null;
		
		Session session=getFactory().getCurrentSession();
		
		Transaction tx=session.beginTransaction();
		
		try {
			user=session.get(User.class, id);
			tx.commit();
			
		} catch (Exception e) {
			if(tx!=null) {
				tx.rollback();
				
				throw e;
			}
			
		}
		
		return user;
	}

	@Override
	public List<User> getAllUsers() {
		List<User> users=null;
		
		String jpql="select u from User u";
		
		Session session=getFactory().getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		try {
		users=session.createQuery(jpql, User.class).getResultList();
		tx.commit();
			
			
		} catch (Exception e) {

			if (tx != null)
				tx.rollback();
			throw e;
		}


		return users;
	}

}
