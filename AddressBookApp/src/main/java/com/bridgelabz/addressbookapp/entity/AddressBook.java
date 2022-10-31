package com.bridgelabz.addressbookapp.entity;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "AddBookApp")
@Data
@Getter
@Setter
//@AllArgsConstructor
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

//    public AddressBook(long id, String firstName, String lastName, String city, String state, int zip, String email, long contact) {
//        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.city = city;
//        this.state = state;
//        this.zip = zip;
//        this.email = email;
//        this.contact = contact;
//    }


    public AddressBook(AddressBookDTO addressBookDTO) {
        this.firstName = addressBookDTO.getFirstName();
        this.lastName = addressBookDTO.getLastName();
        this.city = addressBookDTO.getCity();
        this.state = addressBookDTO.getState();
        this.zip = addressBookDTO.getZip();
        this.email = addressBookDTO.getEmail();
        this.contact = addressBookDTO.getContact();

    }
}
