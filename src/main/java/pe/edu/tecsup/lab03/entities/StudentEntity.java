package pe.edu.tecsup.lab03.entities;
import java.time.LocalDate;
public class StudentEntity {

    private Long id;
    private String name;

    public StudentEntity() {}

    public StudentEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        Integer age;
        return age;
    }

    public void setAge(Integer age) {
        if (age != null && age < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        this.age = age;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }


}
