package ua.com.alevel.modificator.object;

public class MainObject {

    public static void main(String[] args) {
      Chair chair = new Chair();
        System.out.println(chair.defaultIsWithPillow);
        System.out.println(chair.protectedCount);
        System.out.println(chair.publicIsWithBack);
        chair.defaultChair();
        chair.protectedChair();
        chair.publicChair();
        chair.defaultNewChair();
    }

}
