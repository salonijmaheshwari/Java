/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.dvdlibrary;

import com.mthree.dvdlibrary.controller.DVDLibraryController;
import com.mthree.dvdlibrary.dao.DVDLibraryDao;
import com.mthree.dvdlibrary.dao.DVDLibraryDaoFileImpl;
import com.mthree.dvdlibrary.ui.DVDLibraryView;
import com.mthree.dvdlibrary.ui.UserIO;
import com.mthree.dvdlibrary.ui.UserIOConsoleImpl;

/**
 *
 * @author salon
 */
public class App {

    public static void main(String[] args) {
        // Instantiate the UserIO implementation
        UserIO myIo = new UserIOConsoleImpl();
        
        // Instantiate the View and wire the UserIO implementation into it
        DVDLibraryView myView = new DVDLibraryView(myIo);
        
        //Instantiate DVDLibraryDao implementation
        DVDLibraryDao myDao = new DVDLibraryDaoFileImpl();
        
        //Instantiate DVDLibraryDaoController and wire the dao and view into it
        DVDLibraryController controller = new DVDLibraryController(myDao,myView);
        
        controller.run();
    }
}
