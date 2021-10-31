/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.addressbook.ui;

import com.mthree.addressbook.dto.AddressBook;
import java.util.List;

/**
 *
 * @author salon
 */
public class AddressBookView {

    UserIO io = new UserIOConsoleImpl();

    public int printMenuAndGetSelection() {
        io.print("=== Initial Menu ===");
        io.print("Please select the operation you wish to perform:");
        io.print("1. Add Address");
        io.print("2. Delete Address");
        io.print("3. Find Address");
        io.print("4. List Address Count");
        io.print("5. List All Addresses");
        io.print("6. Update Address");
        io.print("7. Exit");

        return io.readInt("Please select from the above choices.", 1, 7);
    }

    public AddressBook getNewAddressInfo() {

        String firstName = io.readString("Please enter First Name");
        String lastName = io.readString("Please enter Last Name");
        String StreetAddress = io.readString("Please enter Street Address");
        String City = io.readString("Please enter City");
        String State = io.readString("Please enter State");
        String PostalCode = io.readString("Please enter Postal Code");

        AddressBook currentAddress = new AddressBook(lastName);
        currentAddress.setFirstName(firstName);
        currentAddress.setStreetAddress(StreetAddress);
        currentAddress.setCity(City);
        currentAddress.setState(State);
        currentAddress.setPostalCode(PostalCode);
        return currentAddress;
    }

    public void displayCreateAddressBanner() {
        io.print("=== Add Address Menu ===");
    }

    public void displayCreateSuccessBanner() {
        io.readString("Address added.  Press 1 to go to Main Menu.");
    }

    public void displayAllAddresses(List<AddressBook> allAddresses) {
        for (AddressBook currentRecord : allAddresses) {
            String NameInfo = String.format("%s %s",
                    currentRecord.getFirstName(),
                    currentRecord.getLastName());
            String streetInfo = String.format("%s", currentRecord.getStreetAddress());
            String addressInfo = String.format("%s %s %s",
                    currentRecord.getCity(),
                    currentRecord.getState(),
                    currentRecord.getPostalCode());
            io.print(NameInfo);
            io.print(streetInfo);
            io.print(addressInfo);
            io.print("");
        }
        io.readString("Press 1 to go to Main Menu.");
    }

    public void displayAllBanner() {
        io.print("=== List Addresses Menu ===");
    }

    public void findAddressBanner() {
        io.print("=== Find Address Menu ===");
    }

    public String findAddressChoice() {
        return io.readString("Please enter last name of address to find:");
    }

    public void displayAddress(AddressBook address) {
        if (address != null) {

            io.print(address.getFirstName() + " " + address.getLastName());
            io.print(address.getStreetAddress());
            io.print(address.getCity() + " " + address.getState() + " " + address.getPostalCode());
            io.print("");
        } else {
            io.print("No Such Record Exist.");
        }
        io.readString("Press 1 to go to Main Menu.");
    }

    public void displayRemoveAddressBanner() {
        io.print("=== Delete Address Menu ===");
    }

    public String deleteAddressChoice() {
        return io.readString("Please enter last name of address to delete:");
    }

    public void displayRemovedAddress(AddressBook addressRecord) {
        if (addressRecord != null) {
            String response = io.readString("Really Delete?");
            if (response.equalsIgnoreCase("yes")) {
                io.readString("Address Deleted.  Press 1 to go to Main Menu.");
            } else {
                io.readString("Press 1 to go to Main Menu.");
            }
        } else {
            io.print("No Such Record Exist.");
        }
    }

    public void dispalyTotalBanner() {
        io.print("=== List Address Count Menu ===");
    }

    public void dispalyTotalRecords(int count) {
        io.readString("There are " + count + " addresses in the book.  Press 1 to go to Main Menu.");
    }

    public void displayExitBanner() {
        io.print("Good Bye!!!");
    }

    public void displayUnknownCommandBanner() {
        io.print("Unknown Command!!!");
    }

    public void displayErrorMessage(String errorMsg) {
        io.print("=== ERROR ===");
        io.print(errorMsg);
    }

    public void displayUpdateBanner() {
        io.print("=== Update Address Menu ===");
    }

    public String updateAddressChoice() {
        return io.readString("Please enter last name of address to update:");
    }

    public AddressBook updateAddressInfo(AddressBook address) {

        String StreetAddress = io.readString("Please enter Street Address");
        address.setStreetAddress(StreetAddress);

        String City = io.readString("Please enter City");
        address.setCity(City);

        String State = io.readString("Please enter State");
        address.setState(State);

        String PostalCode = io.readString("Please enter Postal Code");
        address.setPostalCode(PostalCode);

        return address;

    }

    public void displayUpdateMsg() {
        io.readString("Address Successfully Updated.  Press 1 to go to Main Menu.");
    }

}
