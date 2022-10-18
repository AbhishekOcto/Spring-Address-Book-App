package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.entity.AddressBook;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IAddressBookService {
    ResponseEntity<List<AddressBook>> getAddressBookData();

    ResponseEntity<AddressBook> getAddressBookDataById(int personId);

    ResponseEntity<AddressBook> createAddressBookData(AddressBookDTO addressBookDTO);

    ResponseEntity<AddressBook> updateAddressBookData(int personId, AddressBookDTO addressBookDTO);

    ResponseEntity<String> deleteAddressBookData(int personId);
}
