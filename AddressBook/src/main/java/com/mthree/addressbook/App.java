/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.addressbook;

import com.mthree.addressbook.controller.AddressBookController;
import com.mthree.addressbook.dao.AddressBookDao;
import com.mthree.addressbook.dao.AddressBookDaoFileImpl;
import com.mthree.addressbook.ui.AddressBookView;
import com.mthree.addressbook.ui.UserIO;
import com.mthree.addressbook.ui.UserIOConsoleImpl;

/**
 *
 * @author salon
 */
public class App {
    public static void main(String[] args) {
        UserIO myIo = new UserIOConsoleImpl();
    
        AddressBookController controller= new AddressBookController();
        controller.run();
    }
        
    
}
