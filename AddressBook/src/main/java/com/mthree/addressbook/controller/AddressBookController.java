/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.addressbook.controller;

import com.mthree.addressbook.dao.AddressBookDao;
import com.mthree.addressbook.dao.AddressBookDaoFileImpl;
import com.mthree.addressbook.dto.AddressBook;
import com.mthree.addressbook.ui.AddressBookView;
import com.mthree.addressbook.ui.UserIO;
import com.mthree.addressbook.ui.UserIOConsoleImpl;
import java.util.List;

/**
 *
 * @author salon
 */
public class AddressBookController {

    UserIO io = new UserIOConsoleImpl();
    AddressBookView view = new AddressBookView();
    AddressBookDao dao = new AddressBookDaoFileImpl();

    public void run() {
        boolean keepGoing = true;
        int menuSelection;

        while (keepGoing) {

            menuSelection = getMenuSelection();

            switch (menuSelection) {
                case 1:
                    addAddress();
                    break;

                case 2:
                    deleteAddress();
                    break;

                case 3:
                    findAddress();
                    break;

                case 4:
                    listAddressCount();
                    break;

                case 5:
                    listAllAdresses();
                    break;

                case 6:
                    upadateAddress();
                    break;

                case 7:
                    keepGoing = false;
                    break;
                default:
                    unknownCommand();

            }
        }
        exitMessage();

    }

    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }

    private void addAddress() {
        view.displayCreateAddressBanner();
        AddressBook newAddress = view.getNewAddressInfo();
        dao.addAddress(newAddress.getLastName(), newAddress);
        view.displayCreateSuccessBanner();
    }

    private void listAllAdresses() {
        view.displayAllBanner();
        List<AddressBook> address = dao.getAllAddresses();
        view.displayAllAddresses(address);
    }

    private void findAddress() {
        view.findAddressBanner();
        String lastName = view.findAddressChoice();
        AddressBook address = dao.getAddress(lastName);
        view.displayAddress(address);
    }

    private void deleteAddress() {
        view.displayRemoveAddressBanner();
        String lastName = view.deleteAddressChoice();
        AddressBook removedAddress = dao.removeAddress(lastName);
        view.displayRemovedAddress(removedAddress);
    }
    
    private void listAddressCount(){
        view.dispalyTotalBanner();
        int count=dao.getTotalNumberAddress();
        view.dispalyTotalRecords(count);
    }
    
    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }

    private void exitMessage() {
        view.displayExitBanner();
    }
    
    private void upadateAddress(){
        view.displayUpdateBanner();
        String lastName = view.updateAddressChoice();
        AddressBook address = dao.getAddress(lastName);
        AddressBook updatedAddress = view.updateAddressInfo(address);
        dao.updateAddress(lastName, updatedAddress);
        view.displayUpdateMsg();
        
    }

}
