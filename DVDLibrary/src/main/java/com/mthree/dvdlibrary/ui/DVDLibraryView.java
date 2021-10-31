/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.dvdlibrary.ui;

import com.mthree.dvdlibrary.dto.DVDLibrary;
import java.util.List;

/**
 *
 * @author salon
 */
public class DVDLibraryView {
    //dependency injection
    private final UserIO io;
    
    //constructor injection
    public DVDLibraryView(UserIO io) {
        this.io = io;
    }

    public int printMenuAndGetSelection() {
        io.print("====================");
        io.print("=== Initial Menu ===");
        io.print("Please select the operation you wish to perform:");
        io.print("1. Add DVD to Collection");
        io.print("2. Delete DVD from Collection");
        io.print("3. Find DVD from Collection");
        io.print("4. List all DVDs in the Collection");
        io.print("5. Update DVD information");
        io.print("6. Exit");

        return io.readInt("Please select from the above choices.", 1, 6);
    }

    public DVDLibrary getNewDVDInfo() {

        String title = io.readString("Please enter DVD Title");
        String releaseDate = io.readString("Please enter Release Date");
        String mpaaRating = io.readString("Please enter MPAA Rating");
        String directorName = io.readString("Please enter Director's Name");
        String studio = io.readString("Please enter Studio Information");
        String userRating = io.readString("Please enter User Rating or Note");

        DVDLibrary currentDVD = new DVDLibrary(title);
        currentDVD.setReleaseDate(releaseDate);
        currentDVD.setMpaaRating(mpaaRating);
        currentDVD.setDirectorName(directorName);
        currentDVD.setStudio(studio);
        currentDVD.setUserRating(userRating);
        return currentDVD;
    }

    public void displayAddDVDBanner() {
        io.print("=== Add DVD Menu ===");
    }

    public void displayAddSuccessBanner() {
        io.readString("DVD successfully added to the DVDLibrary.  Press Enter to go to Main Menu.");
    }

    public void displayAllDVDs(List<DVDLibrary> allDVDs) {
        for (DVDLibrary currentRecord : allDVDs) {
            String title = String.format("%s", currentRecord.getTitle());
            String releaseDate = String.format("%s", currentRecord.getReleaseDate());
            String mpaaRating = String.format("%s", currentRecord.getMpaaRating());
            String studio = String.format("%s", currentRecord.getStudio());
            String directorName = String.format("%s", currentRecord.getDirectorName());
            String userRating = String.format("%s", currentRecord.getUserRating());
            io.print("Title: " + title);
            io.print("Release Date: " + releaseDate);
            io.print("MPAA Rating: " + mpaaRating);
            io.print("Director's Name: " + directorName);
            io.print("Studio: " + studio);
            io.print("User Rating: " + userRating);
            io.print("");
        }
        io.readString("Press Enter to go to Main Menu.");
    }
    
    public void dispalyTotalRecords(int count) {
        io.print("There are " + count + " DVDs in the Library.");
    }

    public void displayAllBanner() {
        io.print("=== List ALL DVDs Menu ===");
    }

    public void findDVDBanner() {
        io.print("=== Find DVD Menu ===");
    }

    public String findDVDChoice() {
        return io.readString("Please enter DVD title to get Information:");
    }

    public void displayDVD(DVDLibrary dvdInfo) {
        if (dvdInfo != null) {

            io.print("Title: " + dvdInfo.getTitle());
            io.print("Release Date: " + dvdInfo.getReleaseDate());
            io.print("MPAA Rating: " + dvdInfo.getMpaaRating());
            io.print("Director's Name: " + dvdInfo.getDirectorName());
            io.print("Studio: " + dvdInfo.getStudio());
            io.print("User Rating/Note: " + dvdInfo.getUserRating());
            io.print("");
        } else {
            io.print("No Such DVD exists in the Library.");
        }
        io.readString("Press Enter to go to Main Menu.");
    }

    public void displayRemoveDVDBanner() {
        io.print("=== Delete Address Menu ===");
    }

    public String deleteDVDChoice() {
        return io.readString("Please enter title of the DVD to delete:");
    }

    public void displayRemovedDVD(DVDLibrary dvdRecord) {
        if (dvdRecord != null) {
            io.print("DVD record successfully deleted.");
        } else {
            io.print("No such DVD exist in the Library.");
        }
        io.readString("Press Enter to go to Main Menu.");
    }
    
     public void displayUpdateBanner() {
        io.print("=== Update DVD Information Menu ===");
    }

    public String updateDVDChoice() {
        return io.readString("Please enter title of the DVD to update:");
    }

    public DVDLibrary updateDVDInformation(DVDLibrary dvd) {
        String releaseDate = io.readString("Please enter Release Date");
        String mpaaRating = io.readString("Please enter MPAA Rating");
        String directorName = io.readString("Please enter Director's Name");
        String studio = io.readString("Please enter Studio Information");
        String userRating = io.readString("Please enter User Rating or Note");
        
        dvd.setReleaseDate(releaseDate);
        dvd.setMpaaRating(mpaaRating);
        dvd.setDirectorName(directorName);
        dvd.setStudio(studio);
        dvd.setUserRating(userRating);

        return dvd;

    }

    public void displayUpdateMsg() {
        io.readString("DVD Information Successfully Updated.  Press Enter to go to Main Menu.");
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
    
    
}
