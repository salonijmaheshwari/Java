/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.addressbook.dao;

import com.mthree.addressbook.dto.AddressBook;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author salon
 */
public class AddressBookDaoFileImpl implements AddressBookDao {
     Map<String, AddressBook> addressBook = new HashMap<>();
    
     
    @Override
    public AddressBook addAddress(String lastName, AddressBook address) {
        AddressBook newAddress=addressBook.put(lastName, address);
        return newAddress;
    }

    @Override
    public List<AddressBook> getAllAddresses() {
        return new ArrayList(addressBook.values());
    }

    @Override
    public AddressBook getAddress(String lastName) {
        return addressBook.get(lastName);
    }

    @Override
    public AddressBook removeAddress(String lastName) {
       AddressBook removedAddress=addressBook.remove(lastName);
       return removedAddress;
    }

    @Override
    public void updateAddress(String lastName, AddressBook address) {
        addressBook.replace(lastName, address);
       
    }
    
    @Override
    public int getTotalNumberAddress(){
        return addressBook.size();
    }
}
