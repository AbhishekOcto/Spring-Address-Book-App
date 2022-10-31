package com.bridgelabz.addressbookapp.entity;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "AddBookApp")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddressBook {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;
    private String city;
    private String state;
    private int zip;
    private String email;
    private long contact;

//    public AddressBook() {
//    }

//    public AddressBook(long id, String firstName, String lastName, String city, String state,
//                       int zip, long contact, String email) {
//        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.city = city;
//        this.state = state;
//        this.zip = zip;
//        this.email = email;
//        this.contact = contact;
//
//    }

    public AddressBook(AddressBookDTO addressBookDTO){
        this.id = id;
        this.firstName = addressBookDTO.getFirstName();
        this.lastName = addressBookDTO.getLastName();
        this.city = addressBookDTO.getCity();
        this.state = addressBookDTO.getState();
        this.zip = addressBookDTO.getZip();
        this.contact = addressBookDTO.getContact();
        this.email = addressBookDTO.getEmail();
    }

//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public String getState() {
//        return state;
//    }
//
//    public void setState(String state) {
//        this.state = state;
//    }
//
//    public int getZip() {
//        return zip;
//    }
//
//    public void setZip(int zip) {
//        this.zip = zip;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public long getContact() {
//        return contact;
//    }
//
//    public void setContact(long contact) {
//        this.contact = contact;
//    }
}
