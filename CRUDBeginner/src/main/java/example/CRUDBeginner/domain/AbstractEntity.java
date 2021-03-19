package example.CRUDBeginner.domain;

import nonapi.io.github.classgraph.json.Id;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;

@MappedSuperclass //esta é uma super classe das entidades que serao implementadas
public abstract class  AbstractEntity<ID extends Serializable> implements Serializable{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //tipo referente ao mysql
    private ID id;

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractEntity)) return false;
        AbstractEntity<?> that = (AbstractEntity<?>) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "id = " + id ;

    }
}
