package dao;

import example.CRUDBeginner.domain.Department;
import org.springframework.stereotype.Repository;


@Repository //transforma a classe em um bean gerenciado pelo Spring
public class DepartmentDaoImpl extends AbstractDao<Department, Long> implements DepartmentDao{

    @Override
    public void delete(long id) {

    }

    @Override
    public Department findById(long id) {
        return null;
    }
}
