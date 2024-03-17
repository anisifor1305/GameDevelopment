package subjects;

import coords.Position;

//Ловушка. Снаряд летит, пока не ударится о шлюз или стену
//Убивает Hole, если попадает
public class Guntrap{
    public Position position;
    public Guntrap(Position position){
        this.position = position;
    }
    void shoot(){
        
    }
    public void replace(){ //Метод чисто для отладки. Ничего общего с игрой не имеет.
        position.change();;
    }
}
