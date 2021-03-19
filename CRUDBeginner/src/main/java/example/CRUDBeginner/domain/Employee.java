package example.CRUDBeginner.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name ="EMPLOYEE")
public class Employee extends AbstractEntity<Long>{
    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false, columnDefinition = "DECIMAL(7,2), DEFAULT 0.00")//NO SQL VAI APARECER O TIPO DECIMAL COM 7CASAS 2 DEPOIS ,
    private BigDecimal salary;

    @Column(name ="data_entrada",nullable = false, columnDefinition = "DATE")
    private LocalDate dataEntrada;

    @Column(name ="data_saida", columnDefinition = "DATE")
    private LocalDate dataSaida;

    @OneToOne(cascade = CascadeType.ALL) //qndo insere um funcionario ja insere um endereco
    @JoinColumn(name = "address_id_fk")
    private Address address;

    @ManyToOne
    @JoinColumn(name = "office_id_fk")
    private Office office;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }
}
