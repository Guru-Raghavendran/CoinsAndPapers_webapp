package com.niit.model;

import javax.persistence.OneToOne;

public class Customer {

	
	private int id;
	private String firstname;
	private String lastname;
	private String phonenumber;
	
	@OneToOne
	private User user;
	@OneToOne
	private BillingAddress billingaddress;
	@OneToOne
	private ShippingAddress shippingaddress;
	@OneToOne
	private Cart cart; // Foreign key cart_id
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public BillingAddress getBillingaddress() {
		return billingaddress;
	}
	public void setBillingaddress(BillingAddress billingaddress) {
		this.billingaddress = billingaddress;
	}
	public ShippingAddress getShippingaddress() {
		return shippingaddress;
	}
	public void setShippingaddress(ShippingAddress shippingaddress) {
		this.shippingaddress = shippingaddress;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
}
