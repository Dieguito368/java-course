package org.bagon.poointerfaces.repository;

import org.bagon.poointerfaces.repository.exceptions.DataAccessException;
import org.bagon.poointerfaces.repository.exceptions.WriteAccessDataException;

import java.util.List;

public interface CrudRepository<T> {
    List<T> list();
    T getById(Integer id) throws DataAccessException;
    void create(T object) throws DataAccessException;
    void update(T object) throws DataAccessException;
    void delete(Integer id) throws DataAccessException;
}