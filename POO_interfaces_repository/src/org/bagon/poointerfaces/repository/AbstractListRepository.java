package org.bagon.poointerfaces.repository;

import org.bagon.poointerfaces.model.EntityBase;
import org.bagon.poointerfaces.repository.exceptions.ReadAccessDataException;
import org.bagon.poointerfaces.repository.exceptions.WriteAccessDataException;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractListRepository<T extends EntityBase> implements ClientRepository<T> {
    protected final List<T> dataSource;

    public AbstractListRepository() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<T> list() {
        return dataSource;
    }

    @Override
    public T getById(Integer id) throws ReadAccessDataException {
        if(id == null || id <= 0) {
            throw new ReadAccessDataException("Invalid ID");
        }

        T objectFound = null;

        for(T object : dataSource ) {
            if(object.getId() != null && object.getId().equals(id)) {
                objectFound = object;

                break;
            }
        }

        if(objectFound == null) {
            throw new ReadAccessDataException("No record exists with ID:" + id);
        }

        return objectFound;
    }

    @Override
    public void create(T object) throws WriteAccessDataException {
        if(object == null) {
            throw new WriteAccessDataException("Error inserting object: It is null");
        }

        if(this.dataSource.contains(object)) {
            throw new WriteAccessDataException("Error inserting object with ID " + object.getId() + " : It already exists in the repository");
        }

        dataSource.add(object);
    }

    @Override
    public void delete(Integer id) throws ReadAccessDataException {
        dataSource.remove(getById(id));
    }

    @Override
    public List<T> list(int offset, int limit) {
        return dataSource.subList(offset, offset + limit);
    }

    @Override
    public int total() {
        return dataSource.size();
    }
}