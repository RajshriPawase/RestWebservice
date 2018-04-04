package com.scp.RestProduces;

public class AdharDetails {
	int id;
	String Name;
	String uId;
	Address address;
	public AdharDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdharDetails(int id, String name, String uId, Address address) {
		super();
		this.id = id;
		Name = name;
		this.uId = uId;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "AdharDetails [id=" + id + ", Name=" + Name + ", uId=" + uId + ", address=" + address + "]";
	}
	
}

class Address{
	String street;
	String village;
	String city;
	String state;
	int pincode;
	public Address(String street, String village, String city, String state, int pincode) {
		super();
		this.street = street;
		this.village = village;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", village=" + village + ", city=" + city + ", state=" + state
				+ ", pincode=" + pincode + "]";
	}
	
	
}