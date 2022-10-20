package com.bridgelabz.addressbookapp.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressBookDTO {
    private String firstName;
    private String lastName;
    private String city;
    private String state;
    private int zip;
    private String email;
    private long contact;
}
