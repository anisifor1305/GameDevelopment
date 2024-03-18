/**
 * Main
 */
//Главный метод, т.е. в будущем метод игрового процесса или, по крайней мере, логики игрового процесса.
import units.*;
import subjects.*;
import coords.*;

import java.util.Random;


import actions.*;
public class Main {

    public static void main(String[] args) {
        //Пока что здесь реализация всяких затычек. Нужно как минимум сделать координаты блоков
        //UPD: координаты реализованы, но нужно сделать генерацию.----------------------
        //(То, что находится межу шлюзами,), определить позиции Hole и всего другого.  |
        // По-хорошему необходимо сделать автоматтческое создание карты.<---------------
        Position startHolePosition = new Position(1, 2);
        Position lavaPosition = new Position(1, 2);
        Hole hole = new Hole(startHolePosition);
        Lava lava = new Lava(lavaPosition);
        boolean death = hole.isDeath(lava.position);
        System.out.println(death);
    }

}