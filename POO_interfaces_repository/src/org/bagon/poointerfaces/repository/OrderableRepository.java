package org.bagon.poointerfaces.repository;

import java.util.List;

public interface OrderableRepository<T> {
    List<T> list(String field, Direction direction);
}
