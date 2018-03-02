package lufei;

public interface Dog {
    public void eat();

    default public void play(){
        System.out.println("我玩的黑开心");
    }
}
