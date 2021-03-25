package dao;

import example.CRUDBeginner.domain.Office;
import org.springframework.stereotype.Repository;

@Repository
public class OfficeDaoImpl extends AbstractDao<Office, Long> implements OfficeDao {
    @Override
    public void delete(long id) {

    }

    @Override
    public Office findById(long id) {
        return null;
    }
}
