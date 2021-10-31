/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.dvdlibrary.dao;

import com.mthree.dvdlibrary.dto.DVDLibrary;
import java.util.List;

/**
 *
 * @author salon
 */
public interface DVDLibraryDao {
    
    DVDLibrary addDVDinfo(String title,DVDLibrary dvdInfo) throws DVDLibraryDaoException;
    
    List<DVDLibrary> getAllDVDInfo() throws DVDLibraryDaoException;
    
    DVDLibrary getPerticularDVDinfo(String title) throws DVDLibraryDaoException;
    
    DVDLibrary removeDVDInfo(String title) throws DVDLibraryDaoException;
   
    void updateDVDInfo(String title,DVDLibrary dvdInfo) throws DVDLibraryDaoException;
    
    int getTotalRecords() throws DVDLibraryDaoException;
    
}
