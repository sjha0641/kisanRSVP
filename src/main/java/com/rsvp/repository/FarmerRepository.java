package com.rsvp.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import com.rsvp.entity.Crop;
import com.rsvp.entity.DetailsFarmer;
import com.rsvp.entity.Farmer;
import com.rsvp.entity.Insurance;

@Repository
public class FarmerRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void saveFarmer(Farmer farmer,DetailsFarmer detailsFarmer) {
				farmer.setDetailsFarmer(detailsFarmer); 
				entityManager.persist(farmer);
	}
	
	@Transactional
	public void saveFarmerCrop(Crop crop) {
		entityManager.persist(crop);
	}
	
	@Transactional
	public void applyInsurance(Insurance insurance) {
		entityManager.persist(insurance);
	}
	
	public Farmer login(String email,String password) {
		Query q=entityManager.createQuery("select f from Farmer f where f.email=:em and f.password=:pa");
		q.setParameter("em", email);
		q.setParameter("pa", password);
		return (Farmer) q.getSingleResult();
	}
	
}
