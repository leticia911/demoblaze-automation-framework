package data.repository;

import data.excel.ExcelReader;
import data.mapper.Mapper;
import exceptions.DataNotFoundException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class AbstractRepository<T>
        implements Repository<T> {

    private final List<T> cache =
            new ArrayList<>();

    protected AbstractRepository() {

        loadCache();

    }

    protected abstract String getSheetName();

    protected abstract Mapper<T> getMapper();

    protected abstract int getId(T object);

    private void loadCache() {

        cache.clear();

        int lastRow =
                ExcelReader.getLastRow(
                        getSheetName());

        for (int row = 1; row <= lastRow; row++) {

            cache.add(
                    getMapper().fromRow(row));

        }

    }

    @Override
    public T getById(int id) {

        return cache.stream()

                .filter(item ->
                        getId(item) == id)

                .findFirst()

                .orElseThrow(() ->

                        new DataNotFoundException(

                                "Registro no encontrado. ID: "
                                        + id));

    }

    @Override
    public List<T> getAll() {

        return Collections.unmodifiableList(
                cache);

    }

    @Override
    public void reload() {

        loadCache();

    }

}