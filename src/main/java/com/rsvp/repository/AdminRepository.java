package com.rsvp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.rsvp.entity.Admin;
import com.rsvp.entity.Bidder;
import com.rsvp.entity.Crop;
import com.rsvp.entity.Farmer;

@Repository
public class AdminRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public Admin fetch(String email, String password) {
		Query q= entityManager.createQuery("select a from Admin a where a.adminEmail=:em and a.adminPassword=:pwd");
		q.setParameter("em", email);
		q.setParameter("pwd", password);

		return (Admin) q.getSingleResult();
	}
	
	public List<Farmer> fetchAllFarmer(){
		Query q =entityManager.createQuery("select f from Farmer f");
		List<Farmer> list=q.getResultList();
		return list;
	}
	
	public List<Bidder> fetchAllBidder(){
		Query q =entityManager.createQuery("select b from Bidder b");
		List<Bidder> list=q.getResultList();
		return list;
	}

	public List<Crop> fetchAllUnverifiedFarmer(){
		Query q =entityManager.createQuery("select f from Crop f where f.cropSoldStatus=:vs");
		q.setParameter("vs", "no");
		List<Crop> list=q.getResultList();
		return list;
	}
	
	public List<Bidder> fetchAllUnverifiedBidder(){
		Query q =entityManager.createQuery("select b from Bidder b where b.verificationStatus=:vs");
		q.setParameter("vs", "NO");
		List<Bidder> list=q.getResultList();
		return list;
	}

	public void approvecrop(int CropId) {
		Crop crop=entityManager.find(Crop.class,CropId);
		crop.setCropActiveStatus("yes");
		entityManager.merge(crop);
	}
	
}
