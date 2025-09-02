package pe.edu.tecsup.lab03.controllers;

import pe.edu.tecsup.lab03.Application;

public class StudentController extends Application{
    public void index() {
        System.out.println("Hola desde StudentController");
    }
    public void create(String name, int age) {
        System.out.println("Creando estudiante: " + name + ", Edad: " + age);
    }
    public void read(int id) {
        System.out.println("Mostrando información del estudiante con ID: " + id);
    }

    // UPDATE: Actualizar datos de un estudiante
    public void update(int id, String newName, int newAge) {
        System.out.println("Actualizando estudiante con ID: " + id +
                " -> Nuevo nombre: " + newName +
                ", Nueva edad: " + newAge);
    }

    // DELETE: Eliminar un estudiante
    public void delete(int id) {
        System.out.println("Eliminando estudiante con ID: " + id);
    }
}
