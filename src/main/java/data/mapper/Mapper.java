package data.mapper;

public interface Mapper<T> {

    T fromRow(int row);

}