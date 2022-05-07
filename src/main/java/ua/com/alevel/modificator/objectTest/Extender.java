package ua.com.alevel.modificator.objectTest;

public class Extender extends ObjectTMain {

    @Override
    public void protectedChair() {
        super.protectedChair();
    }

    @Override
    public void publicChair() {
        super.publicChair();
    }

    @Override
    protected ObjectTMain protectedNewChair() {
        return super.protectedNewChair();
    }

    @Override
    public ObjectTMain publicNewChair() {
        return super.publicNewChair();
    }
}
