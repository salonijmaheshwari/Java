/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.addressbook.dao;

import com.mthree.addressbook.dto.AddressBook;
import java.util.List;

/**
 *
 * @author salon
 */
public interface AddressBookDao {
    
    
    AddressBook addAddress(String lastName,AddressBook address);
    
    List<AddressBook> getAllAddresses();
    
    AddressBook getAddress(String lastName);
    
    AddressBook removeAddress(String lastName);
    
    void updateAddress(String lastName,AddressBook address);
    
    int getTotalNumberAddress();
    
}
