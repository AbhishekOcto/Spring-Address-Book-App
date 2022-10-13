package com.bridgelabz.addressbookapp.dto;

public class AddressBookDTO {
    private int personId;
    private String name;

    public AddressBookDTO(int personId, String name) {
        this.personId = personId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "AddressBookDTO{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                '}';
    }
}
