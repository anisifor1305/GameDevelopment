package subjects;
import units.Hole;
import actions.HoleDeath;
import coords.BetweenPositions;
import coords.Position;

/**
 * particulate - класс сыпучих или жидких веществ. Они могут течь вправо, влево, вниз.
 */
public class Particulate {
    //В данные методы вводится позиция, куда выльется жидкость при откртытии шлюза
    public Position position;
    public Particulate(Position position){
        this.position = position;
    }
    // public boolean isDeath(Position holePosition){
    //     if (this.position == holePosition){
    //         HoleDeath.GameOver();
    //         return true;
    //     }
    //     else{
    //         return false;
    //     }
    // }
    void down(Position position){
        this.position.y--;
    }
    void right(Position position){
        this.position.x++;
    }
    void left(Position position){
        this.position.x--;
    }
}