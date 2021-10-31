/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.dvdlibrary.dao;

import com.mthree.dvdlibrary.dto.DVDLibrary;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author salon
 */
public class DVDLibraryDaoFileImpl implements DVDLibraryDao {

    public static final String DVD_FILE = "dvdlibrary.txt";
    public static final String DELIMITER = "::";

    Map<String, DVDLibrary> dvdLibrary = new HashMap<>();
    
    //add DVD
    @Override
    public DVDLibrary addDVDinfo(String title, DVDLibrary dvdInfo) throws DVDLibraryDaoException {
        loadDVD();
        DVDLibrary newDVD = dvdLibrary.put(title, dvdInfo);
        writeDVD();
        return newDVD;
    }
    
    //list all dvd
    @Override
    public List<DVDLibrary> getAllDVDInfo() throws DVDLibraryDaoException {
        loadDVD();
        return new ArrayList(dvdLibrary.values());
    }
    
    //get single dvd info-search by dvd title
    @Override
    public DVDLibrary getPerticularDVDinfo(String title) throws DVDLibraryDaoException {
        loadDVD();
        return dvdLibrary.get(title);
    }
    
    //delete dvd
    @Override
    public DVDLibrary removeDVDInfo(String title) throws DVDLibraryDaoException {
        loadDVD();
        DVDLibrary removedDVD = dvdLibrary.remove(title);
        writeDVD();
        return removedDVD;
    }
    
    //update dvd
    @Override
    public void updateDVDInfo(String title, DVDLibrary dvdInfo) throws DVDLibraryDaoException {
        loadDVD();
        dvdLibrary.replace(title, dvdInfo);
        writeDVD();
    }
    
    //total records
    @Override
    public int getTotalRecords() throws DVDLibraryDaoException {
        loadDVD();
        return dvdLibrary.size();
    }
    
    //unmarshall read data
    private DVDLibrary unmarshallDVDLibrary(String dvdLibraryAsText) {
        String[] dvdTokens = dvdLibraryAsText.split(DELIMITER);
        String title = dvdTokens[0];
        DVDLibrary dvdFromFile = new DVDLibrary(title);
        dvdFromFile.setReleaseDate(dvdTokens[1]);
        dvdFromFile.setMpaaRating(dvdTokens[2]);
        dvdFromFile.setDirectorName(dvdTokens[3]);
        dvdFromFile.setStudio(dvdTokens[4]);
        dvdFromFile.setUserRating(dvdTokens[5]);
        return dvdFromFile;
    }
    
    //read from file
    private void loadDVD() throws DVDLibraryDaoException {

        Scanner scanner;

        try {

            scanner = new Scanner(new BufferedReader(new FileReader(DVD_FILE)));
        } catch (FileNotFoundException e) {
            throw new DVDLibraryDaoException("Could not load DVD data into memory.", e);
        }

        String currentLine;
        DVDLibrary currentDVD;

        while (scanner.hasNextLine()) {

            currentLine = scanner.nextLine();
            currentDVD = unmarshallDVDLibrary(currentLine);
            dvdLibrary.put(currentDVD.getTitle(), currentDVD);
        }
        scanner.close();
    }
    
    //marshall data to write
    private String marshallDVDLibrary(DVDLibrary dvd) {

        String dvdAsText = dvd.getTitle() + DELIMITER;
        dvdAsText += dvd.getReleaseDate() + DELIMITER;
        dvdAsText += dvd.getMpaaRating() + DELIMITER;
        dvdAsText += dvd.getDirectorName() + DELIMITER;
        dvdAsText += dvd.getStudio() + DELIMITER;
        dvdAsText += dvd.getUserRating() + DELIMITER;
        return dvdAsText;
    }

    //write into file
    private void writeDVD() throws DVDLibraryDaoException {

        PrintWriter out;

        try {
            out = new PrintWriter(new FileWriter(DVD_FILE));
        } catch (IOException e) {
            throw new DVDLibraryDaoException("Could not save dvd data.", e);
        }

        String dvdAsText;
        List<DVDLibrary> dvdList = this.getAllDVDInfo();
        for (DVDLibrary currentDVD : dvdList) {
            dvdAsText = marshallDVDLibrary(currentDVD);
            out.println(dvdAsText);
            out.flush();
        }
        out.close();
    }
}
