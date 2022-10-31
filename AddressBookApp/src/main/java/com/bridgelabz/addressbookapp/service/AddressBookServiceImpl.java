package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.entity.AddressBook;
import com.bridgelabz.addressbookapp.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookServiceImpl implements IAddressBookService {
    @Autowired
    private AddressBookRepository addressBookRepository;
    List<AddressBook> addressBookList = new ArrayList<>();

    @Override
    public ResponseEntity<List<AddressBook>> getAddressBookData() {
        return new ResponseEntity<>(addressBookRepository.findAll(),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<AddressBook> getAddressBookDataById(long Id) {
        AddressBook addressBook = addressBookRepository.findById(Id).orElse(null);
        return new ResponseEntity<>(addressBook, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<AddressBook> createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBook addressBook = new AddressBook(addressBookDTO);
        addressBookRepository.save(addressBook);
        return new ResponseEntity<>(addressBook, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<AddressBook> updateAddressBookData(long Id, AddressBookDTO addressBookDTO) {
        AddressBook addressBook = addressBookRepository.findById(Id).orElse(null);
        if (addressBook != null){
            addressBook.setFirstName(addressBookDTO.getFirstName());
            addressBook.setLastName(addressBookDTO.getLastName());
            addressBook.setContact(addressBookDTO.getContact());
            addressBook.setCity(addressBook.getCity());
            addressBookRepository.save(addressBook);
        }
        return new ResponseEntity<>(addressBook, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> deleteAddressBookData(long Id) {
        addressBookRepository.deleteById(Id);
        return new ResponseEntity<>("Deleted address book data for id : "+Id, HttpStatus.OK);
    }
}
