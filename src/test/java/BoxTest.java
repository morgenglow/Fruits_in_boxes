import org.junit.Test;

import static org.junit.Assert.*;

public class BoxTest {
    @Test
    public void check(){
    Apple apple = new Apple(1.0f);
    Box appleBox = new Box();
    Orange orange = new Orange(1.5f);
    Box orangeBox = new Box();
    appleBox.addFruit(apple);
    orangeBox.addFruit(orange);

        System.out.println("Вес коробки с апельсинами: "+orangeBox.getWeight());
        System.out.println("Вес коробки с яблоками: "+appleBox.getWeight());
        System.out.println("Совпадает ли вес коробок с яблоками и фруктами: "+orangeBox.compare(appleBox));
    }
}