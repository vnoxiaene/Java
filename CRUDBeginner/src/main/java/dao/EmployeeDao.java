package dao;

import example.CRUDBeginner.domain.Employee;

import java.util.List;

public interface EmployeeDao {
    void save(Employee employee);

    void update(Employee employee);

    void delete(long id);

    Employee findById(long id);

    List<Employee> findAll();
}
