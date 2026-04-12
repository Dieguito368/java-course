package org.bagon.poointerfaces.repository;

public interface ClientRepository<T> extends CrudRepository<T>, OrderableRepository<T>, PageableRepository<T>, CountableRepository {
}
