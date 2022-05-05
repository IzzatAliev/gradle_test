package ua.com.alevel.modificator.objectTest;

import ua.com.alevel.modificator.object.Chair;

public class ObjectTMain extends Chair {

    public static void main(String[] args) {
        Chair chair=new Chair();
        System.out.println(chair.publicIsWithBack);
        chair.publicChair();
    }

    @Override
    protected void protectedChair() {
        super.protectedChair();
    }

    @Override
    public void publicChair() {
        super.publicChair();
    }

    @Override
    protected ObjectTMain protectedNewChair() {
        ObjectTMain objectTMain = new ObjectTMain();
        return objectTMain;
    }

    @Override
    public ObjectTMain publicNewChair() {
      ObjectTMain objectTMain = new ObjectTMain();
        return objectTMain;
    }
}
