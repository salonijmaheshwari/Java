/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.q.CRC143.controller;

import com.q.CRC143.dao.CourseDao;
import com.q.CRC143.dao.StudentDao;
import com.q.CRC143.dao.TeacherDao;
import com.q.CRC143.dto.Teacher;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Quinten Lambert
 */
@Controller
//localhost:8080/teachers
public class TeacherController {
   
   @Autowired
   TeacherDao teacherDao;

   @Autowired
   StudentDao studentDao;

   @Autowired
   CourseDao courseDao;
   
   @GetMapping("teachers")
   public String displayTeachers(Model model){
       List<Teacher> teachers = teacherDao.getAllTeachers();
       model.addAttribute("teachers", teachers);
       return "teachers";
   }
   
   @PostMapping("addTeacher")
   public String addTeacher(HttpServletRequest request){
       String firstName = request.getParameter("firstName");
       String lastName = request.getParameter("lastName");
       String specialty = request.getParameter("specialty");
       
       Teacher teacher = new Teacher();
       teacher.setFirstName(firstName);
       teacher.setLastName(lastName);
       teacher.setSpecialty(specialty);
       
       teacherDao.addTeacher(teacher);
       
       return "redirect:/teachers";
   }
   
   @GetMapping("deleteTeacher")
   public String deleteTeacher(HttpServletRequest request){
       int id = Integer.parseInt(request.getParameter("id"));
       teacherDao.deleteTeacherById(id);
       
       return "redirect:/teachers";
   }
   
   @GetMapping("editTeacher")
   public String editTeacher(HttpServletRequest request, Model model){
       int id = Integer.parseInt(request.getParameter("id"));
       Teacher teacher = teacherDao.getTeacherById(id);
       
       model.addAttribute("teacher", teacher);
       return "editTeacher";
   }
   
   @PostMapping("editTeacher")
   public String performEditTeacher(HttpServletRequest request){
       int id = Integer.parseInt(request.getParameter("id"));
       Teacher teacher = teacherDao.getTeacherById(id);
       
       teacher.setFirstName(request.getParameter("firstName"));
       teacher.setLastName(request.getParameter("lastName"));
       teacher.setSpecialty(request.getParameter("specialty"));
       
       teacherDao.updateTeacher(teacher);
       
       return "redirect:/teachers";
   }
}
