package example.CRUDBeginner.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "OFFICES") //Mapear o nome da tabela do BD
public class Office extends AbstractEntity<Long>{
    @Column(name = "name", unique = true, nullable = false, length = 60)
    private String name;

    @ManyToOne //um cargo serve para varios departamentos
    @JoinColumn(name = "id_department_fk")
    private Department department;

    @OneToMany(mappedBy = "office")
    private List<Employee>employees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
