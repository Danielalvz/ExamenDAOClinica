package dao;

import model.Odontologo;

import java.util.List;

public interface iDao<T> {
    T guardar(T t);
    List<T> buscarTodos();

}
