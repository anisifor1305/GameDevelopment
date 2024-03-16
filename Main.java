/**
 * Main
 */
//Главный метод, т.е. в будущем метод игрового процесса или, по крайней мере, логики игрового процесса.
import units.*;
import subjects.*;

import java.util.Random;

import actions.*;
public class Main {

    public static void main(String[] args) {
        //Пока что здесь реализация всяких затычек. Нужно как минимум сделать координаты блоков
        //(То, что находится межу шлюзами,), определить позиции Hole и всего другого. 
        // По-хорошему необходимо сделать автоматтческое создание карты.
        Random r = new Random();
        Hole hole = new Hole();
        hole.fear();
        Win win = new Win();
        win.EpicWin(hole);
    }

}