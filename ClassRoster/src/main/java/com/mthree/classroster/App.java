/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.classroster;

import com.mthree.classroster.controller.ClassRosterController;
import com.mthree.classroster.dao.ClassRosterAuditDao;
import com.mthree.classroster.dao.ClassRosterAuditDaoFileImpl;
import com.mthree.classroster.dao.ClassRosterDao;
import com.mthree.classroster.dao.ClassRosterDaoFileImpl;
import com.mthree.classroster.service.ClassRosterServiceLayer;
import com.mthree.classroster.service.ClassRosterServiceLayerImpl;
import com.mthree.classroster.ui.ClassRosterView;
import com.mthree.classroster.ui.UserIO;
import com.mthree.classroster.ui.UserIOConsoleImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author salon
 */
public class App {

    public static void main(String[] args) {
       
        
/*// Instantiate the UserIO implementation
        UserIO myIo = new UserIOConsoleImpl();
        // Instantiate the View and wire the UserIO implementation into it
        ClassRosterView myView = new ClassRosterView(myIo);
        // Instantiate the DAO
        ClassRosterDao myDao = new ClassRosterDaoFileImpl();
        // Instantiate the Audit DAO
        ClassRosterAuditDao myAuditDao = new ClassRosterAuditDaoFileImpl();
        // Instantiate the Service Layer and wire the DAO and Audit DAO into it
        ClassRosterServiceLayer myService = new ClassRosterServiceLayerImpl(myDao, myAuditDao);
        // Instantiate the Controller and wire the Service Layer into it
        ClassRosterController controller = new ClassRosterController(myService, myView);
        // Kick off the Controller
        controller.run();*/

       /* AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("com.mthree.classroster");
        appContext.refresh();
        
        ClassRosterController controller = appContext.getBean("classRosterController", ClassRosterController.class);
        controller.run();*/
        ApplicationContext ctx = 
           new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ClassRosterController controller = 
           ctx.getBean("controller", ClassRosterController.class);
        controller.run();


    }
}
