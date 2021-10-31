/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.classroster.service;

import com.mthree.classroster.dao.ClassRosterAuditDao;
import com.mthree.classroster.dao.ClassRosterDao;
import com.mthree.classroster.dao.ClassRosterPersistenceException;
import com.mthree.classroster.dto.Student;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author salon
 */
@Component
public class ClassRosterServiceLayerImpl implements ClassRosterServiceLayer {

    private final ClassRosterDao dao;
    private final ClassRosterAuditDao auditDao;
    
    @Autowired
    public ClassRosterServiceLayerImpl(ClassRosterDao dao, ClassRosterAuditDao auditDao) {
    this.dao = dao;
    this.auditDao = auditDao;
}
/*
    @Override
    public void createStudent(Student student) throws ClassRosterDuplicateIdException, ClassRosterDataValidationException, ClassRosterPersistenceException {
        
    // First check to see if there is alreay a student 
    // associated with the given student's id
    // If so, we're all done here - 
    // throw a ClassRosterDuplicateIdException
    if (dao.getStudent(student.getStudentId()) != null) {
        throw new ClassRosterDuplicateIdException(
                "ERROR: Could not create student.  Student Id "
                + student.getStudentId()
                + " already exists");
    }

    // Now validate all the fields on the given Student object.  
    // This method will throw an
    // exception if any of the validation rules are violated.
    validateStudentData(student);

    // We passed all our business rules checks so go ahead 
    // and persist the Student object
    dao.addStudent(student.getStudentId(), student);
    }
    */
    
    @Override
    public void createStudent(Student student) throws 
        ClassRosterDuplicateIdException,
        ClassRosterDataValidationException, 
        ClassRosterPersistenceException {

    // First check to see if there is alreay a student 
    // associated with the given student's id
    // If so, we're all done here - 
    // throw a ClassRosterDuplicateIdException
    if (dao.getStudent(student.getStudentId()) != null) {
        throw new ClassRosterDuplicateIdException(
                "ERROR: Could not create student.  Student Id "
                + student.getStudentId()
                + " already exists");
    }

    // Now validate all the fields on the given Student object.  
    // This method will throw an
    // exception if any of the validation rules are violated.
    validateStudentData(student);

    // We passed all our business rules checks so go ahead 
    // and persist the Student object
    dao.addStudent(student.getStudentId(), student);

    // The student was successfully created, now write to the audit log
    auditDao.writeAuditEntry(
            "Student " + student.getStudentId() + " CREATED.");

}

    @Override
    public List<Student> getAllStudents() throws ClassRosterPersistenceException {
        return dao.getAllStudents();
    }

    @Override
    public Student getStudent(String studentId) throws ClassRosterPersistenceException {
         return dao.getStudent(studentId);
    }

    /*
    @Override
    public Student removeStudent(String studentId) throws ClassRosterPersistenceException {
        return dao.removeStudent(studentId);
    }
*/
    
    @Override
    public Student removeStudent(String studentId) throws ClassRosterPersistenceException {
    Student removedStudent = dao.removeStudent(studentId);
    // Write to audit log
    auditDao.writeAuditEntry("Student " + studentId + " REMOVED.");
    return removedStudent;
}
    
    
    
    //validating student data null/empty
    private void validateStudentData(Student student) throws
        ClassRosterDataValidationException {

    if (student.getFirstName() == null
            || student.getFirstName().trim().length() == 0
            || student.getLastName() == null
            || student.getLastName().trim().length() == 0
            || student.getCohort() == null
            || student.getCohort().trim().length() == 0) {

        throw new ClassRosterDataValidationException(
                "ERROR: All fields [First Name, Last Name, Cohort] are required.");
    }
}

}
