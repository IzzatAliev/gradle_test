package ua.com.alevel.experiment.service;

import ua.com.alevel.experiment.entity.Phone;
import ua.com.alevel.experiment.entity.Store;


public class ExperimentService {

    Store store;

    public void add(Phone phone){
        System.out.println(phone);
        store.getItems().add(phone);
        System.out.println(store);
    }

}
