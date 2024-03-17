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
        // Hole hole = new Hole();
        // hole.fear();
        // Win win = new Win();
        // win.EpicWin(hole);
        int a = 1;
        int b = 2;
        Position xy = new Position(a, b); //ПРОБЛЕМА С СОЗДАНИЕМ ЭКЗЕМПЛЯРА КЛАССА!!!
        Guntrap guntrap = new Guntrap(xy);
        System.out.println(guntrap.position.x);
        System.out.println(guntrap.position.y);
        guntrap.replace();
        System.out.println(guntrap.position.x);
        System.out.println(guntrap.position.y);
    }

}