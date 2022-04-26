package ua.com.alevel.experiment;

import ua.com.alevel.experiment.facade.ExperimentFacade;

public class ExperimentMain {

    static ExperimentFacade experimentFacade;

    public static void main(String[] args) {
      ExperimentMain experimentMain = new ExperimentMain();
      experimentMain.adding();
    }
    public void adding(){
        for (int i = 0; i < 100; i++) {
            experimentFacade.add(i,"Samsung"+i, 5000.00, 50+i);
        }

        for (int i = 0; i < 100; i++) {
            experimentFacade.add(i,"Iphone"+i, 6000.00, 50+i);
        }

        for (int i = 0; i < 100; i++) {
            experimentFacade.add(i,"Xiaomi"+i, 7000.00, 50+i);
        }
    }
}
