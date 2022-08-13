package rikkei.academy.controller;

import rikkei.academy.model.Singer;
import rikkei.academy.service.ISingerService;
import rikkei.academy.service.SingerServiceIMPL;

import java.util.List;

public class SingerController  {
    ISingerService singerService = new SingerServiceIMPL();

    public List<Singer> showSingerList() {
        return singerService.findAll();
    }

    public void addSinger(int age, String name) {
        singerService.save(new Singer(showSingerList().size() + 1, age, name));
    }

    public void editSinger(int id, int age, String name) {
        singerService.edit(id, age, name);
    }

    public void deleteSinger(int id) {

        singerService.deleteById(id);
    }

    public void sortSingerByName() {
        singerService.sortByName();
    }
    public Singer detail(int id){
        Singer singer = singerService.findById(id);
        return singer;
    }

}
