package rikkei.academy.service;

import rikkei.academy.model.Singer;

import java.util.List;

public interface ISingerService {
    List<Singer> findAll();

    void save(Singer singer);

    void edit(int id, int age, String name);

    void deleteById(int id);

    List<Singer> search(String name);

    void sortByName();

    Singer findById(int id);


}