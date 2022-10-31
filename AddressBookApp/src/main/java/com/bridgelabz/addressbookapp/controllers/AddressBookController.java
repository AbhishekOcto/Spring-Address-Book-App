package com.bridgelabz.addressbookapp.controllers;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.entity.AddressBook;
import com.bridgelabz.addressbookapp.service.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @GetMapping("/get/{id}")
    public ResponseEntity<AddressBook> getAddressBookData(@PathVariable("id") long id) {
        return addressBookService.getAddressBookDataById(id);
    }

    @PostMapping("/create")
    public ResponseEntity<AddressBook> addAddressBookData(@Valid @RequestBody AddressBookDTO addressBookDTO) {
        return addressBookService.createAddressBookData(addressBookDTO);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<AddressBook> updateAddressBookData(@PathVariable("id") long id,
                                                             @Valid  @RequestBody AddressBookDTO addressBookDTO) {
        return addressBookService.updateAddressBookData(id,addressBookDTO);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteAddressBookData(@PathVariable("id") long id) {
        return addressBookService.deleteAddressBookData(id);
    }
}
