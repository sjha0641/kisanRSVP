package com.rsvp.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.rsvp.entity.Bidder;

@Repository
public class BidderRepository {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public Bidder addBidder(Bidder bidder) {
		
		return entityManager.merge(bidder);
	}
}
