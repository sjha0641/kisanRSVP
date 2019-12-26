package com.rsvp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rsvp.entity.Admin;
import com.rsvp.entity.BidDetails;
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

	public List<Crop> fetchAllUnverifiedCrop(){
		Query q =entityManager.createQuery("select f from Crop f where f.cropActiveStatus=:vs");
		q.setParameter("vs", "no");
		List<Crop> list=q.getResultList();
		return list;
	}

	public List<Crop> fetchAllApprovedCrop(){
		Query q =entityManager.createQuery("select f from Crop f where f.cropActiveStatus=:vs");
		q.setParameter("vs", "yes");
		List<Crop> list=q.getResultList();
		return list;
	}
	
	public List<BidDetails> fetchAllBidding(){
		Query q =entityManager.createQuery("select b from BidDetails b where b.bidStatus=:bs");
		q.setParameter("bs", "active");
		List<BidDetails> list=q.getResultList();
		return list;
	}
	
	
	@Transactional
	public void approveCrop(int CropId) {
		Crop crop=entityManager.find(Crop.class,CropId);
		crop.setCropActiveStatus("yes");
		entityManager.merge(crop);
	}
	
	@Transactional
	public void deleteFarmer(int farmerId) {
		Farmer farmer=entityManager.find(Farmer.class,farmerId);
		entityManager.remove(farmer);
	}
	
}
