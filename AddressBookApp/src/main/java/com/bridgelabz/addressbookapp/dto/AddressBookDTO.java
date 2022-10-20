package com.bridgelabz.addressbookapp.dto;

public class AddressBookDTO {
    private String firstName;
    private String lastName;
    private String city;
    private String state;
    private int zip;
    private String email;
    private long contact;


    public AddressBookDTO() {
    }

    public AddressBookDTO(long id, String firstName, String lastName, String city, String state,
                       int zip, long contact, String email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;
        this.contact = contact;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }
}
