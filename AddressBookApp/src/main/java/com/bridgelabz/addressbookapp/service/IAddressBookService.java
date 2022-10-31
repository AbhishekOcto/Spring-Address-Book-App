package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.entity.AddressBook;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IAddressBookService {
    ResponseEntity<List<AddressBook>> getAddressBookData();

    ResponseEntity<AddressBook> getAddressBookDataById(long Id);

    ResponseEntity<AddressBook> createAddressBookData(AddressBookDTO addressBookDTO);

    ResponseEntity<AddressBook> updateAddressBookData(long Id, AddressBookDTO addressBookDTO);

    ResponseEntity<String> deleteAddressBookData(long personId);
}
