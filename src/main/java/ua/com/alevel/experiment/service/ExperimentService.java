package ua.com.alevel.experiment.service;

import ua.com.alevel.experiment.entity.Item;
import ua.com.alevel.experiment.entity.Phone;
import ua.com.alevel.experiment.entity.Store;

import java.beans.JavaBean;
import java.util.ArrayList;
import java.util.List;

@JavaBean
public class ExperimentService {

    Store store = new Store();
    static List<Item> list = new ArrayList<>();

    public void add(Phone phone){
        list.add(phone);
        store.setItems(list);
    }

    public void view(){
        System.out.println("list = " + list);
    }
}
