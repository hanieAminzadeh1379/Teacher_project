package com.company;

public class TeacherMain {
    public static void main(String[] args){
        TeacherService teacherService= new TeacherService();


        System.out.println(teacherService.findByPersonalCode("12345"));
        System.out.println(teacherService.findFirstByPersonalCode("34567"));
        System.out.println(teacherService.findLastByPersonalCode("3456"));
        System.out.println("addTeacherNonDuplicatePersonalCode :");
        teacherService.addTeacherNonDuplicatePersonalCode(new Teacher(22, "sara","34567"));
        System.out.println(teacherService.teachers.toString());
        System.out.println("removeTeacherByPersonalCode :");
        teacherService.removeTeacherByPersonalCode(("78901").toString());
        System.out.println(teacherService.teachers.toString());


    }
}
