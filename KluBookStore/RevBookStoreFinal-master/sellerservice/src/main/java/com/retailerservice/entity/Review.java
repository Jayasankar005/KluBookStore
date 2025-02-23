package com.retailerservice.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Review {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long reviewId;
	
	private String reviewText;
	private int rating;
	
	@ManyToOne
	@JoinColumn(name = "user_user_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "product_product_id")
	private Products product;

	private Long productId;

	private Long userId;

	public long getReviewId() {
		return reviewId;
	}

	public void setReviewId(long reviewId) {
		this.reviewId = reviewId;
	}

	public String getReviewText() {
		return reviewText;
	}

	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Products getProduct() {
		return product;
	}

	public void setProduct(Products product) {
		this.product = product;
	}
	

	public void setProductId(Long productId) {
		// TODO Auto-generated method stub
		this.productId = productId;
		
	}

	public void setUserId(Long userId) {
		// TODO Auto-generated method stub
		this.userId = userId;
		
	}
	
	
	
	
}