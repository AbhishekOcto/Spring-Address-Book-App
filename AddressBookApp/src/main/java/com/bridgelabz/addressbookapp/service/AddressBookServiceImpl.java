package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.entity.AddressBook;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookServiceImpl implements IAddressBookService {
    @Override
    public ResponseEntity<List<AddressBook>> getAddressBookData() {
        List<AddressBook> addressBookList = new ArrayList<>();
        addressBookList.add(new AddressBook(1,"Abhishek","Kumar","7896541235","Muz"));
        addressBookList.add(new AddressBook(2,"Swayam","Prakash","446532","Patna"));
        addressBookList.add(new AddressBook(3,"Avinash","Kumar","78965","Ranchi"));
        addressBookList.add(new AddressBook(4,"Suraj","Singh","44653456","Delhi"));
        return new ResponseEntity<>(addressBookList, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<AddressBook> getAddressBookDataById(int personId) {
        AddressBook addressBook = new AddressBook(personId,"Abhishek","Kumar","7896541235","Muz");
        return new ResponseEntity<>(addressBook, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<AddressBook> createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBook addressBook = new AddressBook(1, addressBookDTO);
        return new ResponseEntity<>(addressBook, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<AddressBook> updateAddressBookData(int personId, AddressBookDTO addressBookDTO) {
        AddressBook addressBook = new AddressBook(personId, addressBookDTO);
        return new ResponseEntity<>(addressBook, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> deleteAddressBookData(int personId) {
        return new ResponseEntity<>("Deleted address book data for id : "+personId, HttpStatus.OK);
    }

}
