package ua.com.alevel.modificator.object;

public class Chair {

    private String privateSize;
    boolean defaultIsWithPillow;
    protected Long protectedCount;
    public boolean publicIsWithBack;

    public Chair() {
    }

    public Chair(String privateSize, boolean defaultIsWithPillow, Long protectedCount, boolean publicIsWithBack) {
        this.privateSize = privateSize;
        this.defaultIsWithPillow = defaultIsWithPillow;
        this.protectedCount = protectedCount;
        this.publicIsWithBack = publicIsWithBack;
    }

    private void privateChair(){
        System.out.println("heavyChair");
    }

    void defaultChair(){
        System.out.println("lightChair");
    }

    protected void protectedChair(){
        System.out.println("middleChair");
    }

    protected Chair protectedNewChair(){
        Chair chair = new Chair();
        return chair;
    }

    public Chair publicNewChair(){
        Chair chair = new Chair();
        return chair;
    }

    public void publicChair(){
        System.out.println("heavyChair");
    }

    @Override
    public String toString() {
        return "\nChair{" +
                "privateSize='" + privateSize + '\'' +
                ", defaultIsWithPillow=" + defaultIsWithPillow +
                ", protectedCount=" + protectedCount +
                ", publicIsWithBack=" + publicIsWithBack +
                '}';
    }

    public String getPrivateSize() {
        return privateSize;
    }

    public void setPrivateSize(String privateSize) {
        this.privateSize = privateSize;
    }

    public boolean isDefaultIsWithPillow() {
        return defaultIsWithPillow;
    }

    public void setDefaultIsWithPillow(boolean defaultIsWithPillow) {
        this.defaultIsWithPillow = defaultIsWithPillow;
    }

    public Long getProtectedCount() {
        return protectedCount;
    }

    public void setProtectedCount(Long protectedCount) {
        this.protectedCount = protectedCount;
    }

    public boolean isPublicIsWithBack() {
        return publicIsWithBack;
    }

    public void setPublicIsWithBack(boolean publicIsWithBack) {
        this.publicIsWithBack = publicIsWithBack;
    }
}
