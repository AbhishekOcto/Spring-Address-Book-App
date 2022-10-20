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

/*Lombok is an annotation processor - it has full access to the
generated source tree. While annotation processors usually generate
new source files, Lombok modifies existing Class by adding new fields
or methods.
• Lombok generates the code at Source Time. So .class file will have the
additional compiled code.*/
