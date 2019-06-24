package com.lec.spring_dto;

public class BDto {
    String Id;
    String Country;
    String Name;
    String Street1;
    String Street2;
    String City;
    String State;
    String Zipcode;
    String Phone;

    public BDto(String id, String country, String name, String street1, String street2, String city, String state, String zipcode, String phone) {
        Id = id;
        Country = country;
        Name = name;
        Street1 = street1;
        Street2 = street2;
        City = city;
        State = state;
        Zipcode = zipcode;
        Phone = phone;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getStreet1() {
        return Street1;
    }

    public void setStreet1(String street1) {
        Street1 = street1;
    }

    public String getStreet2() {
        return Street2;
    }

    public void setStreet2(String street2) {
        Street2 = street2;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getZipcode() {
        return Zipcode;
    }

    public void setZipcode(String zipcode) {
        Zipcode = zipcode;
    }

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}
}
