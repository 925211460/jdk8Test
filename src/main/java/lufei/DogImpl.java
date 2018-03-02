package lufei;

public class DogImpl implements Dog {
    @Override
    public void eat() {
        System.out.println("好好吃啊");
    }

    @Override
    public void play() {
        System.out.println("我玩的黑不开心");
    }
}
