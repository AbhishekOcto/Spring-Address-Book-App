package com.bridgelabz.addressbookapp.repository;

import com.bridgelabz.addressbookapp.entity.AddressBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressBookRepository extends JpaRepository<AddressBook, Long> {
}
