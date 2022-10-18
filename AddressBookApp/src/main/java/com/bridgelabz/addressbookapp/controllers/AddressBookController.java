package com.bridgelabz.addressbookapp.controllers;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.entity.AddressBook;
import com.bridgelabz.addressbookapp.service.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressBook")
public class AddressBookController {
    @Autowired
    private IAddressBookService addressBookService;
    @GetMapping(value = {"", "/", "/get"})
    public ResponseEntity<List<AddressBook>> getAddressBookData() {
        return addressBookService.getAddressBookData();
    }

    @GetMapping("/get/{personId}")
    public ResponseEntity<AddressBook> getAddressBookData(@PathVariable("personId") int personId) {
        return addressBookService.getAddressBookDataById(personId);
    }

    @PostMapping("/create")
    public ResponseEntity<AddressBook> addAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
        return addressBookService.createAddressBookData(addressBookDTO);
    }

    @PutMapping("/update/{personId}")
    public ResponseEntity<AddressBook> updateAddressBookData(@PathVariable("personId") int personId,
                                                             @RequestBody AddressBookDTO addressBookDTO) {
        return addressBookService.updateAddressBookData(personId,addressBookDTO);
    }

    @DeleteMapping("/delete/{personId}")
    public ResponseEntity<String> deleteAddressBookData(@PathVariable("personId") int personId) {
        return addressBookService.deleteAddressBookData(personId);
    }
}
