package com.revature.main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.revature.entities.Bear;
import com.revature.util.SessionUtil;

public class Driver {

	public static void main(String[] args) {
		/*Session sess = SessionUtil.getSession();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter honeypot ID: ");
		int id = Integer.parseInt(scan.nextLine());
		System.out.println(sess.get(HoneyPot.class, id));
		
		System.out.println("Please enter bear ID: ");
		int bearId = Integer.parseInt(scan.nextLine());
		System.out.println(sess.get(Bear.class, bearId));
		
		System.out.println("Please enter cave ID: ");
		int caveId = Integer.parseInt(scan.nextLine());
		Cave cave = sess.get(Cave.class, caveId);
		System.out.println(cave.getResidents());
		
		sess.close();
		System.out.println(cave);
		*/
		
		//criteriaDemo();
		queryDemo();
	
	}
	
	/* Criteria is used for robust read only selection from your
	 * DB.  Allows you to add restrictions (specify where clause).
	 * Returns values in a List and allows you to make selection on
	 * the Java Objects opposed to SQL columns
	 */
	private static void criteriaDemo(){
		
		/*Session sess = SessionUtil.getSession();
		
		CriteriaQuery<Bear> criteria;
		
		CriteriaBuilder cb = sess.getCriteriaBuilder();
		criteria = cb.createQuery(Bear.class);
		
		Root<Bear> root = criteria.from(Bear.class);
		
		Double targetWeight = new Double(500);
		
		criteria.select(root);
		criteria.where(cb.greaterThanOrEqualTo(root.get("weight"), 500.0));
		
		Query<Bear> bearQuery = sess.createQuery(criteria);
		
		List<Bear> bears = bearQuery.getResultList();
		
		System.out.println(bears);*/
		
		Session sess = SessionUtil.getSession();
		
		Criteria criteria = sess.createCriteria(Bear.class);
		
		List<Bear> bears = criteria.add(Restrictions.ge("weight", 2.0)).list();
	
		
		System.out.println(bears);
		
	}
	
	private static void queryDemo(){
		
		Session sess = SessionUtil.getSession();
		
		//HQL - Hiberanate Query Language
		//Universal Querying Language Hibernate
		//uses to talk with any SQL DB
		
		String hql = "FROM Bear AS b WHERE b.bearBreed = :breed";
		
		Query query = sess.createQuery(hql);
		
		query.setParameter("breed", "football");
		
		List<Bear> bears = query.list();
		
		System.out.println(bears);
		
		//Uses actual SQL, not HQL, do not use unless you have to
		Query query2 = sess.createNativeQuery("SELECT * FROM BEAR"); 
		
		List<Bear> smallBears = sess.createNamedQuery("get_small_bears", Bear.class).getResultList();
		
	}

}
