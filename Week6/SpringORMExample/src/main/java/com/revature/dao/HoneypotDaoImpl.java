package com.revature.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.revature.domain.HoneyPot;

@Service
@Transactional(readOnly=true)
public class HoneypotDaoImpl implements HoneypotDao {

	@Autowired
	private SessionFactory mySessionFactory;
	
	@Transactional(readOnly=false)
	public void saveHoneyPot(HoneyPot hp) {
		mySessionFactory.getCurrentSession().save(hp);
	}

	public List<HoneyPot> getAllHoneyPots() {
		return mySessionFactory.getCurrentSession().createCriteria(HoneyPot.class).list();
	}

	public HoneyPot getHoneyPotById(Integer id) {
		return mySessionFactory.getCurrentSession().get(HoneyPot.class, id);
	}

}
