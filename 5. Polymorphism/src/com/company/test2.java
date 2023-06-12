package com.company;

import java.util.ArrayList;
import java.util.List;

public class test2 {

    static class Student{

        //Attributes
        String name;
        int id;
        String dept;

        //Constructor
        public Student(String name, int id, String dept) {
            this.name = name;
            this.id = id;
            this.dept = dept;
        }
    }


    static class Department{

        //Attributes
        String names;
        private List<Student> students;

        //Constructor
        public Department(String names, List<Student> students) {
            this.names = names;
            this.students = students;
        }

        //Methods
        public List<Student> getStudents() {
            return students;
        }
    }

    static class Institute{

        //Attributes
        String instituteName;
        private List<Department> departments;

        //Constructor

        public Institute(String instituteName, List<Department> departments) {
            this.instituteName = instituteName;
            this.departments = departments;
        }

        //Method
        public int getTotalStudentsInInstitute(){
            int noOfStudent = 0;
            List<Student> students;

            for (Department dept: departments) {
                students = dept.getStudents();

                for (Student s :
                        students) {
                    noOfStudent++;
                }
            }
            return noOfStudent;
        }
    }


    public static void main(String[] args) {
        //Creating object of student class
        Student s1 = new Student("Badrul", 1, "FST");
        Student s2 = new Student("Hakim", 2, "FST");
        Student s3 = new Student("Syafiqah", 3, "FKAB");
        Student s4 = new Student("Anis", 4, "FKAB");

        //Creating a list of FST student
        List<Student> fst_student = new ArrayList<Student>();

        //Add FST student
        fst_student.add(s1);
        fst_student.add(s2);

        //Creating a list of FKAB student
        List<Student> fkab_student = new ArrayList<>();

        //Add FKAB student
        fkab_student.add(s3);
        fkab_student.add(s4);

        //****************************************************************

        //Creating object of FST and FKAB class
        Department FST = new Department("FST", fst_student);
        Department FKAB = new Department("FKAB", fkab_student);


        //Creating a list of departments
        List<Department> departments = new ArrayList<Department>();
        departments.add(FST);
        departments.add(FKAB);

        //****************************************************************

        //Creating an instance of Institute
        Institute institute = new Institute("USIM", departments);

        System.out.println("Total number of student in institute: ");

        System.out.println(institute.getTotalStudentsInInstitute());




    }
}
