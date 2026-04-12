package org.bagon.poointerfaces.repository.list;

import org.bagon.poointerfaces.model.Client;
import org.bagon.poointerfaces.repository.AbstractListRepository;
import org.bagon.poointerfaces.repository.Direction;
import org.bagon.poointerfaces.repository.exceptions.ReadAccessDataException;

import java.util.ArrayList;
import java.util.List;

public class ClientListRepository extends AbstractListRepository<Client> {
    @Override
    public void update(Client object) throws ReadAccessDataException {
        Client client1 = getById(object.getId());

        client1.setName(object.getName());
        client1.setSurnames(object.getSurnames());
    }

    public static int order (String field, Client a, Client b) {
        int res = 0;

        switch (field) {
            case "id" -> res = a.getId().compareTo(b.getId());
            case "name" -> res = a.getName().compareTo(b.getName());
            case "surnames" -> res = a.getSurnames().compareTo(b.getSurnames());
        }

        return res;
    }

    @Override
    public List<Client> list(String field, Direction direction) {
        List<Client> orderedList = new ArrayList<>(this.dataSource);

        orderedList.sort((Client a, Client b) -> {
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
}