package pe.edu.tecsup.lab03.controllers;

import java.util.zip.ZipFile;

public class StudentController {

    public void index() {
        System.out.println("Controlador de estudiantes funcionando...");
    }

    public int countStudents() {
        ZipFile students;
        System.out.println("Cantidad total de estudiantes: " + students.size());
        return students.size();
    }



}
