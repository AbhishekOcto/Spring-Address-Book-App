package com.bridgelabz.addressbookapp.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressBookDTO {

    @NotEmpty(message = "First name cannot be null")
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "first name Invalid")
    public String firstName;

    @NotEmpty(message = "Last name cannot be null")
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "last name Invalid")
    public String LastName;

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
