package pe.edu.tecsup.lab03.controllers;

public class StudentController {

    public void index() {
        System.out.println("Controlador de estudiantes funcionando...");
    }

    public void createStudent(String id, String name, String email) {
        StudentEntity student = new StudentEntity(id, name, email);
        service.addStudent(student);
        System.out.println("Estudiante registrado: " + student);
    }

    public void findStudentById(String id) {
        Optional<StudentEntity> student = service.getStudent(id);
        if (student.isPresent()) {
            System.out.println("Estudiante encontrado: " + student.get());
        } else {
            System.out.println("No se encontró estudiante con id = " + id);
        }
    }
    public void deleteStudentById(String id){

    }


}
