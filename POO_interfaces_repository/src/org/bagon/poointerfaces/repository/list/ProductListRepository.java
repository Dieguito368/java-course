package org.bagon.poointerfaces.repository.list;

import org.bagon.poointerfaces.model.Product;
import org.bagon.poointerfaces.repository.AbstractListRepository;
import org.bagon.poointerfaces.repository.Direction;
import org.bagon.poointerfaces.repository.exceptions.ReadAccessDataException;

import java.util.ArrayList;
import java.util.List;

public class ProductListRepository extends AbstractListRepository<Product> {
    @Override
    public void update(Product product) throws ReadAccessDataException {
        Product product1 = getById(product.getId());

        product1.setName(product.getName());
        product1.setPrice(product.getPrice());
    }

    @Override
    public List<Product> list(String field, Direction direction) {
        List<Product> orderedList = new ArrayList<>(this.dataSource);

        orderedList.sort((Product a, Product b) -> {
            int res = 0;

            if(direction == Direction.ASC) {
                res = order(field, a, b);
            } else if(direction == Direction.DESC) {
                res = order(field, b, a);
            }

            return res;
        });

        return orderedList;
    }

    public static int order (String field, Product a, Product b) {
        int res = 0;

        switch (field) {
            case "id" -> res = a.getId().compareTo(b.getId());
            case "name" -> res = a.getName().compareTo(b.getName());
            case "price" -> res = a.getPrice().compareTo(b.getPrice());
        }

        return res;
    }
}
