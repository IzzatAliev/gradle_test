package ua.com.alevel.experiment.facade;

import ua.com.alevel.experiment.entity.Phone;
import ua.com.alevel.experiment.service.ExperimentService;

public class ExperimentFacade {

    ExperimentService experimentService;

    public void add(Integer id, String name, Double price, Integer count){
        Phone phone = new Phone();
        phone.setId(id);
        phone.setName(name);
        phone.setPrice(price);
        phone.setCount(count);
        experimentService.add(phone);
    }
}
