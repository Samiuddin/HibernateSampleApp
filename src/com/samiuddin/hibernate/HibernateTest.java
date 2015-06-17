package com.samiuddin.hibernate;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.samiuddin.javaee.dto.Address;
import com.samiuddin.javaee.dto.FourWheeler;
import com.samiuddin.javaee.dto.TwoWheeler;
import com.samiuddin.javaee.dto.UserDetails;
import com.samiuddin.javaee.dto.Vehicle;

public class HibernateTest {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Query query = session.createQuery("from UserDetails user where user.userID = 1");
		query.setCacheable(true);
		List users = query.list();
		
		//UserDetails user = (UserDetails) session.get(UserDetails.class, 1);
		//blah blah 
		//user.setUserName("Updated User");
		//UserDetails user2 = (UserDetails) session.get(UserDetails.class, 1);
		
		session.getTransaction().commit();
		session.close();
		//-------------------------------------------------------
		Session session2 = sessionFactory.openSession();
		session2.beginTransaction();
		//UserDetails user2 = (UserDetails) session2.get(UserDetails.class, 1);
		Query query2 = session2.createQuery("from UserDetails user where user.userID = 1");
		query2.setCacheable(true);
		List users2 = query2.list();
		
		session2.getTransaction().commit();
		session2.close();
		//UserDetails user = new UserDetails();
		//user.setUserName("Hello User");//user is now a transient object
		//int minUserId = 5;
		//String minUserId = "5"; 
		//String userName10 = "User 9";
	/*			
		SessionFactory  sessionFactory = new Configuration().configure().buildSessionFactory();//only one SF is created per application
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		//Query query = session.createQuery("from UserDetails");
		//Query query = session.createQuery("select userName from UserDetails where userID > " + minUserId);//SQL Injection can occur
		//Query query = session.createQuery("select userName from UserDetails where userID > :userId and userName = :userName");
		//Query query = session.createQuery("select userName from UserDetails where userID > ? and userName = ?");//it should be a class name, not table name
	//	query.setInteger("userId", Integer.parseInt(minUserId));	//(0, Integer.parseInt(minUserId));
	//	query.setString("userName", userName10);	//(1, userName10);
		//query.setFirstResult(5);
		//query.setMaxResults(4);
//		Query query = session.getNamedQuery("UserDetails.byId");
		//Query query = session.getNamedQuery("UserDetails.byName"); // HQL Query
		//query.setInteger(0, 2);
		//it is like a where clause of SQL
		UserDetails exampleUser = new UserDetails();
		exampleUser.setUserID(5);
		exampleUser.setUserName("User 1%");
		
		//Example example = Example.create(exampleUser).excludeProperty("userName");
		Example example = Example.create(exampleUser).enableLike();
		
		Criteria criteria = session.createCriteria(UserDetails.class)
										.add(example);
		//								.addOrder(Order.desc("userID"));
		//								.setProjection(Projections.count("userID"));
										//.setProjection(Projections.property("userID"))
		//criteria.add(Restrictions.eq("userName", "User 9"))
		//			.add(Restrictions.between("userID", 5, 10));//this does AND between restrictions
		//criteria.add(Restrictions.or(Restrictions.eqOrIsNull("userName", "User 9"), Restrictions.between("userID", 5, 9)));//for OR
		//query.setString(0, "User 8");
		//List <UserDetails> users= (List<UserDetails>) query.list();
		//List <UserDetails> users= (List<UserDetails>) criteria.list();
		//UserDetails user = (UserDetails) session.get(UserDetails.class, 1);
		//session.save(user);
		
		session.save(user);//user object us now a persistent object
		user.setUserName("Updated Hello User");
		user.setUserName("Updated Hello User Again");//hibernate still keeps a track of persistent object
		

		session.getTransaction().commit();
		session.close();//after this object becomes 'detached'
		System.out.println("Number of users: " + users.size());
		
		for (UserDetails u : users) {
			System.out.println(u.getUserName());
		}
		
		user.setUserName("Updated User");
		
		session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(user);
		
		//user.setUserName("updated username");
		
		session.getTransaction().commit();
		session.close();
		
	//	user.setUserName("Updated UserName after close");
		
		for (int i = 0; i < 10; i++) {
			UserDetails user = new UserDetails();
			user.setUserName("User" + i);
			session.save(user);//C in CRUD
		}
		
		UserDetails user = (UserDetails) session.get(UserDetails.class, 5);
		//System.out.println("UserName pulled up is: " + user.getUserName());//R in CRUD
		//session.delete(user);//D in CRUD
		user.setUserName("Updated User");
		session.update(user);//U in CRUD
		*/

		
		//session.save(user);//acts like insert into database command
		//session.persist(user);
		//session.save(vehicle);
		//session.save(bike);
		//session.save(car);
		//session.save(user2);
		//session.save(vehicle);
		//session.save(vehicle2);
		//System.out.println("UserName pulled up is: " + user.getUserName());//R in CRUD
		
		//UserDetails user = new UserDetails();
		//user.setUserID(1);
		//user.setUserName("First User");
		/*
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("car");
		
		//Vehicle vehicle2 = new Vehicle();
	//	vehicle2.setVehicleName("bus");
		
		TwoWheeler bike = new TwoWheeler();
		bike.setVehicleName("Bike");
		bike.setSteeringHandle("steeringHandle");
		
		FourWheeler car = new FourWheeler();
		car.setVehicleName("Porsche");
		car.setSteeringWheel("steeringWheel");
		
		//user.getVehicle().add(vehicle);
		//user.getVehicle().add(vehicle2);
		
		//vehicle.getUserList().add(user);
		//vehicle2.getUserList().add(user);
		//user.setAddress("First User Address");
		//user.setJoinedDate(new Date());
		//user.setDescription("Description of first user");
		
		//UserDetails user2 = new UserDetails();
		//user.setUserID(1);
	//	user2.setUserName("Second User");
		
	Address addr1 = new Address();
		addr1.setStreet("BACDASA");
		addr1.setCity("mycity");
		addr1.setPincode("123456");
		addr1.setState("AR");
		
		//user.setHomeAddress(addr1);
		
		Address addr2 = new Address();
		addr2.setStreet("ASDASAS");
		addr2.setCity("othercity");
		addr2.setPincode("988765");
		addr2.setState("TX");
		
		//user.setOfficeAddress(addr);
		user.getListOfAddresses().add(addr1);
		user.getListOfAddresses().add(addr2);
		
		//to insert
		SessionFactory  sessionFactory = new Configuration().configure().buildSessionFactory();//only one SF is created per application
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		//session.save(user);//acts like insert into database command
		//session.persist(user);
		//session.save(vehicle);
		//session.save(bike);
		//session.save(car);
		//session.save(user2);
		//session.save(vehicle);
		//session.save(vehicle2);
		session.getTransaction().commit();
		session.close();
		
		
		 // to Fetch:
		user = null;
		
		session = sessionFactory.openSession();
		session.beginTransaction();//for insert or select query
		session.get(UserDetails.class, 1);
		user = (UserDetails) session.get(UserDetails.class, 1);
		//System.out.println("Username retreived is: " + user.getUserName());
		session.close();
		System.out.println(user.getListOfAddresses().size());
*/
		
		//sessionFactory.close();
	}

}
