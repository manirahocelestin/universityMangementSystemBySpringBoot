package com.amazingapplication.wake.implement;

import com.amazingapplication.wake.domain.*;
import com.amazingapplication.wake.repo.ICourseRep;
import com.amazingapplication.wake.repo.IDepartmentRep;
import com.amazingapplication.wake.repo.IFacultyRep;
import com.amazingapplication.wake.repo.IStudentRep;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
@Component
public class StudentImplement implements CommandLineRunner {
    private final IStudentRep studentRep;
    private final ICourseRep courseRep;
    private final IFacultyRep facultyRep;
    private final IDepartmentRep departmentRep;

    public StudentImplement(IStudentRep studentRep, ICourseRep courseRep, IFacultyRep facultyRep, IDepartmentRep departmentRep) {
        this.studentRep = studentRep;
        this.courseRep = courseRep;
        this.facultyRep = facultyRep;
        this.departmentRep = departmentRep;
    }

    @Override
    public void run(String... args) throws Exception {
        Faculty IT = new Faculty("It");
        Faculty Acc = new Faculty("Accounting");
        facultyRep.save(IT);
        facultyRep.save(Acc);

        Department net= new Department("networking",IT);
        Department  info = new Department("InforManagement",IT);
        Department  mana= new Department("management",Acc);
        departmentRep.save(net);
        departmentRep.save(info);
        departmentRep.save(mana);


        Course co1 = new Course("co1","Java",4,15000);
        Course co2 = new Course("co2","SQL",3,14000);
        Course co3 = new Course("co3","NetWorking",4,15000);
        Course co4 = new Course("co4","database",3,14000);
        Student student1 = new Student("kamali", Egender.MALE, LocalDate.of(2014,05,06),"Usa",net);
        Student student2 = new Student("meek",Egender.MALE,LocalDate.of(2019,04,04),"kigali",mana);

     // co1.getStudents().add(student1);
      //co2.getStudents().add(student1);
        student1.getCourses().add(co1);
        student1.getCourses().add(co2);
        student1.getCourses().add(co3);





        studentRep.save(student1);
        studentRep.save(student2);
        courseRep.save(co1);
        courseRep.save(co2);
        courseRep.save(co3);
        courseRep.save(co4);









        System.out.println("The number of courses are " + courseRep.count());
        System.out.println("The number of faculty are " + facultyRep.count());



    }
}
