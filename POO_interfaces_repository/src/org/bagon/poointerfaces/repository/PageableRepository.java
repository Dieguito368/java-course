package org.bagon.poointerfaces.repository;

import java.util.List;

public interface PageableRepository<T> {
    List<T> list(int offset, int limit);
}