package dao;

import example.CRUDBeginner.domain.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl extends AbstractDao<Employee, Long> implements EmployeeDao {
    @Override
    public void delete(long id) {

    }

    @Override
    public Employee findById(long id) {
        return null;
    }
}
