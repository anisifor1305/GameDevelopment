package actions;
import units.Hole;
//Победа
public class Win{    //Деструкция игрового процесса
    //+
    //Запуск хорошего финального видео (насколько хорошего, зависит от оценки Hole (sympathy))
    public void EpicWin(Hole hole){
    if (hole.sympathy==3){
        System.out.println("Это затычка. Игра пройдена на 3 звезды.");
        //Лютейшее видео
    }
    if (hole.sympathy==2){
        System.out.println("Это затычка. Игра пройдена на 2 звезды.");
        //Среднее видео
    }
    if (hole.sympathy==1){
        System.out.println("Это затычка. Игра пройдена на 1 звезду.");
        //Поощрительное видео
    }
}
    
}
