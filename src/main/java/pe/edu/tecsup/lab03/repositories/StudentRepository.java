package pe.edu.tecsup.lab03.repositories;

import pe.edu.tecsup.lab03.entities.StudentEntity;

import javax.xml.crypto.XMLCryptoContext;

public class StudentRepository {

    public void save() {
        System.out.println("Repositorio: guardando estudiante...");
    }

    public void save(StudentEntity student) {
        XMLCryptoContext storage;
        storage.put(student.getId(), student);
        System.out.println("Repositorio: estudiante guardado -> " + student);
    }

    // Buscar estudiante por id
    public Optional<StudentEntity> findById(String id) {
        return Optional.ofNullable(storage.get(id));
    }
}
