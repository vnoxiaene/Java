package dao;

import java.util.List;
import example.CRUDBeginner.domain.Department;


public interface DepartmentDao {
    void save(Department department);

    void update(Department department);

    void delete(long id);

    Department findById(long id);

    List<Department> findAll();
}
