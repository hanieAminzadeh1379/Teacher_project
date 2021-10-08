package com.company;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {

    List<Teacher> teachers = new ArrayList<>();

    public TeacherService() {
        this.teachers.add(new Teacher(25, "ali", "1234"));
        this.teachers.add(new Teacher(22, "sara", "4567"));
        this.teachers.add(new Teacher(32, "mrym", "78901"));


    }

    public Teacher findByPersonalCode(String personalCode) {
        for (Teacher teacher : teachers) {
            if (teacher.getPersonalCode().equalsIgnoreCase(personalCode)) {
                return teacher;
            }
        }
        return null;
    }

    public int findByNameAndAge(String name, int age) {
        for (Teacher teacher : teachers) {
            if (teacher.getAge() == age && teacher.getName().equals(name))
                return teachers.indexOf(teachers);
        }
        return 0;
    }


    public void addTeacherNonDuplicatePersonalCode(Teacher teacher) {
//        for (Teacher teacher1 : teachers) {
//            if (teacher1.equals(teacher)) {
//                return "Duplicate PersonalCode";
        this.teachers.add(teacher);


        }
//        teachers.add(teacher);
//        return "Add succesfully";
//    }

    public List<Teacher> removeTeacherByPersonalCode(String personalCode) {
        Teacher teacher = findByPersonalCode(personalCode);
        teachers.remove(teacher);
        return teachers;
    }


    int findFirstByPersonalCode(String personalCode) {
        for (Teacher teacher:teachers){
            if (teacher.getPersonalCode().equals(personalCode)){
                return teachers.indexOf(teacher);
            }
        }
        return -1;
    }
    int findLastByPersonalCode(String personalCode) {
        int index=-1;
        for (Teacher teacher:teachers){
            if (teacher.getPersonalCode().equals(personalCode)){
                index= teachers.indexOf(teacher);
            }
        }
        return index;
    }
}
