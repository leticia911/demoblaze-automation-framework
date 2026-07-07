package data.repository;

import java.util.List;

public interface Repository<T> {

    T getById(int id);

    List<T> getAll();

    void reload();

}