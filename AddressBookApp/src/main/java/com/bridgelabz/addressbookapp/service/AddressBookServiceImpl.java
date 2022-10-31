package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.entity.AddressBook;
import com.bridgelabz.addressbookapp.exceptions.AddressBookException;
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

    /*This method will show all the data entries at a time*/
    @Override
    public ResponseEntity<List<AddressBook>> getAddressBookData() {
        return new ResponseEntity<>(addressBookRepository.findAll(),HttpStatus.OK);
    }

    /*This method will take id as argument and print the respective data*/
    @Override
    public ResponseEntity<AddressBook> getAddressBookDataById(long id) {
        AddressBook addressBook = addressBookRepository.findById(id).orElseThrow(() -> new AddressBookException("Contact not found with id : "+id));;
        return new ResponseEntity<>(addressBook, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<AddressBook> createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBook addressBook = new AddressBook(addressBookDTO);
        addressBookRepository.save(addressBook);
        return new ResponseEntity<>(addressBook, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<AddressBook> updateAddressBookData(long id, AddressBookDTO addressBookDTO) {
        AddressBook addressBook = addressBookRepository.findById(id).orElseThrow(() -> new AddressBookException("Contact not found with id : "+id));
        if (addressBook != null){
            addressBook.setFirstName(addressBookDTO.getFirstName());
            addressBook.setLastName(addressBookDTO.getLastName());
            addressBook.setCity(addressBook.getCity());
            addressBook.setState(addressBook.getState());
            addressBook.setEmail(addressBook.getEmail());
            addressBook.setContact(addressBookDTO.getContact());

            addressBookRepository.save(addressBook);
        }
        return new ResponseEntity<>(addressBook, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> deleteAddressBookData(long id) {
        addressBookRepository.deleteById(id);
        return new ResponseEntity<>("Deleted address book data for id : "+id, HttpStatus.OK);
    }
}
