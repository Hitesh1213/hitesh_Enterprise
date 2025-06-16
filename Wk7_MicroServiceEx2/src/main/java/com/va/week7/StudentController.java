package com.va.week7;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @RequestMapping(value="/hitesh", method=RequestMethod.GET)
    public Student getStudent() {
        Student s1 = new Student();
        s1.setStudentID(1001);
        s1.setFname("Hitesh");
        s1.setLname("Gidugu");
        s1.setPhone("416-854-7952");
        s1.setDob("1996-08-12");
        s1.setStreet("Maple Ave");
        s1.setCity("toronto");
        s1.setNo("35B");
        return s1;
    }
}
