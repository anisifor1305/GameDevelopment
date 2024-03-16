package units;
//Hole - персонаж, которого надо спасти
public class Hole{
    public boolean live = true;
    public int sympathy = 3;
    public void fear(){ //Реализация движения, типо бомбит. 
        //Из-за этого симпатия уменьшается, в конченом итоге игра будет пройдена на меньше звёзд.
        sympathy--;
    }
    public void love(){ //Реализация движения. Типо любит.

    }
    public void death(String reason){
        live = false;
    }
}