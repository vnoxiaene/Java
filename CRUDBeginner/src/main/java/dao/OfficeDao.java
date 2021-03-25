package dao;

import example.CRUDBeginner.domain.Office;

import java.util.List;

public interface OfficeDao {
    void save(Office office);

    void update(Office office);

    void delete(long id);

    Office findById(long id);

    List<Office> findAll();
}
