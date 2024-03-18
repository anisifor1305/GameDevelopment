package units;

import actions.HoleDeath;
import coords.Position;

//Hole - персонаж, которого надо спасти
public class Hole{
    public Position position;
    public Hole(Position startHolePosition){
        this.position = startHolePosition;
    }
    public boolean live = true;
    public int sympathy = 3;
    public boolean isDeath(Position subjectPosition){
        if (this.position.x == subjectPosition.x && this.position.y==subjectPosition.y){
            HoleDeath.GameOver();
            return true;
        }
        else{
            return false;
        }
    }   
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