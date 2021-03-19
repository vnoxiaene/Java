package example.CRUDBeginner.domain;

import javax.persistence.*;
import java.util.List;

@Entity //esta é uma entidade gerenciada pela JPA
@Table(name = "DEPARTMENTS") //Mapear o nome da tabela do BD
public class Department extends AbstractEntity<Long>{
    @Column(name = "name", nullable = false,unique = true, length = 60) //mapear o nome da coluna da tabela
    private String name;

    @OneToMany(mappedBy = "departments")//mostra q o departamento e o lado fraco
    private List<Office>offices;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Office> getOffices() {
        return offices;
    }

    public void setOffices(List<Office> offices) {
        this.offices = offices;
    }
}
