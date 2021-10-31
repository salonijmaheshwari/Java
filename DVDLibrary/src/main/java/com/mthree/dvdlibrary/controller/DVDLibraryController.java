/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.dvdlibrary.controller;

import com.mthree.dvdlibrary.dao.DVDLibraryDao;
import com.mthree.dvdlibrary.dao.DVDLibraryDaoException;
import com.mthree.dvdlibrary.dto.DVDLibrary;
import com.mthree.dvdlibrary.ui.DVDLibraryView;
import java.util.List;

/**
 *
 * @author salon
 */
public class DVDLibraryController {
    
    //dependency injection
    private final DVDLibraryView view;
    private final DVDLibraryDao dao;
    
    //constuctor injection
    public DVDLibraryController(DVDLibraryDao dao, DVDLibraryView view) {
        this.dao = dao;
        this.view = view;
    }

   

    public void run() {
        boolean keepGoing = true;
        int menuSelection;
        
        try{

        while (keepGoing) {

            menuSelection = getMenuSelection();

            switch (menuSelection) {
                case 1:
                    addDVD();
                    break;

                case 2:
                    deleteDVD();
                    break;

                case 3:
                    findDVD();
                    break;

                case 4:
                    listAllDVDs();
                    break;

                case 5:
                    updateDVd();
                    break;

                case 6:
                    keepGoing = false;
                    break;
                default:
                    unknownCommand();

            }
        }
        exitMessage();
        } catch (DVDLibraryDaoException e) {
            view.displayErrorMessage(e.getMessage());
        }

    }

    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }

    private void addDVD() throws DVDLibraryDaoException {
        view.displayAddDVDBanner();
        DVDLibrary newDVD = view.getNewDVDInfo();
        dao.addDVDinfo(newDVD.getTitle(), newDVD);
        view.displayAddSuccessBanner();
    }

    private void listAllDVDs() throws DVDLibraryDaoException {
        view.displayAllBanner();
        int count = dao.getTotalRecords();
        view.dispalyTotalRecords(count);
        List<DVDLibrary> dvds = dao.getAllDVDInfo();
        view.displayAllDVDs(dvds);
    }

    private void findDVD() throws DVDLibraryDaoException {
        view.findDVDBanner();
        String title = view.findDVDChoice();
        DVDLibrary dvd = dao.getPerticularDVDinfo(title);
        view.displayDVD(dvd);
    }

    private void deleteDVD() throws DVDLibraryDaoException {
        view.displayRemoveDVDBanner();
        String title = view.deleteDVDChoice();
        DVDLibrary removedDVD = dao.removeDVDInfo(title);
        view.displayRemovedDVD(removedDVD);
    }

    private void updateDVd() throws DVDLibraryDaoException {
        view.displayUpdateBanner();
        String title = view.updateDVDChoice();
        DVDLibrary dvdInfo = dao.getPerticularDVDinfo(title);
        DVDLibrary updated = view.updateDVDInformation(dvdInfo);
        dao.updateDVDInfo(title, updated);
        view.displayUpdateMsg();
    }

    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }

    private void exitMessage() {
        view.displayExitBanner();
    }

}
